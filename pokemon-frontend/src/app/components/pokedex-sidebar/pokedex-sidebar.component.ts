import { Component, OnInit } from '@angular/core';
import { PokemonSlim } from 'src/app/models/pokemon-slim.model';
import { PokemonServiceService } from 'src/app/services/pokemon-service.service';

@Component({
  selector: 'app-pokedex-sidebar',
  templateUrl: './pokedex-sidebar.component.html',
  styleUrls: ['./pokedex-sidebar.component.css']
})
export class PokedexSidebarComponent implements OnInit {

  pokemonList: Array<PokemonSlim>;
  pokemonSidebarList: Array<PokemonSlim>;
  pageOffset: number = 0;
  constructor(
    private pokemonService: PokemonServiceService
  ) {
    this.pokemonList = [];
    this.pokemonSidebarList = [];
  }

  ngOnInit(): void {
    this.pokemonService.getPokemonList().subscribe(dataResult => {
      dataResult.results.forEach((entry: { url: string; name: string; }) => {
        this.pokemonList.push(new PokemonSlim(
          Number(this.parseIdFromUrl(entry.url)),
          entry.name,
          entry.url,
          "../../../assets/images/pokemonSprites/" + this.parseIdFromUrl(entry.url) + ".png"
        ));
      });
      // for(let i = this.pageOffset; i < (this.pageOffset + 10); i++) {
      //     this.pokemonSidebarList.push(this.pokemonList[i]);
      //   }
      this.populateSidebar();
      console.log(this.pokemonList);
      console.log(this.pokemonSidebarList);
    });
  }

  parseIdFromUrl(url: string): string {
    let slicedUrl: string = url.replace("https://pokeapi.co/api/v2/pokemon/", "").replace("/","");
    return slicedUrl;
  }

  increaseOffsetBy10(): void {
    this.pageOffset < 1108 ? this.pageOffset += 10 : this.pageOffset = 1106;
    this.populateSidebar();
    console.log(this.pageOffset);
  }
  increaseOffsetBy100(): void {
    this.pageOffset < 1018 ? this.pageOffset += 100 : this.pageOffset = 1016;
    this.populateSidebar();
    console.log(this.pageOffset);
  }
  decreaseOffsetBy10(): void {
    this.pageOffset > 10 ? this.pageOffset -= 10 : this.pageOffset = 0;
    this.populateSidebar();
    console.log(this.pageOffset);
  }
  decreaseOffsetBy100(): void {
    this.pageOffset > 100 ? this.pageOffset -= 100 : this.pageOffset = 0;
    this.populateSidebar();
    console.log(this.pageOffset);
  }

  populateSidebar(): void {
    this.pokemonSidebarList = [];
    for(let i = this.pageOffset; i < (this.pageOffset + 10); i++) {
      this.pokemonSidebarList.push(this.pokemonList[i]);
    }
  }

}

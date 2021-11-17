import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { PokemonSlim } from '../models/pokemon-slim.model';
import { Pokemon } from '../models/pokemon.model';

@Injectable({
  providedIn: 'root'
})
export class PokemonServiceService {

  readonly backEndBaseUrl = 'http://localhost:8080';

  readonly pokeApiBaseUrl = 'https://pokeapi.co'

  getPokemonList(): Observable<any> {
    return this.http.get<any>(this.pokeApiBaseUrl + "/api/v2/pokemon?limit=1118&offset=0");
  }

  getActualPokemon(): Observable<Pokemon> {
    return this.http.get<Pokemon>(this.pokeApiBaseUrl + "/api/v2/pokemon/");
  }

  constructor(private http: HttpClient) { }
}

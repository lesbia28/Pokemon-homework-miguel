import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { NavbarComponent } from './components/navbar/navbar.component';
import { PokedexPageComponent } from './components/pokedex-page/pokedex-page.component';
import { TrainersPageComponent } from './components/trainers-page/trainers-page.component';
import { TeamsPageComponent } from './components/teams-page/teams-page.component';
import { PokedexSearchComponent } from './components/pokedex-search/pokedex-search.component';
import { PokedexSidebarComponent } from './components/pokedex-sidebar/pokedex-sidebar.component';
import { PokedexMainComponent } from './components/pokedex-main/pokedex-main.component';
import { TrainersFormComponent } from './components/trainers-form/trainers-form.component';
import { TrainersCarouselComponent } from './components/trainers-carousel/trainers-carousel.component';
import { TrainersCardComponent } from './components/trainers-card/trainers-card.component';
import { TeamsFormComponent } from './components/teams-form/teams-form.component';
import { TeamsCarouselComponent } from './components/teams-carousel/teams-carousel.component';
import { TeamsPokecardComponent } from './components/teams-pokecard/teams-pokecard.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    PokedexPageComponent,
    TrainersPageComponent,
    TeamsPageComponent,
    PokedexSearchComponent,
    PokedexSidebarComponent,
    PokedexMainComponent,
    TrainersFormComponent,
    TrainersCarouselComponent,
    TrainersCardComponent,
    TeamsFormComponent,
    TeamsCarouselComponent,
    TeamsPokecardComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

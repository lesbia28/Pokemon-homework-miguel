import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { PokedexPageComponent } from './components/pokedex-page/pokedex-page.component';
import { TeamsPageComponent } from './components/teams-page/teams-page.component';
import { TrainersPageComponent } from './components/trainers-page/trainers-page.component';

const routes: Routes = [
  {
    path: 'pokedex',
    component: PokedexPageComponent,
  },
  {
    path: 'trainers',
    component: TrainersPageComponent,
  },
  {
    path: 'teams',
    component: TeamsPageComponent,
  },
  {
    path: '**',
    component: PokedexPageComponent,
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

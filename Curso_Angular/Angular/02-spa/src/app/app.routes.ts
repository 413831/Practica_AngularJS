import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { AboutComponent } from './components/about/about.component';
import { HeroesComponent } from './components/heroes/heroes.component';
import { HeroeComponent } from './componentes/heroe/heroe.component';

export const ROUTES: Routes = [
    { path: '', component: HomeComponent},
    { path : 'home', component: HomeComponent},
    { path : 'about', component: AboutComponent},
    { path: 'heroe/:id', component: HeroeComponent},
    { path : 'heroes', component: HeroesComponent},
    { path: '**' , pathMatch: 'full', redirectTo: 'home'}
];

export const ROUTING = RouterModule.forRoot(ROUTES)
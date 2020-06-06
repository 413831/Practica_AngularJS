import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

// Rutas
import { ROUTING } from "./app.routes";

// Servicios
import { HeroesService } from './servicios/heroes.service';

// Componentes
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/shared/navbar/navbar.component';
import { HomeComponent } from './components/home/home.component';
import { AboutComponent } from './components/about/about.component';
import { HeroesComponent } from './components/heroes/heroes.component';
import { HeroeComponent } from './componentes/heroe/heroe.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    HomeComponent,
    AboutComponent,
    HeroesComponent,
    HeroeComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ROUTING,
  ],
  providers: [HeroesService],
  bootstrap: [AppComponent]
})
export class AppModule { }

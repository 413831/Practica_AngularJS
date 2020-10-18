import { Component, OnInit } from '@angular/core';
import { Pelicula, RespuestaMDB } from '../interfaces/interfaces';
import { MovieService } from '../services/movie.service';

@Component({
  selector: 'app-tab1',
  templateUrl: 'tab1.page.html',
  styleUrls: ['tab1.page.scss']
})
export class Tab1Page implements OnInit{ 
  peliculasRecientes: Pelicula[] = [];
  populares: Pelicula[] = [];
  
  constructor(private movieService: MovieService) {}

  ngOnInit(): void 
  {
    this.movieService.getRecientes()
        .subscribe( (resp) => {
          console.log('Respuesta',resp);
          this.peliculasRecientes = resp.results;
        });
    this.getPopulares();
    
  }

  cargarMas()
  {
    this.getPopulares();
  }

  getPopulares()
  {
    this.movieService.getPopulares()
        .subscribe( resp => {
          const arrayAux = [...this.populares, ...resp.results];
          this.populares = arrayAux;
        })  
  }

}

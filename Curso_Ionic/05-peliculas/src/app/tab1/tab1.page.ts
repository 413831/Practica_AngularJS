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
  slidesOptions = {
    slidesPerView: 1.3,
    freeMode: true
  };

  constructor(private movieService: MovieService) {}

  ngOnInit(): void {
    this.movieService.getRecientes()
                    .subscribe( (resp) => {
                      console.log('Respuesta',resp);
                      this.peliculasRecientes = resp.results;
                    });
    
  }

}

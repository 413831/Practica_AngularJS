import { Component, Input, OnInit } from '@angular/core';
import { ModalController } from '@ionic/angular';
import { Cast, Creditos, DetallePelicula } from 'src/app/interfaces/interfaces';
import { MovieService } from 'src/app/services/movie.service';

@Component({
  selector: 'app-detalle',
  templateUrl: './detalle.component.html',
  styleUrls: ['./detalle.component.scss'],
})
export class DetalleComponent implements OnInit {
  @Input() id;
  pelicula: DetallePelicula = {};
  actores: Cast[]; 
  maximoTexto = 150;
  slideOptsActores = {    
    slidesPerView: 3.3,
    freeMode: true,
    spaceBetween: -5,
  }

  constructor(private movieService: MovieService, private modalCtrl: ModalController) { }

  ngOnInit() 
  {
    this.movieService.getPeliculaDetalle(this.id)
        .subscribe( resp => {
          console.log(resp);
          this.pelicula = resp;
        });
    
    this.movieService.getActores(this.id)
        .subscribe( resp => {
          console.log(resp);
          this.actores = resp.cast;
        });   
  }

  verMas()
  {
    this.maximoTexto = 1000;
  }

  regresar()
  {
    this.modalCtrl.dismiss();
  }

  guardarFavorito()
  {
    
  }

}

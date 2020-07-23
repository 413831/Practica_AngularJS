import { Component } from '@angular/core';
import { WishlistService } from 'src/app/services/wishlist.service';
import { Router } from '@angular/router';
import { AlertController } from '@ionic/angular';

@Component({
  selector: 'app-tab1',
  templateUrl: 'tab1.page.html',
  styleUrls: ['tab1.page.scss']
})
export class Tab1Page {

  constructor(public wishlist: WishlistService, 
              private router: Router,
              private alertControl: AlertController) {}

 async agregarLista()
  {
    const alert = await this.alertControl.create({
      header: 'Crear lista',
      inputs: [
        {
          name: 'titulo',
          type: 'text',
          placeholder: 'Nombre de la lista'
        }
      ],
      buttons: [
        {
          text: 'Cancelar',
          role: 'cancel',
          handler: () =>{
            console.log("Cancelar");
          }
        },
        {
          text: 'Crear',
          handler: ( data ) =>{
            console.log(data);
            if( data.titulo.length == 0)
            {
              return;
            }
            const listaId = this.wishlist.crearLista(data.titulo);
            console.log(listaId);
            this.router.navigateByUrl(`/tabs/tab1/agregar/${listaId}`);
          } 
        }
      ]
    });

    alert.present();
  }

}

import { Component, Input, ViewChild } from '@angular/core';
import { WishlistService } from 'src/app/services/wishlist.service';
import { Router } from '@angular/router';
import { Lista } from 'src/app/models/lista.model';
import { AlertController, IonList } from '@ionic/angular';

@Component({
  selector: 'app-listas',
  templateUrl: './listas.component.html',
  styleUrls: ['./listas.component.scss'],
})
export class ListasComponent{
  @ViewChild( IonList ) lista: IonList;
  @Input() terminada = true;

  constructor(public wishlist: WishlistService, 
              private router: Router,
              private alertControl: AlertController) { }


  listaSeleccionada(lista: Lista)
  {
    if(this.terminada)
    {
      this.router.navigateByUrl(`/tabs/tab2/agregar/${lista.id}`);
    }
    else
    {
      this.router.navigateByUrl(`/tabs/tab1/agregar/${lista.id}`);
    }
  }

  borrar(lista: Lista)
  {
    this.wishlist.borrarLista(lista);
  }

  async modificar(lista: Lista)
  {
    const alert = await this.alertControl.create({
      header: 'Editar lista',
      inputs: [
        {
          name: 'titulo',
          type: 'text',
          value: lista.titulo,
          placeholder: 'Nombre de la lista'
        }
      ],
      buttons: [
        {
          text: 'Cancelar',
          role: 'cancel',
          handler: () =>{
            console.log("Cancelar");
            this.lista.closeSlidingItems();
          }
        },
        {
          text: 'Editar',
          handler: ( data ) =>{
            if(lista.titulo.length === 0)
            {
              return;
            }
            lista.titulo = data.titulo;
            this.wishlist.guardarStorage();
            this.lista.closeSlidingItems();
          } 
        }
      ]
    });

    alert.present();
  }
}

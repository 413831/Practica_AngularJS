import { Component, OnInit, Input, ElementRef, ViewChild, AfterViewInit } from '@angular/core';
import { Article } from 'src/app/interfaces/interfaces';

import { InAppBrowser } from '@ionic-native/in-app-browser/ngx';
import { SocialSharing } from '@ionic-native/social-sharing/ngx';

import { ActionSheetController, AnimationController, ToastController } from '@ionic/angular';
import { DataLocalService } from 'src/app/services/data-local.service';
import { createAnimation, Animation } from '@ionic/core';




@Component({
  selector: 'app-noticia',
  templateUrl: './noticia.component.html',
  styleUrls: ['./noticia.component.scss'],
})
export class NoticiaComponent implements OnInit {
  @Input() noticia: Article;
  @Input() numeroNoticia: number;
  @Input() enFavoritos;

  @ViewChild("noticia", { read: ElementRef, static: true }) tarjeta: ElementRef


  constructor(private iab: InAppBrowser, 
              private actionSheetCtrl: ActionSheetController,
              private socialSharing: SocialSharing,
              private dataLocalService: DataLocalService,
              private toastCtrl: ToastController) { }

  ngOnInit() { }



  abrirNoticia() {
    const browser = this.iab.create(this.noticia.url, '_system');
  }

  async verMenu() {

    let botonGenerado;

    if(this.enFavoritos)
    {
      botonGenerado =  {
        text: 'Borrar Favorito',
        icon: 'trash',
        handler: () => {
          console.log('Borrar de favoritos');
          this.dataLocalService.borrarNoticia(this.noticia);
          this.presentToast("Borrado de favoritos");
        }
      }

    }
    else
    {
      botonGenerado =  {
        text: 'Favoritos',
        icon: 'star',
        handler: () => {
          console.log('Agregado a favoritos');
          this.dataLocalService.guardarNoticia(this.noticia);
          this.presentToast("Agregado a favoritos");
        }
      }
    }


    const actionSheet = await this.actionSheetCtrl.create({
      buttons: [
        {
          text: 'Compartir',
          icon: 'share',
          handler: () => {
            console.log('Share clicked');
            this.socialSharing.share(
              this.noticia.title, 
              this.noticia.source.name,
              null,
              this.noticia.url
            );
          }
        },
        botonGenerado,
        {
          text: 'Cancelar',
          icon: 'close',
          role: 'cancel',
          handler: () => {
            console.log('Cancel clicked');
          }
        }]
    });
    await actionSheet.present();
  }

  async presentToast(message: string) {
    const toast = await this.toastCtrl.create({
      message,
      duration: 2000
    });
    toast.present();
  }

  
}

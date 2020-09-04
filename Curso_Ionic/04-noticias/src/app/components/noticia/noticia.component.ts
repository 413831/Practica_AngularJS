import { Component, OnInit, Input } from '@angular/core';
import { Article } from 'src/app/interfaces/interfaces';

import { InAppBrowser } from '@ionic-native/in-app-browser/ngx';
import { SocialSharing } from '@ionic-native/social-sharing/ngx';

import { ActionSheetController } from '@ionic/angular';
import { DataLocalService } from 'src/app/services/data-local.service';

@Component({
  selector: 'app-noticia',
  templateUrl: './noticia.component.html',
  styleUrls: ['./noticia.component.scss'],
})
export class NoticiaComponent implements OnInit {
  @Input() noticia: Article;
  @Input() numeroNoticia: number;

  constructor(private iab: InAppBrowser, 
              private actionSheetCtrl: ActionSheetController,
              private socialSharing: SocialSharing,
              private dataLocalService: DataLocalService) { }

  ngOnInit() { }

  abrirNoticia() {
    const browser = this.iab.create(this.noticia.url, '_system');
  }

  async verMenu() {
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
        {
          text: 'Favoritos',
          icon: 'star',
          handler: () => {
            console.log('Agregado a favoritos');
            this.dataLocalService.guardarNoticia(this.noticia);
          }
        }, 
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



}

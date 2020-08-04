import { Component, OnInit, ViewChild } from '@angular/core';
import { DataService } from 'src/app/services/data.service';
import { Observable } from 'rxjs';
import { IonList, ToastController } from '@ionic/angular';

@Component({
  selector: 'app-list',
  templateUrl: './list.page.html',
  styleUrls: ['./list.page.scss'],
})
export class ListPage implements OnInit {
  users:Observable<any>;

  @ViewChild('lista', { static: false}) lista: IonList;

  constructor(private dataService: DataService,
              private toastCtrl: ToastController) { }

  ngOnInit() {
    this.users = this.dataService.getUsers();    
  }

  async presentToast(message: string) {
    const toast = await this.toastCtrl.create({
      message,
      duration: 2000
    });
    toast.present();
  }

  share(usuario)
  {
    // console.log('Share',usuario);
    this.presentToast("Compartido");
    this.lista.closeSlidingItems();
  }

  favorite(usuario)
  { 
    // console.log('Favorite',usuario);
    this.presentToast("Se guardó en favorito");
    this.lista.closeSlidingItems();
  }

  borrar(usuario)
  { 
    // console.log('Borrar',usuario);
    this.presentToast("Se ha eliminado");
    this.lista.closeSlidingItems();
  }

}

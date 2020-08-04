import { Component, OnInit } from '@angular/core';
import { ModalController } from '@ionic/angular';
import { ModalInfoPage } from '../modal-info/modal-info.page';

@Component({
  selector: 'app-modal',
  templateUrl: './modal.page.html',
  styleUrls: ['./modal.page.scss'],
})
export class ModalPage implements OnInit {

  constructor(private modalCtrl: ModalController) { }

  ngOnInit() {
  }

  async toggleModal()
  {
    const modal = await this.modalCtrl.create({
      component: ModalInfoPage,
      cssClass: 'my-custom-class',
      componentProps: {
        'nombre': 'Pepito',
        'pais': 'Uruguay'
      }
    });

    await modal.present();

    const { data } = await modal.onDidDismiss();

    console.log('Retorno del modal', data);
  }


}

import { Component, ElementRef, ViewChild } from '@angular/core';
import { IonSearchbar } from '@ionic/angular';

@Component({
  selector: 'app-tab2',
  templateUrl: 'tab2.page.html',
  styleUrls: ['tab2.page.scss']
})
export class Tab2Page {
  textoBuscar: string;
  ideas: string[] = ["Avengers", "Batman", "Titanic", "El Señor de los Anillos"];

  @ViewChild(IonSearchbar, {static: false}) buscador: ElementRef<IonSearchbar>;

  constructor() {}

  buscar(event)
  {
    const value = event.detail.value;
  }

  seleccionar(idea: string)
  {
    console.log(this.buscador);

  }

}

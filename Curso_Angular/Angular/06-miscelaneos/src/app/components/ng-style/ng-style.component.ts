import { Component, OnInit } from '@angular/core';
import { faPlus, faMinus } from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'app-ng-style',
  template: `
    <p [style.fontSize.px]="tamano">
      Hola mundo... esta es una etiqueta
    </p>

    <button class="btn btn-primary" (click)="tamano = tamano + 5">
    <fa-icon [icon]="this.faPlus"></fa-icon>
    </button>

    <button class="btn btn-primary" (click)="tamano = tamano - 5">
    <fa-icon [icon]="this.faMinus"></fa-icon>
    </button>
  `,
  styles: [
  ]
})
export class NgStyleComponent implements OnInit {
  tamano:number = 10;  
  faPlus = faPlus;
  faMinus = faMinus;

  constructor() { }

  ngOnInit(): void {
  }

}

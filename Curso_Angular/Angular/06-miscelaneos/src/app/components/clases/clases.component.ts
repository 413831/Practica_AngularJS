import { Component, OnInit } from '@angular/core';
import {faSave} from '@fortawesome/free-solid-svg-icons';
import {faSync} from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'app-clases',
  templateUrl: './clases.component.html',
  styles: [
  ]
})
export class ClasesComponent implements OnInit {
  alerta:string = "alert-danger";
  propiedades = {
    danger: false
  };
  faSave = faSave;
  faSpinner = faSync;
  loading = false;

  constructor() { }

  ngOnInit(): void {
  }

  ejecutar()
  {
    this.loading = true;
    setTimeout(() => this.loading = false, 3000);
  }

}

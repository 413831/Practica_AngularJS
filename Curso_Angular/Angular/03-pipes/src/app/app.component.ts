import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  nombre    : string = 'Capitan America';
  nombre2   : string = 'pEpiTO gONzaLEz';
  arreglo   : number[] = [1,2,3,4,5,6,7,8,9,10];
  PI        : number = Math.PI;
  porcentaje: number = 0.125;
  salario: number = 1234.5;
  fecha: Date = new Date();
  idioma: string = "es-ES";
  video: string = 'https://www.youtube.com/embed/6KLoqxzyEi4';
  activar: boolean = true;
  
  valorPromesa = new Promise<string>( resolve =>{
    setTimeout(()=>{
      resolve('Llego la data');
    },4500);
  })

  heroe = {
    nombre: 'Logan',
    clave: 'Wolverine',
    edad: 30,
    direccion: {
      calle: 'Primera',
      casa: 20
    }
  }
}

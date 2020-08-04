import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filtro'
})
export class FiltroPipe implements PipeTransform {

  transform( arreglo: any[], texto: string, columna: string): any[] {

    if(texto === '')
    {
      return arreglo;
    }

    texto = texto.toLowerCase();

    return arreglo.filter( elemento => elemento[columna].toLowerCase().includes(texto));
  }

}

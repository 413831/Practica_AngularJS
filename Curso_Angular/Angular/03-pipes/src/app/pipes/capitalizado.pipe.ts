import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'capitalizado'
})
export class CapitalizadoPipe implements PipeTransform {

  transform( value: string, todas: boolean = true ): string {
    value = value.toLocaleLowerCase();
    let palabras = value.split(' ');

    if(todas)
    {
      palabras = palabras.map( palabra => palabra[0].toUpperCase().concat(palabra.substr(1)));
    }
    else
    {
      palabras[0] = palabras[0][0].toUpperCase().concat(palabras[0].substr(1));
    }
    return palabras.join(' ');
  }

}

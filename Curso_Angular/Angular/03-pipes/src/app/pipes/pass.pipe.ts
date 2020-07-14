import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'pass'
})
export class PassPipe implements PipeTransform {

  transform(value: string, activar: boolean): string {
    let palabra = Array.from(value);
    let codificado;
    if(activar)
    {
      palabra = palabra.map(letra => letra = '*');
    }
    return palabra.join('');
  }

}

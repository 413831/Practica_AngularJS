import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'pass'
})
export class PassPipe implements PipeTransform {

  transform(value: string, activar: boolean = false): string {
    return (activar) ? '*'.repeat(value.length) : value;
  }

}

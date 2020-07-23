import { Pipe, PipeTransform } from '@angular/core';
import { Lista } from '../models/lista.model';

@Pipe({
  name: 'completado',
  pure: false
})
export class CompletadoPipe implements PipeTransform {

  transform( listas: Lista[], completada: boolean = true): Lista[] {    
    return listas.filter( lista => lista.terminada === completada);
  }

}

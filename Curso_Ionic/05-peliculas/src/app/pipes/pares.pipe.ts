import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'pares'
})
export class ParesPipe implements PipeTransform {

  transform(array: any[], ...args: unknown[]): unknown 
  {
    const pares = array.reduce( (result, value, index, array) =>{

      if(index % 2 === 0)
      {
        result.push(array.slice(index, index+2));
      }
      return result
    },[]);

    return pares;
  }

}

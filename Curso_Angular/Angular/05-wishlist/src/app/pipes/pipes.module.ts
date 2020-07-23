import { NgModule } from '@angular/core';
import { CompletadoPipe } from './completado.pipe';


@NgModule({
  declarations: [CompletadoPipe],
  exports: [CompletadoPipe]
})
export class PipesModule { }

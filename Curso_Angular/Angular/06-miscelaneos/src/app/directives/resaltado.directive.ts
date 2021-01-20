import { Directive, ElementRef, HostListener, Input } from '@angular/core';

@Directive({
  selector: '[appResaltado]'
})
export class ResaltadoDirective {
  @Input("appResaltado") color:string;

  constructor(private el: ElementRef) { 
    console.log("Directiva llamada");
  }
  
  @HostListener('mouseenter') mouseEnter()
  {
    this.resaltar( this.color || 'yellow' );
  }

  @HostListener('mouseleave') mouseLeave()
  {
    this.resaltar(null);
  }
  
  private resaltar( color:string )
  {
    this.el.nativeElement.style.backgroundColor = color;
  }
}

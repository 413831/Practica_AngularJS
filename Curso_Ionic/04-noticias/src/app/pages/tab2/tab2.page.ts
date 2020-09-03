import { Component, OnInit, ViewChild } from '@angular/core';
import { IonSegment } from '@ionic/angular';
import { NoticiasService } from 'src/app/services/noticias.service';
import { Article } from 'src/app/interfaces/interfaces';

@Component({
  selector: 'app-tab2',
  templateUrl: 'tab2.page.html',
  styleUrls: ['tab2.page.scss']
})
export class Tab2Page implements OnInit{
  categorias: string[] = ["business", "entertainment", "general", "health", 
  "science", "sports", "technology"];
  noticias: Article[] = [];

  @ViewChild(IonSegment, {static: true}) segment: IonSegment;

  constructor(private noticiasService: NoticiasService) {}

  ngOnInit()
  {
    this.segment.value = this.categorias[2];
    this.cargarNoticias(this.segment.value);
  }

  cambiarCategoria(event)
  {
    this.noticias = [];

    this.cargarNoticias(event.detail.value);
  }

  cargarNoticias(categoria: string, event?)
  {
    this.noticiasService.getTopheadlinesCategorias(categoria)
                        .subscribe( response =>{
                          this.noticias.push(...response.articles);

                          if(event)
                          {
                            event.target.complete();
                          }
                        });
  }

  loadData(event)
  {
    this.cargarNoticias(this.segment.value, event);
  }

}

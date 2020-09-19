import { Component, OnInit } from '@angular/core';
import { NoticiasService } from 'src/app/services/noticias.service';
import { TopHeadlines, Article } from 'src/app/interfaces/interfaces';
import { ToastController } from '@ionic/angular';

@Component({
  selector: 'app-tab1',
  templateUrl: 'tab1.page.html',
  styleUrls: ['tab1.page.scss']
})
export class Tab1Page implements OnInit{
  noticias: Article[] = [];

  constructor(private noticiasService : NoticiasService, private toastCtrl: ToastController) {}

  ngOnInit()
  {
    this.cargarNoticias();

  }

  loadData(event)
  {
    this.cargarNoticias(event);
  }

  cargarNoticias(event?)
  {
    this.noticiasService.getTopHeadlines()
                        .subscribe( response => {

                          if(response.articles.length == 0)
                          {
                            event.target.disabled = true;
                            event.target.complete();
                            return;
                          }

                          this.noticias.push( ...response.articles);

                          if(event)
                          {
                            event.target.complete();
                          }
                        });
  }


}

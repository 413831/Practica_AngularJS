import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { WishlistService } from 'src/app/services/wishlist.service';
import { Lista } from 'src/app/models/lista.model';
import { ListaItem } from 'src/app/models/lista-items.model';

@Component({
  selector: 'app-agregar',
  templateUrl: './agregar.page.html',
  styleUrls: ['./agregar.page.scss'],
})
export class AgregarPage implements OnInit {
  lista: Lista;
  nombreItem: string = "";

  constructor(private wishlist: WishlistService,
              private route: ActivatedRoute) 
  {
    const listaId = this.route.snapshot.paramMap.get('listaId');

    this.lista = this.wishlist.obtenerLista(listaId);
    console.log(this.lista);
  }

  ngOnInit() {
  }

  agregarItem()
  {
    if( this.nombreItem.length == 0 )
    {
      return; 
    }
    const nuevoItem = new ListaItem(this.nombreItem);
    this.lista.items.push(nuevoItem);
    this.wishlist.guardarStorage();

    this.nombreItem = "";
  } 

  cambioCheck(item: ListaItem)
  {
    const pendientes = this.lista.items.filter( item => !item.completado).length;

    if(pendientes === 0)
    {
      this.lista.finishedAt = new Date();
      this.lista.terminada = true;
    }
    else
    {
      this.lista.finishedAt = null;
      this.lista.terminada = false;
    }

    this.wishlist.guardarStorage();
  }

  borrar(i: number)
  {
    this.lista.items.splice(i,1);
    this.wishlist.guardarStorage();
  }

}

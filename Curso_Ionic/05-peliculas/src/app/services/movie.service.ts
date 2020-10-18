import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { RespuestaMDB, DetallePelicula, Creditos } from '../interfaces/interfaces';
import { environment } from '../../environments/environment';

const URL = environment.url;
const apiKey = environment.apiKey;

@Injectable({
  providedIn: 'root'
})
export class MovieService {
  private popularesPage = 0;

  constructor(private http: HttpClient) { }

  private ejecutarQuery<T>(query: string)
  {
    query = URL + query;
    query += `&api_key=${apiKey}&language=es&include_image_language=es`;

    return this.http.get<T>(query);
  }

  getRecientes()
  {
    const hoy = new Date();
    const ultimoDia = new Date( hoy.getFullYear(), hoy.getMonth() + 1, 0).getDate();
    const mes = hoy.getMonth() + 1;
    let mesString;
    let inicio;
    let fin;

    if( mes < 10 )
    {
      mesString = '0' + mes;
    }
    else
    {
      mesString = mes;
    }

    inicio = `${hoy.getFullYear()}-${mesString}-01`;
    fin = `${hoy.getFullYear()}-${mesString}-${ultimoDia}`;

    return this.ejecutarQuery<RespuestaMDB>(`/discover/movie?primary_release_date.gte=${inicio}&primary_release_date.lte=${fin}`);
  }

  getPopulares()
  {
    this.popularesPage++;

    const query = `/discover/movie?sort_by=popularity.desc&page=${this.popularesPage}`;

    return this.ejecutarQuery<RespuestaMDB>(query);
  }

  getPeliculaDetalle(id: string)
  {
    return this.ejecutarQuery<DetallePelicula>(`/movie/${id}?a=1`);
  }

  getActores(id: string)
  {
    return this.ejecutarQuery<Creditos>(`/movie/${id}/credits?a=1`);
  }

}


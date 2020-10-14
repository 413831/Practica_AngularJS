import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { TopHeadlines } from '../interfaces/interfaces';
import { environment } from 'src/environments/environment';

const apiKey = environment.apiKey;
const apiUrl = environment.apiUrl;
const headers = new HttpHeaders({
  'X-Api-key': apiKey,
  'Authorization': apiKey
});

@Injectable({
  providedIn: 'root'
})
export class NoticiasService {
  private headlinesNumber = 0;
  private categoriaActual;
  private categoriaPage = 0;

  constructor(private http: HttpClient) { }

  private ejecutarQuery<T>(query: string)
  {
    query = apiUrl + query;

    return this.http.get<T>(query, {headers})
  }

  getTopHeadlines()
  {
    this.headlinesNumber++;
    //return this.http.get<TopHeadlines>(`http://newsapi.org/v2/top-headlines?country=ar&apiKey=a3bf9b7003e044e1a9bbec0dc4e56e1d`);
    return this.ejecutarQuery<TopHeadlines>(`/top-headlines?country=ar&page=${this.headlinesNumber}`);
  }

  getTopheadlinesCategorias(categoria: string)
  {
    if(this.categoriaActual == categoria)
    {
      this.categoriaPage++;
    }
    else
    {
      this.categoriaPage = 1;
      this.categoriaActual = categoria;
    }

    //return this.http.get(`http://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=a3bf9b7003e044e1a9bbec0dc4e56e1d`)
    return this.ejecutarQuery<TopHeadlines>(`/top-headlines?country=ar&category=${categoria}&page=${this.categoriaPage}`);
  }
}

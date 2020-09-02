import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { TopHeadlines } from '../interfaces/interfaces';
import { environment } from 'src/environments/environment';

const apiKey = environment.apiKey;
const apiUrl = environment.apiUrl;
const headers = new HttpHeaders({
  'X-Api-key': apiKey,
});

@Injectable({
  providedIn: 'root'
})
export class NoticiasService {

  constructor(private http: HttpClient) { }

  private ejecutarQuery<T>(query: string)
  {
    query = apiUrl + query;

    return this.http.get<T>(query, {headers})
  }

  getTopHeadlines()
  {
    //return this.http.get<TopHeadlines>(`http://newsapi.org/v2/top-headlines?country=ar&apiKey=a3bf9b7003e044e1a9bbec0dc4e56e1d`);
    return this.ejecutarQuery<TopHeadlines>(`/top-headlines?country=ar`);
  }

  getTopheadlinesCategorias(categoria: string)
  {
    //return this.http.get(`http://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=a3bf9b7003e044e1a9bbec0dc4e56e1d`)
    return this.ejecutarQuery<TopHeadlines>(`/top-headlines?country=ar&category=${categoria}`);
  }
}

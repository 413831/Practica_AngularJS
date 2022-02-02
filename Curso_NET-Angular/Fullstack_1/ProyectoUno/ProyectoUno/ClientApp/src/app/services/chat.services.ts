import { Injectable, Inject } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Message, Response } from '../interfaces/interfaces';
import { Observable } from 'rxjs/Observable';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json',
    'Authorization':'my-auth-token'
  })
}

@Injectable({
  providedIn : 'root'
})
export class ChatService {
  apiUrl: string = "api/Chat/";
  baseUrl: string;

  constructor(private http: HttpClient, @Inject("BASE_URL") baseUrl: string) {
    this.baseUrl = baseUrl;
  }

  public getMessages(): Observable<Message[]>
  {
    return this.http.get<Message[]>(this.baseUrl + "api/Chat/Messages");
  }

  public add(name: String, text: String)
  {
    this.http.post<Response>(this.baseUrl + "api/Chat/Add", { 'Name': name, 'Text': text }, httpOptions).
        subscribe(result =>
        {
          console.log(result);
        },
        error => console.error(error));
  }
}

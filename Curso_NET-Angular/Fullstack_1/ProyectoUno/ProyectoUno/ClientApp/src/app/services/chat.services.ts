import { Injectable, Inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Message } from '../interfaces/interfaces';
import { Observable } from 'rxjs/Observable';

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
}

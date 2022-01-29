import { Component, Inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ChatService } from '../services/chat.services';
import { Message } from '../interfaces/interfaces';
import { Observable } from 'rxjs/Observable';

@Component({
  selector: 'chat-app',
  templateUrl: './chat.component.html'
})
export class ChatComponent
{
  public listMessages: Observable<Message[]>;

  constructor(protected chatService: ChatService)
  {
    this.getInfo();
  }

  public getInfo()
  {
    this.listMessages = this.chatService.getMessages();
  }
}

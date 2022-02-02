import { Component, Inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { FormControl } from '@angular/forms';
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

  nameControl = new FormControl('');
  textControl = new FormControl('');

  constructor(protected chatService: ChatService)
  {
    this.getInfo();
  }

  public getInfo()
  {
    this.listMessages = this.chatService.getMessages();
  }

  public sendMessage()
  {
    this.chatService.add(this.nameControl.value, this.textControl.value);

    setTimeout(() => {
      this.getInfo();
    }, 3000);

    this.textControl.setValue('');
  }
}

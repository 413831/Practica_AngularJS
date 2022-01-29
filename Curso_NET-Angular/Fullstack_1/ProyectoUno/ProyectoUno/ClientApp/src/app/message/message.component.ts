import { Component, Input } from '@angular/core'
import { Message } from '../interfaces/interfaces'

@Component({
  selector: 'message-app',
  templateUrl: './message.component.html'
})
export class MessageComponent
{
  @Input() message: Message;

  
}

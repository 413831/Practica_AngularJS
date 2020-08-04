import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-input',
  templateUrl: './input.page.html',
  styleUrls: ['./input.page.scss'],
})
export class InputPage implements OnInit {
  nombre: string
  usuario = {
    email: '',
    password: ''
  };
  pattern="^([a-zA-Z0-9_\-\.]+)@([a-zA-Z0-9_\-\.]+)\.([a-zA-Z]{2,5})$";  


  constructor() { }

  ngOnInit() {
  }

  onSubmitTemplate()
  {
    console.log('Form submit');
    console.log(this.usuario);
  }

}

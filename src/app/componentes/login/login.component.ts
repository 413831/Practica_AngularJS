import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Usuario } from '../../clases/usuario';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private route: Router ) {}

  ngOnInit(): void {
  }

  title = 'Nueva Aplicacion';
  name: string;

  usuario = new Usuario();

  Ingresar(){
    console.log(this.usuario);

    if(this.usuario.email === 'admin@email.com' && this.usuario.pass === '1234')
    {
      this.route.navigate(['home']);
    }else{
      this.route.navigate(['error']);
    }
  }

}

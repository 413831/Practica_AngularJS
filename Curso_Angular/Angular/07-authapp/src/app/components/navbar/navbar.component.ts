import { Component, OnInit } from '@angular/core';
import { LoginService } from 'src/app/services/auth.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styles: [
  ]
})
export class NavbarComponent implements OnInit {
  isLogged: boolean;

  constructor(public auth: LoginService) { }

  ngOnInit(): void {
    this.auth.isLogged().subscribe(isLogged => this.isLogged = isLogged);

  }

}

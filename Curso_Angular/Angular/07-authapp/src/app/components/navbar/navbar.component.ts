import { DOCUMENT } from '@angular/common';
import { Component, Inject, OnInit } from '@angular/core';
import { AuthService } from '@auth0/auth0-angular';
import { LoginService } from 'src/app/services/auth.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styles: [
  ]
})
export class NavbarComponent implements OnInit 
{
  constructor(@Inject(DOCUMENT) public document: Document,public auth: AuthService) { }
  

  ngOnInit(): void 
  {
     this.auth.isAuthenticated$.subscribe(x => console.log(x));
  }
}


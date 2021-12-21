import { DOCUMENT } from '@angular/common';
import { Inject } from '@angular/core';
import { Injectable } from '@angular/core';

// Import the AuthService type from the SDK
import { AuthService } from '@auth0/auth0-angular';

@Injectable({
  providedIn: 'root'
})
export class LoginService 
{

  constructor(public auth: AuthService, @Inject(DOCUMENT) public document: Document) { }

  login()
  {
    this.auth.loginWithRedirect();
  }

  logout()
  {
    this.auth.logout({ returnTo: document.location.origin });
  }

  isLogged()
  {
    return this.auth.isAuthenticated$;
  }
}

import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { UsuarioDetalleComponent } from './components/usuario/usuario-detalle.component';
import { UsuarioEditarComponent } from './components/usuario/usuario-editar.component';
import { UsuarioNuevoComponent } from './components/usuario/usuario-nuevo.component';
import { UsuarioComponent } from './components/usuario/usuario.component';
import { USUARIOS_ROUTES } from './components/usuario/usuario.routes';


const APP_ROUTES: Routes = [
    { 
        path: 'home', 
        component: HomeComponent 
    },
    { 
        path: 'usuario/:id', 
        component: UsuarioComponent,
        children: USUARIOS_ROUTES
    },
    { 
        path: '**', 
        pathMatch: 'full', 
        redirectTo: 'home' 
    },

    //{ path: 'path/:routeParam', component: MyComponent },
    //{ path: 'staticPath', component: ... },
    //{ path: '**', component: ... },
    //{ path: 'oldPath', redirectTo: '/staticPath' },
    //{ path: ..., component: ..., data: { message: 'Custom' }
];

export const APP_ROUTING = RouterModule.forRoot(APP_ROUTES);


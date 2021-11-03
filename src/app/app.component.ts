import { Component } from '@angular/core';
import { Usuario } from './shared/model/Usuario';
import { UsuarioService } from './shared/services/usuario/usuario.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {

  usuarioLogado: Usuario;
  page: string = 'vacina';

  constructor(private usuarioService: UsuarioService) {
    this.usuarioLogado = new Usuario();
    this.usuarioLogado.is_admin = true;
  }

  login(user: string, pass: string): void {
    console.log(user,pass);
    // this.usuarioLogado = this.usuarioService.login();
  }

  showMenu(menu: HTMLUListElement): void {
    menu.style.opacity = '1';
  }

  eraseMenu(menu: HTMLUListElement): void {
    menu.style.opacity = '0';
  }

}

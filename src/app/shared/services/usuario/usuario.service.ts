import { Injectable } from '@angular/core';
import { Usuario } from '../../model/Usuario';
import { HttpClient } from '@angular/common/http';
import { of } from 'rxjs';
import { catchError, first } from 'rxjs/operators';
import { LogService } from '../log/log.service';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

  URL_USUARIOS = 'http://localhost:8080/usuarios';

  constructor(private httpClient: HttpClient, private log: LogService) { }

  async getUsuarios() : Promise<Usuario[]> {
    return this.httpClient.get<Usuario[]>(this.URL_USUARIOS).pipe(catchError(() => {
      this.log.error('Erro ao buscar usuários');
      return of(undefined);
    })).pipe(first()).toPromise();
  }

  async saveUsuario(usuario: Usuario) : Promise<Usuario> {
    return this.httpClient.post<Usuario>(this.URL_USUARIOS, usuario).pipe(catchError(() => {
      this.log.error('Erro ao salvar usuário');
      return of(undefined);
    })).pipe(first()).toPromise();
  }

}

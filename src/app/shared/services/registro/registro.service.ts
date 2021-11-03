import { Injectable } from '@angular/core';
import { Registro } from '../../model/Registro';
import { HttpClient } from '@angular/common/http';
import { of } from 'rxjs';
import { catchError, first } from 'rxjs/operators';
import { LogService } from '../log/log.service';

@Injectable({
  providedIn: 'root'
})
export class RegistroService {

  URL_REGISTROS = 'http://localhost:8080/registros';

  constructor(private httpClient: HttpClient, private log: LogService) { }

  async getRegistros() : Promise<Registro[]> {
    return this.httpClient.get<Registro[]>(this.URL_REGISTROS).pipe(catchError(() => {
      this.log.error('Erro ao buscar registros');
      return of(undefined);
    })).pipe(first()).toPromise();
  }

  async saveRegistro(registro: Registro) : Promise<Registro> {
    return this.httpClient.post<Registro>(this.URL_REGISTROS, registro).pipe(catchError(() => {
      this.log.error('Erro ao salvar registro');
      return of(undefined);
    })).pipe(first()).toPromise();
  }

}

import { Injectable } from '@angular/core';
import { TipoVacina } from '../../model/TipoVacina';
import { HttpClient } from '@angular/common/http';
import { of } from 'rxjs';
import { catchError, first } from 'rxjs/operators';
import { LogService } from '../log/log.service';

@Injectable({
  providedIn: 'root'
})
export class TipoVacinaService {

  URL_TIPOSVACINA = 'http://localhost:8080/tiposvacina';

  constructor(private httpClient: HttpClient, private log: LogService) { }

  async getTiposVacina() : Promise<TipoVacina[]> {
    return this.httpClient.get<TipoVacina[]>(this.URL_TIPOSVACINA).pipe(catchError(() => {
      this.log.error('Erro ao buscar os tipos de vacina');
      return of(undefined);
    })).pipe(first()).toPromise();
  }

  async saveTipoVacina(tipoVacina: TipoVacina) : Promise<TipoVacina> {
    return this.httpClient.post<TipoVacina>(this.URL_TIPOSVACINA, tipoVacina).pipe(catchError(() => {
      this.log.error('Erro ao salvar tipo de vacina');
      return of(undefined);
    })).pipe(first()).toPromise();
  }

}

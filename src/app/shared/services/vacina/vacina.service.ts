import { Injectable } from '@angular/core';
import { Vacina } from '../../model/Vacina';
import { HttpClient } from '@angular/common/http';
import { of } from 'rxjs';
import { catchError, first } from 'rxjs/operators';
import { LogService } from '../log/log.service';

@Injectable({
  providedIn: 'root'
})
export class VacinaService {

  URL_VACINAS = 'http://localhost:8080/vacinas';

  constructor(private httpClient: HttpClient, private log: LogService) { }

  async getVacinas() : Promise<Vacina[]> {
    return this.httpClient.get<Vacina[]>(this.URL_VACINAS).pipe(catchError(() => {
      this.log.error('Erro ao buscar vacinas');
      return of(undefined);
    })).pipe(first()).toPromise();
  }

  async saveVacina(vacina: Vacina) : Promise<Vacina> {
    return this.httpClient.post<Vacina>(this.URL_VACINAS, vacina).pipe(catchError(() => {
      this.log.error('Erro ao salvar vacina');
      return of(undefined);
    })).pipe(first()).toPromise();
  }

}

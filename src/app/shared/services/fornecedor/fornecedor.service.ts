import { Injectable } from '@angular/core';
import { Fornecedor } from '../../model/Fornecedor';
import { HttpClient } from '@angular/common/http';
import { of } from 'rxjs';
import { catchError, first } from 'rxjs/operators';
import { LogService } from '../log/log.service';

@Injectable({
  providedIn: 'root'
})
export class FornecedorService {

  URL_FORNECEDORES = 'http://localhost:8080/fornecedores';

  constructor(private httpClient: HttpClient, private log: LogService) { }

  async getFornecedores() : Promise<Fornecedor[]> {
    return this.httpClient.get<Fornecedor[]>(this.URL_FORNECEDORES).pipe(catchError(() => {
      this.log.error('Erro ao buscar fornecedores');
      return of(undefined);
    })).pipe(first()).toPromise();
  }

  async saveFornecedor(fornecedor: Fornecedor) : Promise<Fornecedor> {
    return this.httpClient.post<Fornecedor>(this.URL_FORNECEDORES, fornecedor).pipe(catchError(() => {
      this.log.error('Erro ao salvar fornecedor');
      return of(undefined);
    })).pipe(first()).toPromise();
  }

  async updateFornecedor(fornecedor: Fornecedor) : Promise<Fornecedor> {
    return this.httpClient.put<Fornecedor>(this.URL_FORNECEDORES, fornecedor).pipe(catchError(() => {
      this.log.error('Erro ao atualizar fornecedor');
      return of(undefined);
    })).pipe(first()).toPromise();
  }
}

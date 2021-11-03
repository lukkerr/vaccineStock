import { TestBed } from '@angular/core/testing';

import { TipoVacinaService } from './tipo-vacina.service';

describe('TipoVacinaService', () => {
  let service: TipoVacinaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TipoVacinaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});

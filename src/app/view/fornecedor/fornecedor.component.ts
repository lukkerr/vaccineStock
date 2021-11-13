import { Component, OnInit } from '@angular/core';
import { FornecedorService } from '../../shared/services/fornecedor/fornecedor.service';
import { Fornecedor } from '../../shared/model/Fornecedor';

@Component({
  selector: 'app-fornecedor',
  templateUrl: './fornecedor.component.html',
  styleUrls: ['./fornecedor.component.scss']
})
export class FornecedorComponent implements OnInit {

  filterFornecedores: Fornecedor[] = [];
  fornecedores: Fornecedor[] = [];
  displayedColumns: string[] = ['id', 'nome', 'endereco'];

  constructor(private fornecedorService: FornecedorService) {
    this.fornecedorService = fornecedorService;
  }

  ngOnInit(): void {
    this.getFornecedor();
  }

  async getFornecedor() {
    // this.fornecedores = await this.fornecedorService.getFornecedores();
    // this.fornecedores = new;

    const fornecedor = new Fornecedor();
    fornecedor.id = 1;
    fornecedor.nome = "Casas Bahia";
    fornecedor.endereco = "Lago João Pessoa";

    this.fornecedores.push(fornecedor);
    this.filterFornecedores = this.fornecedores;
  }

  search(input: HTMLInputElement) {
    const searchText = input.value;
    this.filterFornecedores = this.fornecedores.filter(fornecedor => {

      const validId = fornecedor.id.toString().includes(searchText.toLowerCase());
      const validName = fornecedor.nome.toLowerCase().includes(searchText.toLowerCase());
      const validAddress = fornecedor.endereco.toLowerCase().includes(searchText.toLowerCase());

      return validId || validName || validAddress;
    });
  }

}

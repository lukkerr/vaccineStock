import { Injectable } from '@angular/core';
import Swal from 'sweetalert2'

@Injectable({
  providedIn: 'root'
})
export class LogService {

  constructor() {}

  success (message: string): void {
    Swal.fire({
      icon: 'success',
      text: message
    })
  }

  error (message: string): void {
    Swal.fire({
      icon: 'error',
      text: message
    })
  }
}

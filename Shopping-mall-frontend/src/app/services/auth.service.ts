import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private apiUrl = 'http://localhost:8080/api/auth';

  constructor(private http: HttpClient) {}

  login(user: any) {
    return this.http.post(`${this.apiUrl}/login`, user);
  }

  register(user: any) {
    return this.http.post(`${this.apiUrl}/register`, user);
  }
}

import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class CartService {
  private apiUrl = 'http://localhost:8080/api/cart';

  constructor(private http: HttpClient) {}

  addToCart(cartItem: any) {
    return this.http.post(`${this.apiUrl}/add`, cartItem);
  }

  getCart(userId: number) {
    return this.http.get(`${this.apiUrl}/${userId}`);
  }
}

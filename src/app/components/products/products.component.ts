import { Component, OnInit } from '@angular/core';
import { ProductService } from '../../services/product.service';
import { CartService } from '../../services/cart.service';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css'],
})
export class ProductsComponent implements OnInit {
  products: any = [];

  constructor(private productService: ProductService, private cartService: CartService) {}

  ngOnInit() {
    this.productService.getProducts().subscribe((data) => {
      this.products = data;
    });
  }

  addToCart(product: any) {
    this.cartService.addToCart({ productId: product.id, quantity: 1 }).subscribe(() => {
      alert('Product added to cart!');
    });
  }
}

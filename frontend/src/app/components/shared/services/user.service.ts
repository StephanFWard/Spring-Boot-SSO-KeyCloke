import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }

  login(username: string, password: string) {
    // Call Keycloak login API endpoint
    // Example: this.http.post('/api/login', { username, password });
  }

  logout() {
    // Call Keycloak logout API endpoint
    // Example: this.http.post('/api/logout', {});
  }

  getUserProfile() {
    // Call Keycloak user profile API endpoint
    // Example: this.http.get('/api/user/profile');
  }

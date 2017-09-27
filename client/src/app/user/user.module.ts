import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';

import { FormsModule } from '@angular/forms';
import { LoginComponent } from './login.component';

import { userRoutes } from './user.routes';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,      
    RouterModule.forChild(userRoutes)
  ],
  declarations: [
    LoginComponent
    ]
})
export class UserModule { }

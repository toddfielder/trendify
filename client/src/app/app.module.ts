import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { DashboardComponent } from './dashboard/dashboard.component';

import { CategoryComponent } from './category/category.component';
import { CategoryService } from './category/category.service';
import { TopicComponent } from './topic/topic.component';
import { TopicService } from './topic/topic.service';
import { CategoryDetailComponent } from './category/categorydetail/categorydetail.component';

@NgModule({
  declarations: [
    AppComponent,
    CategoryComponent,
    DashboardComponent,
    TopicComponent,
    CategoryDetailComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RouterModule.forRoot([
      { path: 'category/:id', component: CategoryDetailComponent },
      { path: '', component: DashboardComponent },
      { path: '**', redirectTo: 'dashboard', pathMatch: 'full' }
    ]),
  ],
  providers: [CategoryService, TopicService],
  bootstrap: [AppComponent]
})
export class AppModule { }

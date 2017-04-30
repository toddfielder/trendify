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
import { CommentService } from './comment/comment.service';
import { CategoryDetailComponent } from './category/categorydetail/categorydetail.component';
import { TopicDetailComponent } from './topic/topicdetail/topicdetail.component';


import { CommentComponent } from './comment/comment.component';

@NgModule({
  declarations: [
    AppComponent,
    CategoryComponent,
    DashboardComponent,
    TopicComponent,
    CategoryDetailComponent,
    TopicDetailComponent,
    CommentComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RouterModule.forRoot([
      { path: 'category/:id', component: CategoryDetailComponent },
      { path: 'topic/:id', component: TopicDetailComponent },
      { path: '', component: DashboardComponent },
      { path: '**', redirectTo: 'dashboard', pathMatch: 'full' }
    ]),
  ],
  providers: [CategoryService, TopicService, CommentService],
  bootstrap: [AppComponent]
})
export class AppModule { }

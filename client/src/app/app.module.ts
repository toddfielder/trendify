import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule } from '@angular/router';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { CardModule } from 'primeng/card';
import { PanelModule } from 'primeng/panel';
import { TableModule } from 'primeng/table';

import { AppComponent } from './app.component';
import { DashboardComponent } from './dashboard/dashboard.component';

import { CategoryComponent } from './category/category.component';
import { CategoryService } from './category/category.service';
import { TopicComponent } from './topic/topic.component';
import { TopicService } from './topic/topic.service';
import { CommentService } from './comment/comment.service';
import { CategoryDetailComponent } from './category/categorydetail/categorydetail.component';
import { TopicDetailComponent } from './topic/topicdetail/topicdetail.component';
import { UserModule } from './user/user.module';

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
    BrowserAnimationsModule,
    BrowserModule,
    FormsModule,
    PanelModule,
    HttpModule,
    CardModule,
    TableModule,
    RouterModule.forRoot([
      { path: 'category/:id', component: CategoryDetailComponent },
      { path: 'topic/:id', component: TopicDetailComponent },
      { path: 'user', loadChildren: 'app/user/user.module#UserModule' },
      { path: '', component: DashboardComponent },
      { path: '**', redirectTo: 'dashboard', pathMatch: 'full' }
    ]),
  ],
  providers: [CategoryService, TopicService, CommentService],
  bootstrap: [AppComponent]
})
export class AppModule { }

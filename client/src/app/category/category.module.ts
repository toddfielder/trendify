import { NgModule } from '@angular/core';
import { RouterModule} from '@angular/router';

import { CategoryComponent } from './category.component';
import { CategoryService } from './category.service';
import { CategoryDetailComponent } from './categorydetail/categorydetail.component';


@NgModule({
  imports: [
    RouterModule.forChild([
      { path: 'category', component: CategoryComponent },
      { path: 'category/:id',
        component: CategoryDetailComponent
      }
    ])
  ],
  declarations: [CategoryDetailComponent],
  providers: [
    CategoryService
  ]
})
export class ProductModule {}

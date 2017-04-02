import { CategoryService } from './category.service';
import { ICategory } from './category';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.css']
})
export class CategoryComponent implements OnInit {
  title: string = 'Categories';
  categories: ICategory[];
  errorMessage: string;

  constructor(private _categoryService: CategoryService) { }

  ngOnInit() {
    console.log('---in OnInit()');
    this._categoryService.getCategories()
      .subscribe(categories => this.categories = categories,
        error => this.errorMessage = <any>error);
  }

}

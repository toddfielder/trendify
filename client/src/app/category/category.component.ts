import { CategoryService } from './category.service';
import { ICategory } from './category';
import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.css']
})
export class CategoryComponent implements OnInit {

  @Input()
  title: string;
  categories: ICategory[];
  errorMessage: string;

  constructor(private _categoryService: CategoryService) { }

  ngOnInit() {
    console.log('CategoryComponent::ngOnInit()');
    this._categoryService.getCategories()
      .subscribe(categories => this.categories = categories,
        error => this.errorMessage = <any>error);
  }

}

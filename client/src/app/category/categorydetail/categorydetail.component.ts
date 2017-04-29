import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { Subscription }       from 'rxjs/Subscription';

import { ICategory } from '../category';
import { CategoryService } from '../category.service';

@Component({
  selector: 'app-categorydetail',
  templateUrl: './categorydetail.component.html',
  styleUrls: ['./categorydetail.component.css']
})
export class CategoryDetailComponent implements OnInit {
    pageTitle: string = 'Product Detail';
    category: ICategory;
    errorMessage: string;
    private sub: Subscription;
    
    constructor(private _route: ActivatedRoute,
                private _router: Router,
                private _categoryService: CategoryService) {
    }

    ngOnInit(): void {
        this.sub = this._route.params.subscribe(
            params => {
                let id = +params['id'];
                this.getCategory(id);
        });
    }

    ngOnDestroy() {
        this.sub.unsubscribe();
    }

    getCategory(id: number) {
        this._categoryService.getCategory(id).subscribe(
            category => this.category = category,
            error => this.errorMessage = <any>error);
    }

    onBack(): void {
        this._router.navigate(['/category']);
    }

}

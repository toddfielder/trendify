import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';

import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/do';
import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/map';
import 'rxjs/add/observable/throw';

import { ICategory } from './category';
@Injectable()
export class CategoryService {
  private _categoryUrl = '/category';

  constructor(private _http: Http) { }

  getCategories(): Observable<ICategory[]> {
        return this._http.get(this._categoryUrl)
            .map((response: Response) => <ICategory[]> response.json())
            .do(data => console.log('All: ' +  JSON.stringify(data)))
            .catch(this.handleError);
    }
  private handleError(error: Response) {
        // in a real world app, we may send the server to some remote logging infrastructure
        // instead of just logging it to the console
        console.error(error);
        return Observable.throw(error.json().error || 'Server error');
    }
}


    // getProduct(id: number): Observable<IProduct> {
    //    return this.getProducts()
    //        .map((products: IProduct[]) => products.find(p => p.productId === id));
    // }

import { ICategory } from '../category/category';

export interface ITopic {
  id: number;
  title: string;
  category: ICategory
}

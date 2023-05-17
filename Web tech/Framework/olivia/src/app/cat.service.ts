import { Injectable } from '@angular/core';
import { Cat } from './models/cat';

@Injectable({
  providedIn: 'root'
})
export class CatService {

  constructor() { }

  editIndex: number = -1;
  cats: Cat[] = [
    {
      name: "Olivia",
      fur: "white",
      cuteness: "maximum",
      amount: 10
    },
    {
      name: "lala",
      fur: "brown",
      cuteness: "chole",
      amount: 20
    },
  ];

  getCats(): Cat[] {
    return this.cats;
  }

  setCatName(index: number, name: string): void {
    this.cats[index].name = name;
  }

  increaseCat(index: number): void {
    this.cats[index].amount++;
  }
  decreaseCat(index: number): void {
    this.cats[index].amount--;
  }

  editCat(index: number): void {
    this.editIndex = index;
  }

  getEditCat(): Cat {
    return this.cats[this.editIndex];
  }

}

import { Injectable } from '@angular/core';
import { Item } from './item';

@Injectable({
  providedIn: 'root'
})
export class ItemService {

  constructor() { }

  itemToBeUpdated: Item = new Item();

  items: Item[] = [
    {
      id: 1,
      name: "shampoo",
      price: 2000,
      quantity: 5
    },
    {
      id: 2,
      name: "ifone",
      price: 3000,
      quantity: 6
    },
    {
      id: 3,
      name: "kisuna",
      price: 0,
      quantity: 1
    }
  ];

  getItems(): Item[] {
    return this.items;
  }
  setItems(items: Item[]): void {
    this.items = items;
  }
  getItem(index: number): Item {
    return this.items[index];
  }
  setItemToBeUpdated(index: number): void {
    let item = this.items.at(index);
    if (item != null) {
      this.itemToBeUpdated = item;
    }
  }
  getItemToBeUpdated(): Item {
    return this.itemToBeUpdated;
  }
}

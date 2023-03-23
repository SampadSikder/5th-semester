import { Component } from '@angular/core';
import { OnInit } from '@angular/core';
import { Router, RouterLink } from '@angular/router';
import { Item } from '../item';
import { ItemService } from '../item.service';
@Component({
  selector: 'app-item-list',
  templateUrl: './item-list.component.html',
  styleUrls: ['./item-list.component.css']
})
export class ItemListComponent implements OnInit {
  constructor(private itemService: ItemService, private router: Router) {

  }
  myItems: Item[] = [];
  editedItems: Item[] = [];
  ngOnInit(): void {
    this.myItems = this.itemService.getItems();
    console.log(this.myItems);
  }

  requestItem(item_name: String): void {
    alert("Request stock " + item_name);

  }
  buy(index: number): void {

    // for (let i = 0; i < this.editedItems.length; i++) {
    //   if (this.editedItems[i] == item) {
    //     this.editedItems[i].quantity--;
    //     this.itemService.setItems(this.editedItems);
    //   }
    // }
    this.myItems[index].quantity--;
    this.itemService.setItems(this.myItems);
  }

  updateItem(index: number): void {
    this.router.navigate(["update"]);
  }

}

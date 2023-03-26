import { Component, OnInit } from '@angular/core';
import { ItemService } from '../item.service';
import { Item } from '../item';
import { Router } from '@angular/router';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {
  constructor(private itemService: ItemService, private router: Router) {

  }
  myItem: Item = new Item();

  ngOnInit(): void {
    this.myItem = this.itemService.getItemToBeUpdated();
  }
  updateItem(): void {
    this.router.navigate(["items"]);
  }

}

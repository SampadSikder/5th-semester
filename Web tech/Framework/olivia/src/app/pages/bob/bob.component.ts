import { Component } from '@angular/core';
import { OnInit } from '@angular/core';
import { CatService } from 'src/app/cat.service';
import { Cat } from 'src/app/models/cat';
import { Router } from '@angular/router';

@Component({
  selector: 'app-bob',
  templateUrl: './bob.component.html',
  styleUrls: ['./bob.component.css']
})
export class BobComponent implements OnInit {


  constructor(private catService: CatService, private router: Router) {

  }

  cats: Cat[] = [];
  check: boolean = false;
  editIndex: number = 0;

  ngOnInit(): void {
    this.cats = this.catService.getCats();
  }

  editCat(index: number): void {
    this.catService.editCat(index);
    this.router.navigate(['editcat']);
  }

  checkAmount(index: number): boolean {
    if (this.cats[index].amount > 0) {
      return true;
    }
    return false;
  }

  addCat(index: number): void {
    this.catService.increaseCat(index);
  }
  removeCat(index: number): void {
    this.catService.decreaseCat(index);
  }
}



import { Component, OnInit } from '@angular/core';
import { CatService } from 'src/app/cat.service';
import { Cat } from 'src/app/models/cat';
import { Router } from '@angular/router';
@Component({
  selector: 'app-editcat',
  templateUrl: './editcat.component.html',
  styleUrls: ['./editcat.component.css']
})
export class EditcatComponent implements OnInit {

  constructor(private catService: CatService, private router: Router) {

  }
  cat: Cat = new Cat();
  ngOnInit(): void {
    this.cat = this.catService.getEditCat();
  }

  updateCat(): void {
    this.router.navigate(['bob']);
  }
}

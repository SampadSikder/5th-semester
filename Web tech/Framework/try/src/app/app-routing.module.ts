import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { HomeComponentComponent } from './home-component/home-component.component';
import { ItemListComponent } from './item-list/item-list.component';
import { UpdateComponent } from './update/update.component';

const routes: Routes = [
  { path: "home", component: HomeComponentComponent },
  { path: "items", component: ItemListComponent },
  { path: "update", component: UpdateComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

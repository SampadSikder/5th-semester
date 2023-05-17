import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BobComponent } from './pages/bob/bob.component';
import { EditcatComponent } from './pages/editcat/editcat.component';
const routes: Routes = [
  { path: 'bob', component: BobComponent },
  { path: "editcat", component: EditcatComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

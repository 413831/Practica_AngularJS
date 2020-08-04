import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-list-reorder',
  templateUrl: './list-reorder.page.html',
  styleUrls: ['./list-reorder.page.scss'],
})
export class ListReorderPage implements OnInit {

  personajes = ['Aquaman','Superman','Batman','Flash','Wonderwoman'];

  constructor() { }

  ngOnInit() {
  }

  reorder(event)
  {
    // Se extrae el elemento que se mueve
    const itemMover = this.personajes.splice(event.detail.from, 1)[0];

    this.personajes.splice(event.detail.to, 0, itemMover);

    event.detail.complete();
  }

  onClick()
  {
    console.log(this.personajes);
  }

}

import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/services/data.service';

@Component({
  selector: 'app-searchbar',
  templateUrl: './searchbar.page.html',
  styleUrls: ['./searchbar.page.scss'],
})
export class SearchbarPage implements OnInit {
  albumes: any[] = [];
  termino = ''; 

  constructor(private dataService: DataService) { }

  ngOnInit() {
    this.dataService.getAlbums()
                    .subscribe((albums)=>{
                      this.albumes = albums;
                    }); 
  }

  buscar(event)
  {
    this.termino = event.detail.value;
  }

}

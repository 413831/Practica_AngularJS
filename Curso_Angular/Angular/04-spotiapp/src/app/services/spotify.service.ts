import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class SpotifyService {

  constructor(private http: HttpClient) 
  {
    console.log("Spotify Service Listo");
  }

  getQuery( query: string )
  {
    const url = `https://api.spotify.com/v1/${ query }`;
    
    const headers = new HttpHeaders({
      'Authorization': 'Bearer BQC4LrqARBD0KUzpDnRWLQsB-XUlPAT0P9tzxQtfAhObJj4WuM-ROyb2OFViYTUPnof1V5pWx31GMBs-2l4'
    });

    return this.http.get(url, {headers});
  }

  getNewReleases()
  {
    return this.getQuery("browse/new-releases")
                .pipe( map( data => data['albums'].items));
  }

  getArtist( termino: string )
  {
    return this.getQuery(`search?q=${termino}&type=artist`)
                .pipe( map( data => data['artists'].items));                
  }
}


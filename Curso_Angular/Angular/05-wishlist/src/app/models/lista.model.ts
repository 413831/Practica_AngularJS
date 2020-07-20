import { ListaItem } from './lista-items.model';

export class Lista
{
    id: number;
    titulo: string;
    createdAt: Date;
    finishedAt: Date;
    terminada: boolean;
    items: ListaItem[];

    constructor(titulo:string)
    {   
        this.titulo = titulo;

        this.createdAt = new Date();
        this.terminada = false;
        this.items = [];
        this.id = new Date().getTime();
    }
}
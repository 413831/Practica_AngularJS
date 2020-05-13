// Decorador
//
// Un decorador añade funcionalidad a la clase que recibe como parámetro
// Es una funcion que añade funcionalidad de la clase
function imprimirConsola(constructorClase: Function){
    console.log(constructorClase);
}

@imprimirConsola
export class Xmen
{
    constructor(public nombre: string, public clave: string){};

    imprimir()
    {
        console.log(`${ this.nombre } - ${ this.clave }` );
    }   
}
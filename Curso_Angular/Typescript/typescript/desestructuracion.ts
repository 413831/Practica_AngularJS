(()=>{
    /*
        Desestructuracion de Objetos y Arrays
    */
    ///////////////////////////////////////
    console.info("Desestructuracion de objetos y arrays");

    const avenger = 
    {
        nombre: 'Steve',
        clave:  'Capitán América',
        poder:  'Capitalismo'
    }

    const extraerObjeto = ( { nombre, poder }: any ) => {
        console.log(nombre);
        console.log(poder);
    }

    extraerObjeto( avenger );
    ///////////////////////////////////////
    const avengers: string[] = ['Thor','Ironman','Spiderman'];

    const extraerArray = ( [ thor, ironman, spiderman ]: string[] ) => {
        console.log( thor );
        console.log( ironman );
        console.log( spiderman );
    }

    extraerArray( avengers );
})();

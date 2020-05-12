(function(){
    console.info("Funciones de flecha gorda");

    const miFuncion = function ( a: string){
        return a.toUpperCase();
    }

    const miFuncionF = ( a: string ) => a.toUpperCase();

    console.log( miFuncion('Normal') );
    console.log( miFuncionF('Flecha') );
    ////////////////////////////////////
    const sumarN = function( a:number, b:number ){
        return a + b;
    }
    const sumarNF = (a: number , b: number ) => a + b;

    console.log( sumarN(5,5) );
    console.log( sumarNF( 5, 5) );
    ///////////////////////////////////
    const hulk = 
    {
        alias: 'Hulk',
        nombre: 'Bruce Banner',
        smash()
        {
            setTimeout( () =>
            {
                console.log(`${this.alias} smash!!!`);
            }, 1000);
        }
    }
    hulk.smash();
})();
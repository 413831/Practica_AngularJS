// Funcion anonima autoinvocada
(function(){
    console.info("Clase de parametros");
// Ejemplo de funciones con parámetros
// Es importante respetar el orden de declaracion de parámetros
// Primero parámetros obligatorios, segundo opcionales y tercero por defecto

    function activar( quien   : string,
                      momento?: string,
                      objeto  : string = 'batiseñal'){
        if(momento)
        {
            console.log(`${quien} activó la ${objeto} en la ${momento}`);
        }
        else
        {
            console.log(`${quien} activó la ${objeto}.`);
        }
    }

    activar('Gordon','tarde');
})();
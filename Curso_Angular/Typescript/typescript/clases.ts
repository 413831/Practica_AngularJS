(()=>{
    console.info("Clases en Typescript");
    class Avenger 
    {
        // nombre: string;
        // equipo: string;
        // nombreReal: string;

        // puedePelear: boolean;
        // peleasGanadas: number;
        //
        // Inyeccion de parametros
        //
        constructor( public nombre: string, 
                     public equipo: string, 
                     public nombreReal?: string,
                     public puedePelear: boolean  = true, 
                     public peleasGanadas: number = 0){};
    }

    const antman: Avenger = new Avenger('Antman','Capitan America');
    console.log(antman);
})();
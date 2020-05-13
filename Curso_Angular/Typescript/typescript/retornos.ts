(()=>{
    console.info("Tipo de retornos de funciones");

    const sumar = (a: number, b: number): number => a + b;

    const nombre = (): string => 'Hola Fernando';

    const obtenerSalario = (): Promise<string> => 
    {
        return new Promise ( (resolve, reject) =>
        {
            resolve('String');
        });
    }

    obtenerSalario().then( a => console.log(a.toUpperCase()) );
})();
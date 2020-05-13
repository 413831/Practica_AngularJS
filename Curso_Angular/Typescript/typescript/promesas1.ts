(()=>
{
    console.info("Promesas");   
    console.log('Inicio');

    const promesa1 = new Promise(( resolve, reject )=>
    {
        setTimeout(()=>
        {
            resolve('Se terminó el timeout');
        }, 1000);
    });

    promesa1.then( mensaje => console.log( mensaje ))
            .catch( error => console.warn( error ));

    console.log('Fin');
})();
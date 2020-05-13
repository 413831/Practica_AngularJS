"use strict";
(() => {
    console.info("Clases en Typescript");
    class Avenger {
    }
    const antman = new Avenger();
    console.log(antman);
})();
(() => {
    /*
        Desestructuracion de Objetos y Arrays
    */
    ///////////////////////////////////////
    console.info("Desestructuracion de objetos y arrays");
    const avenger = {
        nombre: 'Steve',
        clave: 'Capitán América',
        poder: 'Droga'
    };
    const extraerObjeto = ({ nombre, poder }) => {
        console.log(nombre);
        console.log(poder);
    };
    extraerObjeto(avenger);
    ///////////////////////////////////////
    const avengers = ['Thor', 'Ironman', 'Spiderman'];
    const extraerArray = ([thor, ironman, spiderman]) => {
        console.log(thor);
        console.log(ironman);
        console.log(spiderman);
    };
    extraerArray(avengers);
})();
(function () {
    console.info("Funciones de flecha gorda");
    const miFuncion = function (a) {
        return a.toUpperCase();
    };
    const miFuncionF = (a) => a.toUpperCase();
    console.log(miFuncion('Normal'));
    console.log(miFuncionF('Flecha'));
    ////////////////////////////////////
    const sumarN = function (a, b) {
        return a + b;
    };
    const sumarNF = (a, b) => a + b;
    console.log(sumarN(5, 5));
    console.log(sumarNF(5, 5));
    ///////////////////////////////////
    const hulk = {
        alias: 'Hulk',
        nombre: 'Bruce Banner',
        smash() {
            setTimeout(() => {
                console.log(`${this.alias} smash!!!`);
            }, 1000);
        }
    };
    hulk.smash();
})();
(() => {
    console.info("Interfaces en Typescript");
    const enviarMision = (xmen) => {
        console.log(`Enviando a ${xmen.nombre} a la misión`);
    };
    const regresarAlCuartel = (xmen) => {
        console.log(`Regresando a ${xmen.nombre} de la misión`);
    };
    const wolverine = {
        nombre: 'Logan',
        edad: 40
    };
    enviarMision(wolverine);
    regresarAlCuartel(wolverine);
})();
// Funcion anonima autoinvocada
(function () {
    console.info("Clase de parametros");
    // Ejemplo de funciones con parámetros
    // Es importante respetar el orden de declaracion de parámetros
    // Primero parámetros obligatorios, segundo opcionales y tercero por defecto
    function activar(quien, momento, objeto = 'batiseñal') {
        if (momento) {
            console.log(`${quien} activó la ${objeto} en la ${momento}`);
        }
        else {
            console.log(`${quien} activó la ${objeto}.`);
        }
    }
    activar('Gordon', 'tarde');
})();
(() => {
    console.info("Promesas");
    console.log('Inicio');
    const promesa1 = new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve('Se terminó el timeout');
        }, 1000);
    });
    promesa1.then(mensaje => console.log(mensaje))
        .catch(error => console.warn(error));
    console.log('Fin');
})();
(() => {
    const retirarDinero = (montoRetirar) => {
        let dineroActual = 1000;
        return new Promise((resolve, reject) => {
            if (montoRetirar > dineroActual) {
                reject('No hay suficientes fondos');
            }
            else {
                dineroActual -= montoRetirar;
                resolve(dineroActual);
            }
        });
    };
    // retirarDinero( 1500 ).then( montoActual => console.log(`Me quedan ${montoActual}`))
    //                     .catch( error => console.log( error ));
    retirarDinero(500).then(montoActual => console.log(`Me quedan ${montoActual}`))
        .catch(console.warn);
})();
//# sourceMappingURL=main.js.map
"use strict";
// Funcion anonima autoinvocada
(function () {
    // Ejemplo de funciones con parámetros
    // Es importante respetar el orden de declaracion de parámetros
    // Primero parámetros obligatorios, segundo opcionales y tercero por defecto
    function activar(quien, momento, objeto) {
        if (objeto === void 0) { objeto = 'batiseñal'; }
        if (momento) {
            console.log(quien + " activ\u00F3 la " + objeto + " en la " + momento);
        }
        else {
            console.log(quien + " activ\u00F3 la " + objeto + ".");
        }
    }
    activar('Gordon', 'tarde');
})();
(function () {
    var miFuncion = function (a) {
        return a.toUpperCase();
    };
    var miFuncionF = function (a) { return a.toUpperCase(); };
    console.log(miFuncion('Normal'));
    console.log(miFuncionF('Flecha'));
    ////////////////////////////////////
    var sumarN = function (a, b) {
        return a + b;
    };
    var sumarNF = function (a, b) { return a + b; };
    console.log(sumarN(5, 5));
    console.log(sumarNF(10, 2));
});
//# sourceMappingURL=main.js.map
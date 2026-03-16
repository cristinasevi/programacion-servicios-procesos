"use strict";
// Clases en TypeScript
class Persona {
    constructor(nombre, edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    presentarse() {
        return `Hola, soy ${this.nombre} y tengo ${this.edad} años.`;
    }
}
const persona = new Persona('Juan', 30);
console.log(persona.presentarse());

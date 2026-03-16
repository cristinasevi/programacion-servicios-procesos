"use strict";
// Modificadores de acceso
class Cuenta {
    constructor(saldo, pin) {
        this.saldo = saldo;
        this.pin = pin;
        this.historial = [];
    }
    retirar(cantidad, pin) {
        if (this.verificarPin(pin)) {
            this.saldo -= cantidad;
            this.historial.push({ tipo: 'retiro', cantidad });
            return true;
        }
        return false;
    }
    verificarPin(pin) {
        return pin === this.pin;
    }
}
const cuenta = new Cuenta(1000, 1234);
console.log(cuenta.saldo); // ✅
// cuenta.pin; // ❌ Error: es private

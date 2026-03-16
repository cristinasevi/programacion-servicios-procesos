declare class Cuenta {
    saldo: number;
    private pin;
    protected historial: any[];
    constructor(saldo: number, pin: number);
    retirar(cantidad: number, pin: number): boolean;
    private verificarPin;
}
declare const cuenta: Cuenta;

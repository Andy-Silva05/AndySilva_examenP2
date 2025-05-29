public class AS_cuentaahorros {
    private boolean cuenta;
    float saldo_disponible;
    float tasa_anual;
    float cantidaddepo;
    float cantidadretiro;

    public boolean iscuenta() {
        return cuenta;
    }
    float sdisponible(){
        return saldo_disponible;
    }

    float interes() {
        return tasa_anual;
    }

    float depositado() {
        return cantidaddepo;
    }

    float retiro() {
        return cantidadretiro;
    }
}

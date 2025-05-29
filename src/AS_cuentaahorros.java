public class AS_cuentaahorros {
    private boolean Saldo_disponible;
    float tasa_anual;
    float cantidaddepo;
    float cantidadretiro;

    public boolean isSaldo_disponible() {
        return Saldo_disponible;
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

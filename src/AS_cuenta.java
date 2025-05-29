public class AS_cuenta {
     int Saldo;
     int realizar_depositos;
    float realizar_retiros;
    float tasainteres;


    float saldodisponible(){
        return Saldo;
    }
    int deposito_realizado(){
        return realizar_depositos;
    }
    float retiro (){
        return realizar_retiros;
    }
    float interes(){
        return tasainteres;
    }

}

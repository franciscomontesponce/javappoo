public class PruebaMetodos {
    public static void main (String[] args){

        System.out.println("");
        
        Cuenta miCuenta = new Cuenta();
        System.out.println(miCuenta + " miCuenta");

        miCuenta.saldo = 300;
        System.out.println(miCuenta.saldo + " Ingreso de dinero a miCuenta.");

        miCuenta.depositar(200);
        System.out.println(miCuenta.saldo + " Se depositan 200 a micuenta.");

        miCuenta.retirar(100);
        System.out.println(miCuenta.saldo + " Se retiran 100 desde miCuenta.");

        Cuenta cuentaDeJimena = new Cuenta();
        System.out.println(cuentaDeJimena + " cuentaDeJimena");

        cuentaDeJimena.depositar(1000);
        System.out.println(cuentaDeJimena.saldo + " Se depositan 1000 a cuentaDeJimena.");
        
        cuentaDeJimena.transferir(400, miCuenta);

        System.out.println(cuentaDeJimena.saldo + " Saldo cuentaDeJimena por transferencia de 400 a miCuenta.");
        System.out.println(miCuenta.saldo + " Saldo de miCuenta por transferencia desde cuentaDeJimena.");

    }
}

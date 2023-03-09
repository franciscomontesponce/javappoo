public class CrearCuenta {
    public static void main(String[] args) {

        Cuenta primeraCuenta = new Cuenta();
        System.out.println( primeraCuenta);

        primeraCuenta.saldo = 1000;
        System.out.println(primeraCuenta.saldo);

        Cuenta segundaCuenta = new Cuenta();
        System.out.println(segundaCuenta);

        segundaCuenta.saldo = 500;
        System.out.println(segundaCuenta.saldo);

        if (primeraCuenta == segundaCuenta) {
            System.out.println("Si, primeraCuenta y segundaCuenta son iguales");
        }else{
            System.out.println("No, primeraCuenta y segundaCuenta no son iguales");
        }
    }
}
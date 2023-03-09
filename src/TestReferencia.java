public class TestReferencia {
    public static void main(String[] args) {

        System.out.println("");

        Cuenta primeraCuenta =  new Cuenta();
        primeraCuenta.saldo = 200;
        System.out.println("1.- Asignación de saldo inicial a primeraCuenta: " + primeraCuenta.saldo);
        System.out.println("2.- Espacio reservado en memoria para primeraCuenta: " + primeraCuenta);


        Cuenta segundaCuenta = primeraCuenta;
        segundaCuenta.saldo = 100;
        System.out.println("3.- Saldo segundaCuenta: " + segundaCuenta.saldo);
        System.out.println( "4.- Espacio reservado en memoria para segundaCuenta: " + segundaCuenta);
        System.out.println( "**** Es el mismo espacio de memoria de primeraCuenta ya que lo estoy referenciando.");


        System.out.println("Saldo primera cuenta: " + primeraCuenta.saldo);
        System.out.println("Saldo segunda cuenta: " + segundaCuenta.saldo);

        segundaCuenta.saldo += 400;
        System.out.println(segundaCuenta.saldo);
        System.out.println(primeraCuenta.saldo);

        if (primeraCuenta == segundaCuenta) {
            System.out.println("Si, primeraCuenta y segundaCuenta son iguales");
        }else{
            System.out.println("No, primeraCuenta y segundaCuenta son iguales");
        }

    }
}

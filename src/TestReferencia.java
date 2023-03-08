public class TestReferencia {
    public static void main(String[] args) {
        Cuenta primeraCuenta =  new Cuenta();
        primeraCuenta.saldo = 200;
        System.out.println("Asignación de saldo inicial a primeraCuenta: " + primeraCuenta.saldo);
        System.out.println("Espacio reservado en memoria para primeraCuenta: " + primeraCuenta);


        Cuenta segundaCuenta = primeraCuenta;
        segundaCuenta.saldo = 100;
        System.out.println("Saldo segundaCuenta: " + segundaCuenta.saldo);
        System.out.println( "Espacio reservado en memoria para segundaCuenta: " + segundaCuenta);
        System.out.println( "  >> Es el mismo espacio de memoria de primeraCuenta ya que lo estoy referenciando.");


        System.out.println("Saldo segunda cuenta: " + segundaCuenta.saldo);




    }
}

public class TestReferencia2 {
    
    public static void main(String[] args) {
        
        Cliente diego = new Cliente();
        System.out.println(diego);
        
        diego.nombre = "Diego";
        diego.documento = "1-2-3-4-5-6-7-8-9";
        diego.telefono = "55559999";

        Cuenta cuentaDeDiego = new Cuenta();
        System.out.println(cuentaDeDiego + " Objeto cuenta Diego.");

        cuentaDeDiego.agencia = 1;
        System.out.println(cuentaDeDiego.agencia);

        cuentaDeDiego.titular = diego;
        System.out.println(cuentaDeDiego.titular.documento);
        System.out.println(cuentaDeDiego.titular);

    }
}

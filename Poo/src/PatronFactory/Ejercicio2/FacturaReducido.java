package PatronFactory.Ejercicio2;

public class FacturaReducido  implements  Factura{

    private final double  iva = 1.08;
    private double subTotal=0; // es el valor de la factura sin iva
    private double total=0; // es el valor de la factura con iva


    public FacturaReducido(double subTotal) {
        this.subTotal =subTotal ;
    }

    @Override
    public void calcularValorFactura() {
        total= subTotal * iva;
    }

    @Override
    public void mostrarFactura() {

        System.out.println("El valor de la factura con iva del 8% , subTotal de " + subTotal +" es  " + total   );

    }

}

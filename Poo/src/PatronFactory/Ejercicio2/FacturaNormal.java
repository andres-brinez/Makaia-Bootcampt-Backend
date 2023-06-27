package PatronFactory.Ejercicio2;

public class FacturaNormal implements  Factura {

    // Constante
     private final int  iva = 19;

    private double subTotal=0; // es el valor de la factura sin iva
    private double total=0; // es el valor de la factura con iva


    // Constructor
    public FacturaNormal(double subTotal) {
        this.subTotal =subTotal; // Asigna el valor del total sin IVA
    }


    @Override
    public void calcularValorFactura() {
        total = subTotal * 1.19;
    }

    @Override
    public void mostrarFactura() {

        System.out.println("El valor de la factura con iva del "+ iva  +"% , subTotal del " + subTotal +" es : " + total   );

    }

}

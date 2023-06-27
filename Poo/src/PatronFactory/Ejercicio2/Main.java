package PatronFactory.Ejercicio2;

public class Main {

    public static void main(String[] args) {

        // Crear facturas

        Factura factura1 = FacturaFactory.crearFactura(19,10000);
        factura1.calcularValorFactura();
        factura1.mostrarFactura();

        Factura factura2 = FacturaFactory.crearFactura(8,10000);
        factura2.calcularValorFactura();
        factura2.mostrarFactura();

        Factura factura3 = FacturaFactory.crearFactura(20,10000);
        factura3.calcularValorFactura();
        factura3.mostrarFactura();











    }
}

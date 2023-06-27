package PatronFactory.Ejercicio2;

// Crea instancias de las subclases según cuál sea la necesidad
public class FacturaFactory {

    // Crea las facturas
    public static Factura crearFactura(int  iva, double subTotal)  {

        if (iva == 8) {
            return new FacturaReducido(subTotal);
        }
        else if (iva== 19) {
            return new FacturaNormal(subTotal);
        }
        else {
            // Lanza una exepción porque el tipo de iva está mal
            throw new IllegalArgumentException ("Error al crear la factura  por iva incorrecto");
        }
    }

}

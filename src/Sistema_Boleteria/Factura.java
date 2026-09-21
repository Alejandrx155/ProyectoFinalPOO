package Sistema_Boleteria;

public class Factura extends Asiento {

    public String opcionHorario;

    public Factura(String nombre, String cedula, String origen, String destino, double precio,
                   int numeroAsiento, double precioAsiento, String opcionHorario) {

        super(nombre, cedula, origen, destino, precio, numeroAsiento, precioAsiento);

        this.opcionHorario = opcionHorario;
    }


    public double calcularTotal() {
        return calcularPrecio()
                + calcularPrecioAsiento();
    }

    public String mostrarFactura() {
        return "=========================================\n"
                + "              FACTURA / BOLETO           \n"
                + "=========================================\n"
                + "CLIENTE: " + nombre + "\n"
                + "CÉDULA: " + cedula + "\n"
                + "ORIGEN: " + origen + "\n"
                + "DESTINO: " + destino + "\n"
                + "-----------------------------------------\n"
                + opcionHorario + "\n"
                + "-----------------------------------------\n"
                + "ASIENTO SELECCIONADO: #" + numeroAsiento + "\n"
                + "PRECIO DEL PASAJE: $" + precio + "\n"
                + "PRECIO DEL ASIENTO: $" + precioAsiento + "\n"
                + "TOTAL A PAGAR: $" + calcularTotal() + "\n"
                + "=========================================\n"
                + "       GRACIAS POR USAR NUESTRO SERVICIO \n"
                + "=========================================";
    }
}
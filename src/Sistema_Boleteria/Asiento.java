package Sistema_Boleteria;

public class Asiento extends Terminal {

    public int numeroAsiento;
    public double precioAsiento;

    public Asiento(String nombre, String cedula, String origen, String destino, double precio,
                   int numeroAsiento, double precioAsiento) {

        super(nombre, cedula, origen, destino, precio);

        this.numeroAsiento = numeroAsiento;
        this.precioAsiento = precioAsiento;
    }

    public String seleccionarAsiento() {
        return "Asiento seleccionado: #" + numeroAsiento;
    }

    public double calcularPrecioAsiento() {
        return precioAsiento;
    }

    public String mostrarHorarioSeleccionado(String opcionHorario) {
        return "HORARIO SELECCIONADO\n"
                + "--------------------------\n"
                + opcionHorario + "\n";
    }

    public String mostrarAsientoSeleccionado() {
        return "ASIENTO SELECCIONADO\n"
                + "--------------------------\n"
                + "Número de asiento: " + numeroAsiento + "\n"
                + "Cargo extra: $" + precioAsiento + "\n";
    }

    public String mostrarResumenAsiento(String opcionHorario) {
        return mostrarHorarioSeleccionado(opcionHorario)
                + "\n"
                + mostrarAsientoSeleccionado();
    }

}
package Sistema_Boleteria;

public class Terminal {

    public String nombre;
    public String cedula;
    public String origen;
    public String destino;
    public double precio;

    public Terminal(String nombre, String cedula, String origen, String destino, double precio) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.origen = origen;
        this.destino = destino;
        this.precio = precio;
    }

    public boolean validarTerminal() {
        return !nombre.isEmpty()
                && nombre.matches("[A-Za-zÁÉÍÓÚáéíóúÑñ ]+")
                && cedula.matches("[0-9]{10}")
                && !origen.isEmpty()
                && !destino.isEmpty()
                && precio > 0;
    }

    public int obtenerRuta() {
        if (destino.equals("Guayaquil")) {
            return 1;
        } else if (destino.equals("Loja")) {
            return 2;
        } else if (destino.equals("Quito")) {
            return 3;
        } else if (destino.equals("Cuenca")) {
            return 4;
        } else {
            return 0;
        }
    }

    public String obtenerDuracion() {
        if (destino.equals("Guayaquil")) {
            return "4 horas";
        } else if (destino.equals("Loja")) {
            return "6 horas";
        } else if (destino.equals("Quito")) {
            return "12 horas";
        } else if (destino.equals("Cuenca")) {
            return "4 horas";
        } else {
            return "No disponible";
        }
    }

    public double calcularPrecio() {
        return precio;
    }

    public String mostrarInfo() {
        return "Cliente: " + nombre + "\n"
                + "Cédula: " + cedula + "\n"
                + "Origen: " + origen + "\n"
                + "Destino: " + destino + "\n"
                + "Duración: " + obtenerDuracion() + "\n"
                + "Precio base: $" + precio + "\n";
    }
}
package Sistema_Boleteria;

public class Horario extends Terminal {

    public String horaSalida;
    public String horaLlegada;
    public String anden;
    public String horario1;
    public String horario2;

    public Horario(String nombre, String cedula, String origen, String destino, double precio,
            String horaSalida, String horaLlegada, String anden) {

        super(nombre, cedula, origen, destino, precio);

        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.anden = anden;
    }


    public String obtenerHorario1() {
        if (obtenerRuta() == 1) {
            return "08:00 AM - 02:00 PM - Andén 1";
        } else if (obtenerRuta() == 2) {
            return "07:00 AM - 01:00 PM - Andén 1";
        } else if (obtenerRuta() == 3) {
            return "06:00 AM - 06:00 PM - Andén 4";
        } else if (obtenerRuta() == 4) {
            return "09:00 AM - 01:00 PM - Andén 7";
        } else {
            return "Seleccione Horario";
        }
    }

    public String obtenerHorario2() {
        if (obtenerRuta() == 1) {
            return "21:00 PM   - Andén 2";
        } else if (obtenerRuta() == 2) {
            return "11:00 AM  - Andén 2";
        } else if (obtenerRuta() == 3) {
            return "08:00 AM  - Andén 5";
        } else if (obtenerRuta() == 4) {
            return "12:00 PM  - Andén 8";
        } else {
            return "Seleccione Horario";
        }
    }

    public String mostrarHorario1() {

    Buces bus = new Buces(
            nombre,
            cedula,
            origen,
            destino,
            precio,
            "",
            "",
            ""
    );

    horario1 = "OPCIÓN 1\n"
            + "--------------------------\n"
            + "Cliente: " + nombre + "\n"
            + "Cédula: " + cedula + "\n"
            + "Ruta: " + origen + " -> " + destino + "\n"
            + "Cooperativa: " + bus.obtenerCooperativa1() + "\n"
            + "Chofer: " + bus.obtenerChofer1() + "\n"
            + "Placa: " + bus.generarPlaca() + "\n"
            + "Duración: " + obtenerDuracion() + "\n"
            + "Horario: " + obtenerHorario1() + "\n";

    return horario1;
}

public String mostrarHorario2() {

    Buces bus = new Buces(
            nombre,
            cedula,
            origen,
            destino,
            precio,
            "",
            "",
            ""
    );

    horario2 = "OPCIÓN 2\n"
            + "--------------------------\n"
            + "Cliente: " + nombre + "\n"
            + "Cédula: " + cedula + "\n"
            + "Ruta: " + origen + " -> " + destino + "\n"
            + "Cooperativa: " + bus.obtenerCooperativa2() + "\n"
            + "Chofer: " + bus.obtenerChofer2() + "\n"
            + "Placa: " + bus.generarPlaca() + "\n"
            + "Duración: " + obtenerDuracion() + "\n"
            + "Horario: " + obtenerHorario2() + "\n";

    return horario2;
    }

   public String prepararHorarios() {
    horario1 = mostrarHorario1();
    horario2 = mostrarHorario2();
   
    return "Horarios preparados";
   }
  
    public String seleccionarHorario(int opcion) {
    if (opcion == 1) {
        return horario1;
    } else if (opcion == 2) {
        return horario2;
    } else {
        return "No se seleccionó ningún horario";
    }
    }
    
}
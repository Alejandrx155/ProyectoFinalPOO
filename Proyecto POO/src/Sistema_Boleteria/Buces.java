package Sistema_Boleteria;
public class Buces extends Terminal {

    public String cooperativa;
    public String chofer;
    public String placa;

    public Buces(String nombre, String cedula, String origen, String destino, double precio,
                 String cooperativa, String chofer, String placa) {

        super(nombre, cedula, origen, destino, precio);

        this.cooperativa = cooperativa;
        this.chofer = chofer;
        this.placa = placa;
    }

 

    public String obtenerCooperativa1() {
        if (obtenerRuta() == 1) {
            return "Cooperativa INTRAMILTON";
        } else if (obtenerRuta() == 2) {
            return "Flota GUIAS";
        } else if (obtenerRuta() == 3) {
            return "Cooperativa NOFORZAR";
        } else if (obtenerRuta() == 4) {
            return "Cooperativa EL ABUELITO";
        } else {
            return "Seleccione Cooperativa";
        }
    }

    public String obtenerCooperativa2() {
        if (obtenerRuta() == 1) {
            return "Transportes ANALISTA";
        } else if (obtenerRuta() == 2) {
            return "Cooperativa VENTAS VENDEN";
        } else if (obtenerRuta() == 3) {
            return "Transportes AÃ‘AVOY";
        } else if (obtenerRuta() == 4) {
            return "Flota LA VIRGEN";
        } else {
            return "Seleccione Cooperativa";
        }
    }

    public String obtenerChofer1() {
        if (obtenerRuta() == 1) {
            return "KEVIN MOROCHO";
        } else if (obtenerRuta() == 2) {
            return "MILTON ARMIJOS";
        } else if (obtenerRuta() == 3) {
            return "CHRISTIAN MALDONADO";
        } else if (obtenerRuta() == 4) {
            return "NGOLO KANTE";
        } else {
            return "Conductor Asignado";
        }
    }

    public String obtenerChofer2() {
        if (obtenerRuta() == 1) {
            return "ARNOLD MOYON";
        } else if (obtenerRuta() == 2) {
            return "KYLIAM MBAPPE";
        } else if (obtenerRuta() == 3) {
            return "MOISES CAICEDO";
        } else if (obtenerRuta() == 4) {
            return "JOEL BLACIO";
        } else {
            return "Conductor Asignado";
        }
    }

    public String generarPlaca() {
        if (obtenerRuta() == 1) {
            return "ABC-101";
        } else if (obtenerRuta() == 2) {
            return "DEF-201";
        } else if (obtenerRuta() == 3) {
            return "GHI-301";
        } else if (obtenerRuta() == 4) {
            return "JKL-401";
        } else {
            return "SIN-000";
        }
    }

}
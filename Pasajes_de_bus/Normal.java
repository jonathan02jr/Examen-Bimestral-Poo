package Pasajes_de_bus;

class Normal extends Servicios {

    public Normal(String nombreCliente, int numeroTicket, double ruta1,double ruta2,double ruta3,double ruta4,String asiento){
        super(nombreCliente, numeroTicket, ruta1, ruta2, ruta3, ruta4,asiento);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("---- PAQUETE NORMAL ----");
        System.out.println("Espacio para una maleta");
        System.out.println("Seleccion de asientos");
        System.out.println("Asiento: "+getAsiento());

    }

    @Override
    public void calcularCosto() {
        System.out.println("Precio total ruta 1: "+getRuta1());
        System.out.println("Precio total ruta 2: "+getRuta2());
        System.out.println("Precio total ruta 3: "+getRuta3());
        System.out.println("Precio total ruta 4: "+getRuta4());
    }
}

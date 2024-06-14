package Pasajes_de_bus;

class Vip extends Servicios {
    private double precioVip;

    public Vip(String nombreCliente, int numeroTicket, double ruta1,double ruta2,double ruta3,double ruta4,String asiento, double precioVip){
        super(nombreCliente, numeroTicket, ruta1, ruta2, ruta3, ruta4,asiento);
        this.precioVip=precioVip;
    }

    public double getPrecioVip() {
        return precioVip;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("---- PAQUETE VIP ----");
        System.out.println("Television y Internet");
        System.out.println("Espacio para 2 maletas");
        System.out.println("Precio Vip 30%");
    }

    @Override
    public void calcularCosto() {

        double total1= (precioVip * getRuta1()) + getRuta1();
        System.out.println("Precio total ruta 1: "+total1);
        double total2= (precioVip * getRuta2()) + getRuta2();
        System.out.println("Precio total ruta 2: "+total2);
        double total3= (precioVip * getRuta3() + getRuta3());
        System.out.println("Precio total ruta 3: "+total3);
        double total4= (precioVip * getRuta4() + getRuta4());
        System.out.println("Precio total ruta 4: "+total4);
    }
}

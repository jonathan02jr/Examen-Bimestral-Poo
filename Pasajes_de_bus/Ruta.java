package Pasajes_de_bus;

class Ruta extends Ticket{
    private double ruta1;
    private double ruta2;
    private double ruta3;
    private double ruta4;


    public Ruta(String nombreCliente, int numeroTicket, double ruta1,double ruta2,double ruta3,double ruta4){
        super(nombreCliente,numeroTicket);
        this.ruta1=ruta1;
        this.ruta2=ruta2;
        this.ruta3=ruta3;
        this.ruta4=ruta4;
    }

    public double getRuta1() {
        return ruta1;
    }

    public double getRuta2() {
        return ruta2;
    }

    public double getRuta3() {
        return ruta3;
    }

    public double getRuta4() {
        return ruta4;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("1. Quito-Guayaquil - $"+ruta1);
        System.out.println("2. Quito-Puyo - $"+ruta2);
        System.out.println("3. Quito-Tulcan - $"+ruta3);
        System.out.println("4. Quito-Riobamba - $"+ruta4);
    }

    @Override
    public void calcularCosto() {
        super.calcularCosto();
    }
}

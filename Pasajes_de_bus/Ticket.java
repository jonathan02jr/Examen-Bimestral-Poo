package Pasajes_de_bus;

public class Ticket {
    public String nombreCliente;
    public int numeroTicket;

    public Ticket(String nombreCliente, int numeroTicket){
        this.nombreCliente=nombreCliente;
        this.numeroTicket=numeroTicket;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void mostrarInfo(){
        System.out.println("Nombre del pasajero: "+nombreCliente);
        System.out.println("Numero de ticket: "+numeroTicket);
    }

    public void calcularCosto(){

    }
}

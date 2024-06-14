package Pasajes_de_bus;

class Servicios extends Ruta{
    private String asiento;

    public Servicios(String nombreCliente, int numeroTicket, double ruta1,double ruta2,double ruta3,double ruta4,String asiento){
        super(nombreCliente, numeroTicket, ruta1, ruta2, ruta3, ruta4);
        this.asiento= asiento;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
    }
}

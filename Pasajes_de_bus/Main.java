package Pasajes_de_bus;

public class Main {
    public static void main(String[] args){

        //Objetos con valores iniciales
        Normal lugar1 = new Normal("Jonathan",001,20,15,17.50,17.60,"Ventana");
        System.out.println("\n");
        //ejemplo donde se muestra todas las rutas
        System.out.println("EJEMPLO DE PRIMER CLIENTE");
        lugar1.mostrarInfo();
        System.out.println("--------------------");
        lugar1.calcularCosto();

        Normal lugar2 = new Normal("Andres",002,0,0,0,17.60,"Atras");
        System.out.println("\n");
        lugar2.mostrarInfo();
        System.out.println("--------------------");
        lugar2.calcularCosto();

        Normal lugar3 = new Normal("Evelyn",003,0,15,0,0,"Pasillo");
        System.out.println("\n");
        lugar3.mostrarInfo();
        System.out.println("--------------------");
        lugar3.calcularCosto();

        //Objetos nulos y luego seteados
        Vip lugar4 = new Vip("Josue",004,20,0,0,0,"Adelante",0.30);
        System.out.println("\n");
        lugar4.setNombreCliente("Jordan");
        lugar4.mostrarInfo();
        System.out.println("--------------------");
        lugar4.calcularCosto();

        Vip lugar5 = new Vip("Joaquin",05,0,15,0,0,"",0.30);
        System.out.println("\n");
        lugar5.setAsiento("Adelante");
        lugar5.mostrarInfo();
        System.out.println("--------------------");
        lugar5.calcularCosto();

        Vip lugar6 = new Vip("",006,0,0,17.50,0,"",0.30);
        System.out.println("\n");
        lugar6.setNombreCliente("Natalya");
        lugar6.mostrarInfo();
        System.out.println("--------------------");
        lugar6.calcularCosto();



    }
}

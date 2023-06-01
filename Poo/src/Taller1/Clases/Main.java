package Taller1.Clases;


import Taller1.Clases.Carro;

public class Main {
    public static void main(String[] args) {

        // Instanciar clases
        Carro carro1= new Carro("Ford", "Mustang","Rojo",2019);
        Carro carro2= new Carro("Toyota", "Camry","Plateado",2022);

        carro1.acelerar();
        carro1.frenar();
        carro1.girar("Derecha");
        carro1.setColor("Negro");
        carro1.mostrarInformacion();

        System.out.println(" ");

        carro2.acelerar();
        carro2.frenar();
        carro2.girar("Izquieda");
        carro2.setAnio(2021);
        carro2.mostrarInformacion();



        }
    }

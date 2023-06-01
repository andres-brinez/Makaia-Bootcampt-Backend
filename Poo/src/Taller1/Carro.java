package Taller1;

public class Carro {

    //Atributos
    private String marca;
    private String modelo;
    private String color;
    private int anio;

    //Constructor
    public Carro(String marca, String modelo, String color,int anio ) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
    }

    //Metodos
    public void acelerar(){
        System.out.println("El carro está acelerando");
    }

    public void frenar(){
        System.out.println("El carro está frenando ");
    }

    public void girar(String direccion){
        System.out.println("El carro está girarndo a la "+ direccion);
    }

    public void mostrarInformacion(){

        System.out.println("La marca del carro es " + this.marca);
        System.out.println("El modelo del carro es " + this.modelo);
        System.out.println("El color del carro es " +  this.color);
        System.out.println("El año de fabricación del carro es " + this.anio);

    }

    //Getters
    public String getMarca() {
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getColor(){
        return this.color;
    }

    public int getAnio(){
        return this.anio;
    }


    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo=modelo;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }


}

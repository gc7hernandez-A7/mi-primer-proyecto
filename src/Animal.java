public  abstract class Animal {
    //Atributos
    private String nombre;
    private int edad;
    private int velocidad;

    //constructor sin parámetros
    public Animal(){

    }
    //constructor con parámetros
    public Animal(String nombre, int edad, int velocidad){
        this.nombre=nombre;
        this.edad=edad;
        this.velocidad=velocidad;
    }
   


    public abstract void metodoA();

}

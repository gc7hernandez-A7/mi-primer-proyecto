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

    //get
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    } 
    public int getVelocidad(){
        return velocidad;
    }

    //set
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setEdad (int edad){
        this.edad=edad;
    }
    public void setVelocidad(int velocidad){
        this.velocidad=velocidad;
    }


    public abstract void metodoA();

}

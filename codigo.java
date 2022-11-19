public class MyClass {

    public static void main(String[] args){
    
    Persona person1 = new Persona();
    
    person1.setEdad(25);
    person1.setNombre("carlos");
    person1.setTelefono(12334456);
    
    System.out.println(person1.getEdad());
    System.out.println(person1.getTelefono());
    System.out.println(person1.getNombre());
        }
}
    
    class Persona {
    
    private int edad;
    private int telefono;
    private String nombre;
    
    public void setEdad(int edad){
    this.edad = edad;
    }
    
    public void setTelefono(int telefono){
    this.telefono = telefono;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getEdad(){
    return this.edad;
    }
    
    public int getTelefono(){
    return this.telefono;
    }
    
    public String getNombre(){
    return this.nombre;
    }
    
}
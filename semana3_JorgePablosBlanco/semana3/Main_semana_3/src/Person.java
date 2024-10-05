public class Person {

    private String nombre; //Pepe,Juan...
    private Float altura;
    private Float peso;

    Person(){ //VACIO.

    }

    Person(String nombre, float altura){ // ALGUNOS.
        this.nombre = nombre;
        this.altura = altura;

    }

    public Person(String nombre, float altura, float peso) {  //TODOS. 
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
    }
    //Se pueden generar constructores automaticamente, con boton derecho > source action >
    //generate constructors.

    public String getNombre() {
        return nombre;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    /*  get: objeto getTipoPerson();
     * 
     *  set: objeto getTipoPerson();
     */

    
    
}

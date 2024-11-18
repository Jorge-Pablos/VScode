import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

       
        System.out.println("\t*************\t");
        System.out.println("\t BIENVENIDOS\t");
        System.out.println("\t*************\t");

      /*   public class Person {

            string nombre; 
            float altura;
            float peso;             */




        Scanner s = new Scanner(System.in);
        Person p1 = new Person();

        System.out.println("Introduzca el Nombre de la Persona1: ");
        String Nombre = s.nextLine();
        System.out.println("Introduzca la Altura de la Persona1: ");
        Float Altura = s.nextFloat();
        System.out.println("Introduzca el Peso de la Persona1: ");
        Float Peso = s.nextFloat();

        p1.setNombre(Nombre);
        p1.setAltura(Altura);
        p1.setPeso(Peso);


        System.out.println("Introduzca el Nombre de la Persona2: ");
        s.nextLine();
        String Nombre2 = s.nextLine();
        System.out.println("Introduzca la Altura de la Persona2: ");
        Float Altura2 = s.nextFloat();
        System.out.println("Introduzca el Peso de la Persona2: ");
        Float Peso2 = s.nextFloat();
        
        Person p2 = new Person(Nombre2, Altura2, Peso2);
        Person p3 = new Person("Harry", 190, 90);

        System.out.println("Soy la Persona 1 y me llamo "+p1.getNombre());
        System.out.println("Soy la Persona 2 y me llamo "+p2.getNombre());
        System.out.println("Soy la Persona 3 y me llamo "+p3.getNombre());


        //COMPARACIONES DE ALTURA Y PESO

        if(p1.getAltura() > p2.getAltura() && p1.getAltura() > p3.getAltura()){
            System.out.println("La persona más alta es: "+ p1.getNombre());
        }
        else if(p2.getAltura() > p1.getAltura() && p2.getAltura() > p3.getAltura()){
            System.out.println("La persona más alta es: "+ p2.getNombre());
        }
        else if(p3.getAltura() > p1.getAltura() && p3.getAltura() > p2.getAltura()){
            System.out.println("La persona más alta es: "+ p3.getNombre());
        }
        if(p1.getPeso() > p2.getPeso() && p1.getPeso() > p3.getPeso()){
            System.out.println("La persona más gorda es: "+ p1.getNombre());
        }
        else if(p2.getPeso() > p1.getPeso() && p2.getPeso() > p3.getPeso()){
            System.out.println("La persona más gorda es: "+ p2.getNombre());
        }
        else if(p3.getPeso() > p1.getPeso() && p3.getPeso() > p1.getPeso()){
            System.out.println("La persona más gorda es: "+ p3.getNombre());
        }


    }
}

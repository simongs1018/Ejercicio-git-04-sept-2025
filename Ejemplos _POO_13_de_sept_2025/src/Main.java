public class Main {
    public static void main(String[] args) {

        //-Encapsulamiento-//
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setEdad(25);
        System.out.println("Encapsulamiento -> Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());

        //-Abstracción-//
        Animal perro = new Perro();
        Animal gato = new Gato();
        System.out.print("Abstracción -> ");
        perro.hacerSonido(); // Guau
        System.out.print("Abstracción -> ");
        gato.hacerSonido();  // Miau

        //-Herencia-//
        PerroDomestico p = new PerroDomestico();
        System.out.print("Herencia -> ");
        p.comer();   // Método heredado de ANIMAL
        System.out.print("Herencia -> ");
        p.ladrar();  // Método propio

        //-Polimorfismo-//
        Animal miAnimal = new Perro();
        System.out.print("Polimorfismo -> ");
        miAnimal.hacerSonido(); // Guau

        miAnimal = new Gato();
        System.out.print("Polimorfismo -> ");
        miAnimal.hacerSonido(); // Miau

        //-Record-//
        Direccion direccion = new Direccion("Calle 123", "Bogotá", 110111);
        System.out.println("Record -> " + direccion);
    }
}

//-Encapsulamiento-//
class Persona {
    private String nombre;
    private int edad;

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
}

//-Abstracción-//
abstract class Animal {
    abstract void hacerSonido();
}

class Perro extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("Guau");
    }
}

class Gato extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("Miau");
    }
}

//-Herencia-//
class ANIMAL {
    void comer() {
        System.out.println("Este animal come");
    }
}

class PerroDomestico extends ANIMAL {
    void ladrar() {
        System.out.println("Guau");
    }
}

//-Record-//
// Disponible desde Java 14+
record Direccion(String calle, String ciudad, int codigoPostal) {}


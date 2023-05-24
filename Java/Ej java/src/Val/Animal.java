// Superclase
class Animal {
    String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }
}

// Subclase que hereda de Animal
class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    public void ladrar() {
        System.out.println(nombre + " está ladrando.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la subclase Perro
        Perro perro = new Perro("Max");

        // Acceder a los métodos de la superclase Animal
        perro.comer();

        // Acceder a los métodos de la subclase Perro
        perro.ladrar();
    }
}
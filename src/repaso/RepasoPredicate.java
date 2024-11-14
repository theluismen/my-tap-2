package repaso;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RepasoPredicate {
    // Cargar Personas Para hacer el ejemplo
    public static List<Persona> cargarPersonas () {
        List<Persona> personas = new ArrayList<>();

        personas.add( new Persona("Pau", 17) );
        personas.add( new Persona("Lamine", 17) );
        personas.add( new Persona("Dani", 26) );
        personas.add( new Persona("Robert", 35) );
        personas.add( new Persona("Leo", 37) );

        return personas;
    }

    public static void main(String[] args) {
        // Predicate<T> es una interfaz con un metodo: boolean test ( T t )
        //  sobre un objecto de este tipo se pueden hacer operaciones lógicas como:
        //   and(), or(), negate()

        Predicate<Persona> mayorEdad = persona -> persona.getEdad() > 18;

        List<Persona> personas, result;

        personas = cargarPersonas();

        result = personas.stream().filter( mayorEdad ).toList();

        result.forEach( persona -> System.out.println(persona) );
    }
}
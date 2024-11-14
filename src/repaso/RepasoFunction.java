package repaso;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class RepasoFunction {
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
        // Function<T,R> es una interfaz con un principal: R apply( T t )
        //  representa que es una función que recibe T y devuelve R

        Function<Persona, Integer> nLetras = persona -> persona.getNombre().length();

        List<Persona> personas;
        List<Integer> result;

        personas = cargarPersonas();

        result = personas.stream().map( nLetras ).toList();

        Iterator<Persona> personasIt = personas.iterator();
        Iterator<Integer> resultIt = result.iterator();

        while ( personasIt.hasNext() ) {
            System.out.format("%-10s -> %2d\n", personasIt.next().getNombre(), resultIt.next());
        }
    }
}

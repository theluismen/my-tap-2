package exercise4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /* Exercise 4: In map2.Map, change the code to enable map return a different type of List<R>
       than the one passed by parameter List<T>. Show an example where from a list of Strings with map
       and a Lambda we can obtain a List<Integer> with the sizes of each String. */
    public static void main(String[] args) {
        List<String> plantilla = new ArrayList<>();

        plantilla.add("Lamine Yamal");
        plantilla.add("Cubarsi");
        plantilla.add("Fermin Lopez");
        plantilla.add("Marc Casadó");

        //List<Integer> numeros = Map.map( plantilla, nombre -> nombre.length() );
        List<Integer> numeros = Map.map( plantilla, String::length );

        for ( int i = 0; i < plantilla.size(); i++ ) {
            System.out.println( plantilla.get(i) + " -> " + numeros.get(i) );
        }
    }
}

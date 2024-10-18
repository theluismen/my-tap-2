package exercise1;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {

    public static <T> List<T> filter ( List<T> list, Predicate<T> pred ) {
        List<T> filt = new ArrayList<>();

        for ( T elem: list ) {
            if ( pred.test(elem) ) {
                filt.add(elem);
            }
        }

        return filt;
    }

    // Exercise 1: Implement filter function in Java.
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Predicate<Integer> odd;
        List<Integer> numsList = new ArrayList<>();
        List<Integer> odds;

        System.out.println("-- Exercise 1 --");
        /* Añadir numeros del VECTOR a una List */
        System.out.print("Nums: ");
        for ( Integer i: nums ) {
            System.out.print( i + " " );
            numsList.add( i );
        }
        System.out.println();

        /* Definir el Predicate y filtrar */
        odd = x -> ( x%2 ) != 0;
        odds = filter( numsList, odd );

        System.out.print("Odds: ");
        for ( Integer i: odds ) {
            System.out.print( i + " " );
        }
    }
}

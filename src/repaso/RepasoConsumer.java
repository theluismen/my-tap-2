package repaso;

import java.util.function.Consumer;

public class RepasoConsumer {
    public static void main(String[] args) {
        // Consumer<T> recibe un tipo de dato y NO devuelve nada, sino que ejecuta algo
        //  su principal metodo es: void accept()
        Consumer<String> letras = cadena -> System.out.println( cadena.length() );
        letras.accept( "Maricon" );
    }
}

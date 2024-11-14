package repaso;

public class RepasoRunnable {
    public static void main(String[] args) {
        // Runnable es una interfaz con un metodo principal: void run()
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("i:" + i);
            }
        };

        task.run();
    }
}

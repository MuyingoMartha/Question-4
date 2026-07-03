package naro;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Part (a): for loop vs while loop ===");
        LoopDemo.recordWithForLoop();
        LoopDemo.recordWithWhileLoop();

        System.out.println("\n=== Part (c): array snippet analysis ===");
        ArrayAnalysis.run();

        System.out.println("\n=== Part (d): full rainfall program ===");
        RainfallProgram.run();
    }
}
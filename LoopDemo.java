package naro;

public class LoopDemo {

    // for loop: best when the number of iterations is known in advance
    // (here, exactly 30 days).
    public static void recordWithForLoop() {
        int[] rainfall = new int[30];
        java.util.Random rand = new java.util.Random();
        for (int day = 0; day < 30; day++) {
            rainfall[day] = rand.nextInt(61); // 0 to 60 mm
        }
        System.out.println("For-loop readings: " + java.util.Arrays.toString(rainfall));
    }

    // while loop: best when the stopping condition isn't simply a fixed
    // count, e.g. "keep reading until the sensor sends an end-of-month flag".
    public static void recordWithWhileLoop() {
        int[] rainfall = new int[30];
        java.util.Random rand = new java.util.Random();
        int day = 0;
        while (day < 30) {
            rainfall[day] = rand.nextInt(61);
            day++;
        }
        System.out.println("While-loop readings: " + java.util.Arrays.toString(rainfall));
    }
}
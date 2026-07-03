package naro;

import java.util.Random;

public class RainfallProgram {

    public static void run() {
        Random rand = new Random();
        int[] rainfall = new int[30];

        // (i) Generate 30 random daily readings between 0 and 60 mm
        for (int day = 0; day < 30; day++) {
            rainfall[day] = rand.nextInt(61); // 0..60 inclusive
        }

        // (ii) Total and average
        int total = 0;
        for (int day = 0; day < 30; day++) {
            total += rainfall[day];
        }
        double average = total / 30.0;

        // (iii) Count wet days (> 30 mm)
        int wetDays = 0;
        for (int day = 0; day < 30; day++) {
            if (rainfall[day] > 30) {
                wetDays++;
            }
        }

        // Print the readings and the results
        System.out.println("Daily rainfall (mm): " + java.util.Arrays.toString(rainfall));
        System.out.println("Total monthly rainfall: " + total + " mm");
        System.out.printf("Average daily rainfall: %.2f mm%n", average);
        System.out.println("Number of wet days (>30mm): " + wetDays);

        // (iv) Classify the month
        String classification;
        if (total <= 300) {
            classification = "Dry";
        } else if (total < 600) {
            classification = "Normal";
        } else {
            classification = "Flood-risk";
        }
        System.out.println("Month classification: " + classification);
    }
}
package pl.edu.pjwstk.mpr;

import java.io.*;

public class WeightedAverage {

    private final File testFile;

    public WeightedAverage(String filePath) {
        this.testFile = new File("./src/test/resources/" + filePath);
    }


    public WeightedAverage() {
        testFile = null;
    }

    public double calculate() {
        int x = 1;
        double sumkaa = 0;
        double suma = 0;
        double sumax = 0;
        if (!testFile.exists()) {
            throw new IllegalArgumentException("File does not exist.");
        }
        try (
                var fR = new FileReader(testFile);
                var reader = new BufferedReader(fR)
        ) {
            String line = null;

            while ((line = reader.readLine()) != null) {
                var arr = line.split("");

                for (int g = 0; g < line.length(); g++) {

                    suma += Integer.parseInt(arr[0]) * Integer.parseInt(arr[2]);
                    sumax += Integer.parseInt(arr[0]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        double elo = suma/sumax;
        double roundOff = Math.round(elo*100)/100;
//        DecimalFormat sumaa = new DecimalFormat("0.#");
//        Double sumaaa= Double.parseDouble(sumaa.format(sumkaa));

        return roundOff;
    }
}
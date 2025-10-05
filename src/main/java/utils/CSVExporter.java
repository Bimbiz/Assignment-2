package utils;

import java.io.FileWriter;
import java.io.IOException;

public class CSVExporter {

    private final String filePath;

    public CSVExporter(String filePath) {
        this.filePath = filePath;
    }

    public void appendResult(int n, String sequence, double timeMs, long comparisons, long swaps) {
        boolean fileExists = new java.io.File(filePath).exists();

        try (FileWriter writer = new FileWriter(filePath, true)) {
            if (!fileExists) {
                writer.write("n,sequence,time_ms,comparisons,swaps\n");
            }

            writer.write(String.format("%d,%s,%.2f,%d,%d\n", n, sequence, timeMs, comparisons, swaps));
        } catch (IOException e) {
            System.err.println("Error writing to CSV file: " + e.getMessage());
        }
    }
}

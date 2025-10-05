package cli;

import algorithms.ShellSort;
import metrics.PerformanceTracker;
import java.util.Random;

public class BenchmarkRunner {
    public static void main(String[] args) {
        int n = args.length > 0 ? Integer.parseInt(args[0]) : 10000;
        String sequence = args.length > 1 ? args[1] : "knuth";

        int[] arr = new Random().ints(n, 0, 100000).toArray();

        ShellSort sorter = new ShellSort();
        long start = System.nanoTime();
        sorter.sort(arr, sequence);
        long end = System.nanoTime();

        PerformanceTracker m = sorter.getMetrics();
        System.out.printf("Sequence: %s%nTime: %.2f ms%nComparisons: %d%nSwaps: %d%n",
                sequence, (end - start) / 1e6, m.getComparisons(), m.getSwaps());
    }
}

package algorithms;

import metrics.PerformanceTracker;

public class ShellSort {
    private final PerformanceTracker tracker = new PerformanceTracker();

    public void sort(int[] arr, String sequenceType) {
        int n = arr.length;
        int[] gaps = generateGaps(n, sequenceType);

        for (int gap : gaps) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;
                while (j >= gap && tracker.compare(arr[j - gap], temp) > 0) {
                    arr[j] = arr[j - gap];
                    tracker.incrementSwaps();
                    j -= gap;
                }
                arr[j] = temp;
            }
        }
    }

    private int[] generateGaps(int n, String type) {
        switch (type.toLowerCase()) {
            case "knuth":
                return knuthSequence(n);
            case "sedgewick":
                return sedgewickSequence(n);
            default:
                return shellSequence(n);
        }
    }

    private int[] shellSequence(int n) {
        int[] gaps = new int[(int) (Math.log(n) / Math.log(2))];
        int k = 1;
        for (int i = gaps.length - 1; i >= 0; i--) {
            gaps[i] = k;
            k *= 2;
        }
        return gaps;
    }

    private int[] knuthSequence(int n) {
        java.util.List<Integer> gaps = new java.util.ArrayList<>();
        int h = 1;
        while (h < n / 3) {
            gaps.add(0, h);
            h = 3 * h + 1;
        }
        return gaps.stream().mapToInt(Integer::intValue).toArray();
    }

    private int[] sedgewickSequence(int n) {
        java.util.List<Integer> gaps = new java.util.ArrayList<>();
        int k = 0;
        int gap;
        do {
            if (k % 2 == 0)
                gap = 9 * ((int) Math.pow(2, k) - (int) Math.pow(2, k / 2)) + 1;
            else
                gap = 8 * (int) Math.pow(2, k) - 6 * (int) Math.pow(2, (k + 1) / 2) + 1;
            if (gap < n)
                gaps.add(0, gap);
            k++;
        } while (gap < n);
        return gaps.stream().mapToInt(Integer::intValue).toArray();
    }

    public PerformanceTracker getMetrics() {
        return tracker;
    }
}

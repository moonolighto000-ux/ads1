import java.util.Arrays;

public class Experiment {
    private Sorter sorter = new Sorter();
    private Searcher searcher = new Searcher();

    public long measureSortTime(int[] arr, String type) {
        long startTime = System.nanoTime();
        if (type.equals("basic")) {
            sorter.basicSort(arr);
        } else {
            sorter.advancedSort(arr);
        }
        return System.nanoTime() - startTime;
    }

    public long measureSearchTime(int[] arr, int target) {
        long startTime = System.nanoTime();
        searcher.search(arr, target);
        return System.nanoTime() - startTime;
    }

    public void runAllExperiments() {
        int[] sizes = {10, 100, 1000};

        for (int size : sizes) {
            System.out.println("\n--- Testing Array Size: " + size + " ---");
            int[] data = sorter.generateRandomArray(size);

            int[] bubbleData = Arrays.copyOf(data, data.length);
            long bTime = measureSortTime(bubbleData, "basic");
            System.out.println("Bubble Sort Time: " + bTime + " ns");

            int[] mergeData = Arrays.copyOf(data, data.length);
            long mTime = measureSortTime(mergeData, "advanced");
            System.out.println("Merge Sort Time: " + mTime + " ns");

            long sTime = measureSearchTime(data, -1);
            System.out.println("Linear Search Time: " + sTime + " ns");
        }
    }
}
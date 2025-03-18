package timingtest;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by hug.
 */
public class TimeSLList {
    private static void printTimingTable(AList<Integer> Ns, AList<Double> times, AList<Integer> opCounts) {
        System.out.printf("%12s %12s %12s %12s\n", "N", "time (s)", "# ops", "microsec/op");
        System.out.printf("------------------------------------------------------------\n");
        for (int i = 0; i < Ns.size(); i += 1) {
            int N = Ns.get(i);
            double time = times.get(i);
            int opCount = opCounts.get(i);
            double timePerOp = time / opCount * 1e6;
            System.out.printf("%12d %12.2f %12d %12.2f\n", N, time, opCount, timePerOp);
        }
    }

    public static void main(String[] args) {
        timeGetLast();
    }

    public static void timeGetLast() {
        // TODO: YOUR CODE HERE
        // Create all 3 columns (N, time, opCount) and a test list
        AList<Integer> Ns = new AList<>();
        AList<Double> times = new AList<>();
        AList<Integer> opCounts = new AList<>();
        int[] testingList = {1000, 2000, 4000, 8000, 16000, 32000, 64000, 128000};
        int M = 10000;

        for (int testingNum = 0; testingNum < testingList.length; testingNum += 1){
            // To get the actual data and it's running time
            SLList<Integer> L = new SLList<>();
            // Add N items to the list
            for (int i = 0; i < testingList[testingNum]; i += 1){
                L.addLast(0);
            }
            // Perform get last M times and get it's running time
            Stopwatch sw = new Stopwatch();
            for (int i = 0; i < M; i += 1){
                L.getLast();
            }
            Double timeInSeconds = sw.elapsedTime();

            // Add the data to the columns
            Ns.addLast(testingList[testingNum]);
            times.addLast(timeInSeconds);
            opCounts.addLast(M);
        }

        printTimingTable(Ns, times, opCounts);
    }

}

import java.util.Random;

public class Experiment {

    public void runMultipleTests() {
        int[] sizes = {10, 30, 100};

        for (int size : sizes) {
            System.out.println("--- Testing Graph with " + size + " vertices ---");
            Graph g = createRandomGraph(size);

            if (size == 10) {
                g.printGraph();
            }

            runTraversals(g);
            System.out.println();
        }
    }

    public void runTraversals(Graph g) {
        int startNode = 0;

        long startTimeBfs = System.nanoTime();
        g.bfs(startNode);
        long endTimeBfs = System.nanoTime();
        long durationBfs = endTimeBfs - startTimeBfs;

        long startTimeDfs = System.nanoTime();
        g.dfs(startNode);
        long endTimeDfs = System.nanoTime();
        long durationDfs = endTimeDfs - startTimeDfs;

        printResults(durationBfs, durationDfs);
    }

    private Graph createRandomGraph(int vertices) {
        Graph g = new Graph();
        Random random = new Random();

        for (int i = 0; i < vertices; i++) {
            g.addVertex(new Vertex(i));
        }

        for (int i = 0; i < vertices * 2; i++) {
            int from = random.nextInt(vertices);
            int to = random.nextInt(vertices);
            if (from != to) {
                g.addEdge(from, to);
            }
        }
        return g;
    }

    public void printResults(long bfsTime, long dfsTime) {
        System.out.println("BFS Execution Time: " + bfsTime + " ns");
        System.out.println("DFS Execution Time: " + dfsTime + " ns");
    }
}
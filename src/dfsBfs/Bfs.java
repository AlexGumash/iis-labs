package dfsBfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Bfs implements SpotsIterator {
    private HashMap<Spot, List<Spot>> graph;
    private List<Spot> visited = new ArrayList<>();
    private Spot currentSpot;
    private List<Spot> queue;

    Bfs(HashMap<Spot, List<Spot>> graph) {
        this.graph = graph;
        this.queue = new ArrayList<>();
    }

    @Override
    public boolean hasNexts() {
        return queue.size() > 0;
    }

    @Override
    public List<Spot> getNexts() {
        return graph.get(this.currentSpot);
    }

    @Override
    public boolean iterateSpots(Spot current, Spot target) {
        this.currentSpot = current;

        queue.add(this.currentSpot);
        visited.add(this.currentSpot);

        while (hasNexts()) {
            this.currentSpot = queue.remove(queue.size() - 1);
            List<Spot> nexts = getNexts();
            if (nexts == null) {
                return false;
            }
            for (Spot next : nexts) {
                if (!visited.contains(next)) {
                    queue.add(next);
                    visited.add(next);

                    if (next.getName().equals(target.getName())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

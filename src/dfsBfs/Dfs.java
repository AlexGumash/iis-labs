package dfsBfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Dfs implements SpotsIterator {
    private List<Spot> visited = new ArrayList<>();
    private HashMap<Spot, List<Spot>> graph;
    private Spot currentSpot;

    Dfs(HashMap<Spot, List<Spot>> graph) {
        this.graph = graph;
    }

    @Override
    public boolean hasNexts() {
        return graph.containsKey(currentSpot);
    }

    @Override
    public List<Spot> getNexts() {
        return graph.get(currentSpot);
    }

    public boolean iterateSpots(Spot current, Spot target) {
        this.currentSpot = current;
        if (this.currentSpot.getName().equals(target.getName())) {
            return true;
        }

        if (visited.contains(this.currentSpot)) {
            return false;
        }
        visited.add(this.currentSpot);
        if (hasNexts()) {
            List<Spot> nexts = getNexts();
            for (Spot next: nexts) {
                if (!visited.contains(next)) {
                    boolean isReached = iterateSpots(next, target);
                    if (isReached) {
                        return true;
                    }
                }
            }
        } else {
            return false;
        }

        return false;
    }


}

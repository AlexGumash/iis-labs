package dfsBfs;

import java.util.List;

public interface SpotsIterator {
    boolean hasNexts();
    boolean iterateSpots(Spot current, Spot target);
    List<Spot> getNexts();
}

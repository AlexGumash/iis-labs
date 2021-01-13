package dfsBfs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashMap<Spot, List<Spot>> graph = new HashMap<>();
        Spot home = new Spot("Дом");
        Spot forest = new Spot("Лес");
        Spot granny = new Spot("Бабушка");
        Spot river = new Spot("Речка");
        Spot tramps = new Spot("Трамплины");
        Spot downhills = new Spot("Спуски");

        graph.put(home, Arrays.asList(forest));
        graph.put(forest, Arrays.asList(granny, river));
        graph.put(granny, Arrays.asList(river));
        graph.put(river, Arrays.asList(tramps, downhills));

//        SpotsIterator dfs = new Dfs(graph);
//        System.out.println(dfs.iterateSpots(tramps, downhills));
        SpotsIterator bfs = new Bfs(graph);
        System.out.println(bfs.iterateSpots(tramps, tramps));
    }
}

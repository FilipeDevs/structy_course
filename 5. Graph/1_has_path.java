import java.util.Map;
import java.util.List;

class Source {
    public static boolean hasPath(Map<String, List<String>> graph, String src, String dst) {

        if (src.equals(dst)) {
            return true;
        }

        for (String neighbour : graph.get(src)) {
            if (hasPath(graph, neighbour, dst)) {
                return true;
            }
        }

        return false;
    }
}
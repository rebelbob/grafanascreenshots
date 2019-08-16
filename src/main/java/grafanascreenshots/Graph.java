package grafanascreenshots;

public class Graph {
    public static String getName(int i){
        switch (i){
            case 0 : return "_cpu";
            case 1 : return "_memory";
            case 2 : return "_disk";
            case 3 : return "_diskio";
            case 4 : return "_net";
            case 5 : return "_swap";
            case 6 : return "_system";
            default: return "unknown";
        }
    }
}

package exercism.logLevels;

public class Main {

    public static void main(String[] args) {

        Levels logLevels = new Levels();
        System.out.println(logLevels.message("[ERROR]: Stack overflow"));
        System.out.println(logLevels.logLevel("[ERROR]: Disk full"));
        System.out.println(logLevels.reformat("[ERROR]: Segmentation fault"));

    }
}

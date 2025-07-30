package exercism.logLevels;

public class Levels {

        public String message(String logLine) {
            int index = logLine.indexOf(":");
            return logLine.substring(index + 1).trim();
        }

        public String logLevel(String logLine) {
            int indexInitial = logLine.indexOf("[") + 1;
            int indexFinal = logLine.indexOf("]");
            return logLine.substring(indexInitial, indexFinal).toLowerCase();
        }

        public String reformat(String logLine) {
            return message(logLine) + " (" + logLevel(logLine) + ")";
        }

}

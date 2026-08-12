public class LogLevels {
    public static String message(String logLine) {
        String message = logLine.substring(logLine.indexOf(':') + 1).trim();

        return message;
    }

    public static String logLevel(String logLine) {
        String result = logLine.substring(logLine.indexOf('[') + 1, logLine.indexOf(']')).trim().toLowerCase();

        return result;
    }

    public static String reformat(String logLine) {
        String level = logLevel(logLine);
        String line = message(logLine);

        return line + " (" + level + ")";    }
}
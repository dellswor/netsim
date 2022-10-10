package configurator;

import java.io.PrintStream;

public class Logger {
    private static PrintStream LOG = System.err;

    /**
     * Logs a message to the default log stream
     * @param msg string to log
     */
    public static void log(String msg) {
        String logline = String.format("%d %s",System.currentTimeMillis(),msg);
        LOG.println(logline);
    }

    /**
     * Converts an arbitrary byte array to a String in hex
     * @param data bytes to convert
     * @return String representation
     */
    public static String hex(byte[] data) {
        StringBuffer sb = new StringBuffer(data.length*2);
        for(int i=0; i<data.length; i++) {
            sb.append(String.format("%x",data[i]));
        }
        return sb.toString();
    }
}
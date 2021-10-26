package stringmethods.filename;

import java.util.Locale;

public class UrlManager {
    public static void main(String[] args) {
        UrlManager urlManager = new UrlManager("https://earthquake.usgs.gov" +
                "/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02");
        //urlManager = new UrlManager("https://earthquake.usgs.gov:8080");
        System.out.println("protocol: " + urlManager.getProtocol());
        System.out.println("host: " + urlManager.getHost());
        System.out.println("port: " + urlManager.getPort());
        System.out.println("path: " + urlManager.getPath());
        System.out.println("query: " + urlManager.query);
        System.out.println("hasProperty(format): " + urlManager.hasProperty("format"));
        System.out.println("getProperty(format): " + urlManager.getProperty("format"));
        System.out.println("hasProperty(starttime): " + urlManager.hasProperty("starttime"));
        System.out.println("getProperty(starttime): " + urlManager.getProperty("starttime"));
        System.out.println("hasProperty(endtime): " + urlManager.hasProperty("endtime"));
        System.out.println("getProperty(endtime): " + urlManager.getProperty("endtime"));
        System.out.println("hasProperty(time): " + urlManager.hasProperty("time"));
        System.out.println("getProperty(time): " + urlManager.getProperty("time"));
    }

    private String protocol;
    private Integer port;
    private String host;
    private String path;
    String query;

    public UrlManager(String url) {
        String restUrl = cutProtocol(url);
        restUrl = cutHost(restUrl);
        restUrl = cutPort(restUrl);
        restUrl = cutPath(restUrl);
        if (restUrl != null && restUrl.charAt(0) == '?') query = restUrl.substring(1);
    }

    private String cutProtocol(String url) {
        if (url == null) return null;
        String delimiter = "://";
        int posDelimiter = url.indexOf(delimiter);
        protocol = url.substring(0, posDelimiter).toLowerCase();
        return url.substring(posDelimiter + delimiter.length());
    }

    private String cutHost(String url) {
        if (url == null) return null;
        int posPort = url.indexOf(':');
        int posPath = url.indexOf('/');
        if (posPort >= 0) {
            host = url.substring(0, posPort).toLowerCase();
            return url.substring(posPort);
        } else if (posPath >= 0) {
            host = url.substring(0, posPath).toLowerCase();
            return url.substring(posPath);
        } else {
            host = url;
            return null;
        }
    }

    private String cutPort(String url) {
        if (url == null) return null;
        if (url.charAt(0) == ':') {
            int posPath = url.indexOf('/');
            if (posPath >= 0) {
                port = Integer.parseInt(url.substring(1, posPath));
                return url.substring(posPath);
            }
            port = Integer.parseInt(url.substring(1));
            return null;
        }
        return url;
    }

    private String cutPath(String url) {
        if (url == null) return null;
        if (url.charAt(0) == '/') {
            int posQuestionMark = url.indexOf('?');
            if (posQuestionMark >= 0) {
                path = url.substring(1, posQuestionMark);
                return url.substring(posQuestionMark);
            }
            path = url.substring(1);
            return null;
        }
        return url;
    }

    public boolean hasProperty(String key) {
        String extQuery = "&" + query;
        return extQuery.indexOf("&" + key + "=") >= 0;
    }

    public String getProperty(String key) {
        String extQuery = "&" + query;
        int posStart = extQuery.indexOf("&" + key + "=");
        if (posStart >= 0) {
            extQuery = extQuery.substring(posStart + key.length() + 2);
            int posEnd = extQuery.indexOf('&');
            if (posEnd >= 0) return extQuery.substring(0, posEnd);
            else return extQuery;
        }
        return null;
    }

    public String getProtocol() {
        return protocol;
    }

    public Integer getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

}

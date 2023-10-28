package QueueArrayList;

public class Page {
    private String url, host;

    public Page(String url, String host) {
        this.url = url;
        this.host = host;
    }

    public String toString() {
        return "Page{" +
                "url='" + url + '\'' +
                ", host='" + host + '\'' +
                '}';
    }
}

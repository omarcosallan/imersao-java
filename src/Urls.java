public enum Urls {
    IMDB ("https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060"),
    NASA ("https://api.nasa.gov/planetary/apod?api_key=cYva49GPWJzVH0xBYeyha3oyNt6lpeUNhB3CQueq&start_date=2022-06-12&end_date=2022-06-14");

    private String url;

    private Urls(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}

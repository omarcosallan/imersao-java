public enum API {
    IMDB ("https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060",new ExtratorConteudoIMDB()),
    NASA ("https://api.nasa.gov/planetary/apod?api_key=cYva49GPWJzVH0xBYeyha3oyNt6lpeUNhB3CQueq&start_date=2022-06-12&end_date=2022-06-14", new ExtratorConteudoNasa()),
    LINGUAGENS ("https://linguagens-imersao-alura-api.herokuapp.com/linguagens", new ExtratorConteudoLinguagemAPI());

    private String url;
    private ExtratorConteudo extrator;

    private API(String url, ExtratorConteudo extrator) {
        this.url = url;
        this.extrator = extrator;
    }

    public String url() {
        return url;
    }

    public ExtratorConteudo extrator() {
        return extrator;
    }
}
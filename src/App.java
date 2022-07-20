import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        // fazer uma conexão HTTP
        // String apiKey = System.getenv("API_KEY");
        // String url = "https://imdb-api.com/en/API/Top250Movies/" + apiKey;
        // String url = "https://api.mocki.io/v2/549a5d8b";

        // String url = Urls.IMDB.getUrl();
        // ExtratorConteudo extrator = new ExtratorConteudoIMDB();

        String url = Urls.NASA.getUrl();
        ExtratorConteudo extrator = new ExtratorConteudoNasa();

        var http = new ClienteHTTP();
        String json = http.buscarDados(url);

        // exibir e manipular os dados
        List<Conteudo> conteudos = extrator.extraiConteudo(json);

        var geradora = new GeradoraDeFigurinhas();
        for (int i = 0; i < 3; i++) {

            Conteudo conteudo = conteudos.get(i);
            String nomeArquivo = conteudo.getTitulo().replace(":", "-")  + ".png";

            try {
                InputStream inputStream = new URL(conteudo.getUrlImagem()).openStream();
                geradora.criar(inputStream, nomeArquivo);
            } catch (Exception e) {
                System.out.println("Imagem não encontrada ou link inválido!");
            }
            
            System.out.println(conteudo.getTitulo());
            System.out.println();
        }
    }
}
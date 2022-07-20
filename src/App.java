import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        // fazer uma conexão HTTP e buscar os top 250 movies
        // String apiKey = System.getenv("API_KEY");
        // String url = "https://imdb-api.com/en/API/Top250Movies/" + apiKey;
        String url = "https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060";
        // String url = "https://api.mocki.io/v2/549a5d8b";
        URI endereco = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();

        // extrair só os dados que interessam (titulo, poster, classificação)
        var parser = new JsonParser();
        List<Map<String, String>> topFilmes = parser.parse(body);

        // exibir e manipular os dados
        var geradora = new GeradoraDeFigurinhas();
        for (Map<String, String> filmes : topFilmes) {

            String urlImagem = filmes.get("image");
            String titulo = filmes.get("title");
            String nomeArquivo = titulo.replace(":", "-")  + ".png";

            String novaUrl;
            if (urlImagem.charAt(urlImagem.indexOf('@') + 1) == '@') {
                novaUrl = urlImagem.substring(0, urlImagem.indexOf('@') + 2) + urlImagem.substring(urlImagem.length() - 4);
            } else {
                novaUrl = urlImagem.substring(0, urlImagem.indexOf('@') + 1) + urlImagem.substring(urlImagem.length() - 4);
            }

            String textoFigurinha;
            int rating = (int) Math.round(Double.parseDouble(filmes.get("imDbRating")));
            switch (rating) {
                case 9 : 
                    textoFigurinha = "TOOOPZERA";
                    break;
                case 8 :
                    textoFigurinha = "QUASE LÁ";
                    break;
                case 7 :
                    textoFigurinha = "TOP, NÉ";
                    break;
                default :
                    textoFigurinha = "É O QUE TEMOS";
                    break;
            }

            try {
                InputStream inputStream = new URL(novaUrl).openStream();
                geradora.criar(inputStream, nomeArquivo, textoFigurinha);
            } catch (Exception e) {
                System.out.println("Imagem não encontrada ou link inválido!");
            }
            
            System.out.println(titulo);
        }
    }
}
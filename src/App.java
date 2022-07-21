import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        API api = API.LINGUAGENS;
        ExtratorConteudo extrator = api.extrator();

        var http = new ClienteHTTP();
        String json = http.buscarDados(api.url());

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
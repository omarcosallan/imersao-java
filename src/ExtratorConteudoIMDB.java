import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExtratorConteudoIMDB implements ExtratorConteudo {
    
    public List<Conteudo> extraiConteudo(String json) {
        // extrair só os dados que interessam (titulo, poster, classificação)
        var parser = new JsonParser();
        List<Map<String, String>> listaDeAtributos = parser.parse(json);

        List<Conteudo> conteudos = new ArrayList<>();

        // popular a lista de conteudos
        for (Map<String, String> atributos : listaDeAtributos) {
            String urlImagem = atributos.get("image").replaceAll("(@+)(.*).jpg$", "$1.jpg");
            conteudos.add(new Conteudo(atributos.get("title"), urlImagem));
        }

        return conteudos;
    }
}

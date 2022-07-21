import java.util.List;

public class ExtratorConteudoLinguagemAPI implements ExtratorConteudo {

    public List<Conteudo> extraiConteudo(String json) {
        return new ExtratorConteudoIMDB().extraiConteudo(json);
    }

}
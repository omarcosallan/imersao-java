import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class GeradoraDeFigurinhas {

    public void criar(InputStream inputStream, String nomeArquivo) throws IOException {
       
        // leitura da imagem

        // InputStream inputStream = new FileInputStream("entrada/filme-maior.jpg");
        // InputStream inputStream = new
        // URL("https://m.media-amazon.com/images/M/MV5BMDFkYTc0MGEtZmNhMC00ZDIzLWFmNTEtODM1ZmRlYWMwMWFmXkEyXkFqcGdeQXVyMTMxODk2OTU@.jpg").openStream();
        BufferedImage original = ImageIO.read(inputStream);

        // criar nova imagem em memoria com transparencia e com tamanho novo
        int largura = original.getWidth();
        int altura = original.getHeight();
        int novaAltura = altura + 200;
        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

        // copiar a imagem orignal para nova imagem (em memória)
        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(original, 0, 0, null);

        // configurar a fonte
        var fonte = new Font(Font.SANS_SERIF, Font.BOLD, 64);
        graphics.setColor(Color.YELLOW);
        graphics.setFont(fonte);
        int stringLargura = graphics.getFontMetrics().stringWidth("TOOOPZERA");
        int posicao = (largura / 2) - (stringLargura / 2);

        // escrever uma frase na nova imagem
        graphics.drawString("TOOOPZERA", posicao, novaAltura - 100);

        // escrever a nova imagem em um arquivo
        ImageIO.write(novaImagem, "png", new File("saida/" + nomeArquivo));
    }
}

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

        BufferedImage original = ImageIO.read(inputStream);

        BufferedImage novaImagem = new BufferedImage(original.getWidth(), original.getHeight() + 80, BufferedImage.TRANSLUCENT);

        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(original, 0, 0, null);

        var fonte = new Font(Font.SANS_SERIF, Font.BOLD, original.getWidth() / 10);
        graphics.setColor(Color.YELLOW);
        graphics.setFont(fonte);
        
        int stringLargura = graphics.getFontMetrics().stringWidth("THE BEST ❤");
        int posicao = (original.getWidth() / 2) - (stringLargura / 2);
        graphics.drawString("THE BEST ❤", posicao, original.getHeight() + 25);

        ImageIO.write(novaImagem, "png", new File("saida/" + nomeArquivo));
    }
}
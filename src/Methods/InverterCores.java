package Methods;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class InverterCores {

    static final String CAMINHO_PADRAO = "C:\\Users\\Administrator\\IdeaProjects\\PDInverterCores\\src\\Resource\\";

    public static void inverterCores(BufferedImage imagem) throws IOException {

        int largura = imagem.getWidth();
        int altura = imagem.getHeight();

        BufferedImage novaImagem = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int linha = 0; linha < largura; linha++) {
            for (int coluna = 0; coluna < altura; coluna++) {

                int pixel = imagem.getRGB(linha, coluna);

                Color cor = new Color(pixel);

                int ver = 255 - cor.getRed();
                int vd = 255 - cor.getGreen();
                int az = 255 - cor.getBlue();

                Color inverterCores = new Color(ver, vd, az);
                novaImagem.setRGB(linha, coluna, inverterCores.getRGB());
            }
        }

        String caminho = CAMINHO_PADRAO + "ImagemInvertida.png";

        ImageIO.write(novaImagem, "png", new File(caminho));

        JFrame janela = new JFrame();
        ImageIcon icon = new ImageIcon(novaImagem);
        JLabel label = new JLabel(icon);
        janela.add(label);
        janela.pack();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}


package Main;

import Methods.InverterCores;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedImage bandas = ImageIO.read(
                    new File("C:\\Users\\Administrator\\IdeaProjects\\PDInverterCores\\src\\Resource\\sombrinhas.jpg"));
        InverterCores.inverterCores(bandas);
        }
    }

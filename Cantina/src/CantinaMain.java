import java.util.Scanner;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CantinaMain {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Imagem i1 = new Imagem();
        Produtos p1 = new Produtos();
        PlanoMensal a1 = new PlanoMensal();

        System.out.println("=-=-= Cantina - IFBA =-=-=");

        i1.Imagem();

        p1.bancoProdutos();

        //a1.bancoMensal();

    }
}
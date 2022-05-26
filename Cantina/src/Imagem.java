import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Imagem extends JComponent {

    private static final long serialVersionUID = 1L;

        JFrame frame = new JFrame("Tela");
        frame.setSize(800, 600);
        Imagem panel = new Imagem();
    frame.add(BorderLayout.CENTER, panel);
    frame.setVisible(true);

    private BufferedImage image;

    public void Imagem() {
        try {
            InputStream imgStream = getClass().getResourceAsStream("/imagens/precos_imagem.jpg");
            image = ImageIO.read(imgStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void paintComponent(Graphics g) {
        g.drawImage(image, 100, 100, this);
    }
}
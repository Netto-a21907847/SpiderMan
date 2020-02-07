package Netto.SpiderMan;


import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SpiderMan extends JFrame {

    ImageIcon parede = new ImageIcon(getClass().getResource("parede.png"));
    ImageIcon spiderParado = new ImageIcon(getClass().getResource("spiderParado.png"));
    ImageIcon spiderGif = new ImageIcon(getClass().getResource("spiderman3.gif"));

    JLabel jLparede = new JLabel(parede);
    JLabel jLspider = new JLabel(spiderParado);

    int posX = 300;
    int posY = 300;

    public SpiderMan() {
        editFrame();
        editComp();
        move();
    }

    public void move() {
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                jLspider.setIcon(spiderGif);
                if (e.getKeyCode() == 38) {
                    if (posY > -30) {
                        posY -= 10;
                    }

                }
                if (e.getKeyCode() == 40) {
                    if (posY < 480) {
                        posY += 10;
                    }

                }
                if (e.getKeyCode() == 37) {
                    if (posX > 5) {
                        posX -= 10;
                    }
                }
                if (e.getKeyCode() == 39) {
                    if (posX < 690) {
                        posX += 10;
                    }

                }
                jLspider.setBounds(posX, posY, 103, 202);

            }

            @Override
            public void keyReleased(KeyEvent e) {
                jLspider.setIcon(spiderParado);

            }
        });
    }

    public void editComp() {
        jLparede.setBounds(0, 0, 800, 700);
        jLspider.setBounds(posX, posY, 103, 202);
    }

    public void editFrame() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 700);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
        add(jLspider);
        add(jLparede);
    }

    public static void main(String[] args) {
        new SpiderMan();

    }
}

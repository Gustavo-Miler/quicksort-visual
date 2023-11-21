import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class Main extends JFrame {
    private static int[] lista;
    public Main() {
        super("Visualização Quicksort");

        lista = new int[100];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = i + 1;
        }

        Random rand = new Random();
        for (int i = 0; i < lista.length; i++) {
            int index_aleatorio = rand.nextInt(lista.length);
            int temp = lista[index_aleatorio];
            lista[index_aleatorio] = lista[i];
            lista[i] = temp;
        }

        getContentPane().setBackground(Color.black);
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);

        JButton botaoIniciar = new JButton("Iniciar");
        botaoIniciar.setBounds(0, 500, 70, 20);
        add(botaoIniciar);
        botaoIniciar.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
                        Thread newThread = new Thread(() -> {
                            Quicksort.quicksort(lista);
                            
                        });
                        newThread.start();
                    }  
                });
    }

    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2D = (Graphics2D) g;

        g2D.setColor(Color.white);
        for (int i = 0; i < lista.length; i++) {
            g2D.fillRect(i * 6, 0, 6, lista[i] * 6);
        }
        try {
            Thread.sleep(40);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });

    }
}

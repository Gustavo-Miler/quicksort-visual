import javax.swing.JFrame;

public class MyFrame extends JFrame{

    MyPanel panel;

    MyFrame(){
        panel = new MyPanel();

        this.setTitle("Visualização Quicksort");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(panel);
        this.pack();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}

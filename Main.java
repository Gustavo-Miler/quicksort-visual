import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();

        Random rand = new Random();
        int[] list = new int[50];
        for (int i = 0; i < list.length; i++) {
            list[i] = rand.nextInt(100) + 1;
        }

        


    }
}

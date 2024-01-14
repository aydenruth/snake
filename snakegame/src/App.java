import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int bgWidth = 600;
        int bgHeight = bgWidth; 

        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(bgWidth, bgHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SnakeGame snakeGame = new SnakeGame(bgWidth, bgHeight);
        frame.add(snakeGame);
        frame.pack();
        snakeGame.requestFocus();

    }
}

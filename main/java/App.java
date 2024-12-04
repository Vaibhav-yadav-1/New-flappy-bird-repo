import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 460;
        int boardHeight = 720;

        // Create the JFrame (main window)
        JFrame frame = new JFrame("Flappy Bird Game");

        // Set the frame size and other properties
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the MainMenu and add it to the frame
        MainMenu mainMenu = new MainMenu(frame);  // Pass the frame to MainMenu
        frame.add(mainMenu);

        // Show the frame
        frame.setVisible(true);
    }
}
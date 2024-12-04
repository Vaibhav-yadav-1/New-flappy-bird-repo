import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainMenu extends JPanel {
    private JFrame frame;
    private Image backgroundImage;

    public MainMenu(JFrame frame) {
        this.frame = frame;
        setLayout(null); // Use null layout for absolute positioning

        // Load the background image
        backgroundImage = new ImageIcon(getClass().getResource("../resources/bg001.png")).getImage();

        // Create Play button
        JButton playButton = new JButton("Play");
        playButton.setBounds(130, 250, 200, 50);
        add(playButton);
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Switch to the game panel
                switchToGame();
            }
        });

        // Create Settings button (with icon)
        ImageIcon settingsIcon = new ImageIcon(getClass().getResource("../resources/settings.png"));
        JButton settingsButton = new JButton(settingsIcon);
        settingsButton.setBounds(380, 20, 50, 50);  // Place it in the top-right corner
        add(settingsButton);

        // Create Help button (with icon)
        ImageIcon helpIcon = new ImageIcon(getClass().getResource("../resources/help.png"));
        JButton helpButton = new JButton(helpIcon);
        helpButton.setBounds(320, 20, 50, 50);  
        add(helpButton);

        // Create Shop Event button (bottom-left corner)
        ImageIcon shopIcon = new ImageIcon(getClass().getResource("../resources/shop.png"));
        JButton shopButton = new JButton(shopIcon);
        shopButton.setBounds(20, 620, 100, 50);
        add(shopButton);

    }

    private void switchToGame() {
        // Remove the main menu and switch to the Endgame panel
        frame.getContentPane().removeAll();
        Endgame endgame = new Endgame();
        frame.add(endgame);
        frame.revalidate();
        frame.repaint();
        endgame.requestFocus();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the background image
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
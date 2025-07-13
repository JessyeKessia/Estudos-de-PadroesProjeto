package State;

import javax.swing.*;
import java.awt.*;

public class UI {
    private Player player;
    private JTextField textField;

    public UI(Player player) {
        this.player = player;
        init();
    }

    public void init() {
        JFrame frame = new JFrame("Player de Áudio");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 180);

        JPanel panel = new JPanel();
        textField = new JTextField(30);
        textField.setEditable(false);

        JButton play = new JButton("Play");
        JButton stop = new JButton("Stop");
        JButton next = new JButton("Next");
        JButton prev = new JButton("Previous");

        play.addActionListener(e -> textField.setText(player.onPlay()));
        stop.addActionListener(e -> textField.setText(player.onStop()));
        next.addActionListener(e -> textField.setText(player.onNext()));
        prev.addActionListener(e -> textField.setText(player.onPrevious()));

        panel.add(play);
        panel.add(stop);
        panel.add(next);
        panel.add(prev);
        panel.add(textField);

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}

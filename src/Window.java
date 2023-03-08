import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private boolean blue = true;
    public Window(){
        this.setTitle("Indikator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel multiPanel = new JPanel();
        GridLayout layout = new GridLayout(3,3);
        multiPanel.setBorder(BorderFactory.createLineBorder(Color.white, 10));
        multiPanel.setLayout(layout);

        multiPanel.add(new Detector(true));
        multiPanel.add(new Detector(false));
        multiPanel.add(new Detector(true));
        multiPanel.add(new Detector(false));
        multiPanel.add(new Detector(true));
        multiPanel.add(new Detector(false));
        multiPanel.add(new Detector(true));
        multiPanel.add(new Detector(false));
        multiPanel.add(new Detector(true));

        this.getContentPane().add(multiPanel);

        this.pack();
        this.setVisible(true);
    }
}

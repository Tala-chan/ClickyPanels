import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Detector extends JPanel implements MouseListener {
    final int SIZE = 200;
    private boolean first = false;
    private boolean right = false;
    private boolean col;
    public Detector(boolean col){
        this.col = col;
        if(col == false){
            this.setBackground(Color.BLACK);
        }
        else{
            this.setBackground(Color.gray);
        }
        this.setPreferredSize(new Dimension(SIZE,SIZE));
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("YOU HAVE CLICKED!!!!!!!");
        first = true;
        if (e.getButton() == MouseEvent.BUTTON1){
            right=true;
            System.out.println("X's");
        } else{
            right=false;
            System.out.println("O's");
        }
        repaint();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(first){
            if(!right){
                circle(g);
            }
            else{
                cross(g);
            }
        }

    }
    public void circle(Graphics g){
        g.setColor(Color.white);
        g.fillOval((SIZE/2)-50, (SIZE/2)-50,100,100);
    }
    public void cross(Graphics g){
        g.setColor(Color.white);
        g.drawLine((SIZE/2)-50,(SIZE/2)-50,(SIZE/2)+50,(SIZE/2)+50);
        g.drawLine((SIZE/2)-50,(SIZE/2)+50,(SIZE/2)+50,(SIZE/2)-50);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }


    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

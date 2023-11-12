import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Cliente {

    
    public static void main(String[] args) {
        
        JLabel title = new JLabel("Titulo");
        
        JLabel label = new JLabel("Rotulo #1");
        JButton button = new JButton("Botao #1");
        
        JPanel panel = new JPanel(new FlowLayout());        
        panel.add(label);    
        panel.add(button);
        
        JFrame frame = new JFrame(); //JFrame herda de Frame
        frame.setLayout(new BorderLayout());
        frame.add(title, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setVisible(true);





    }
}

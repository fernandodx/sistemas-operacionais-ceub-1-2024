import javax.swing.*;
import java.awt.event.*;

public class ListenerExemplo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo de Listener");

        JButton button = new JButton("Clique aqui!");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Você clicou no botão!");
            }
        });

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        button.setBounds(100, 70, 120, 30);
        
        frame.add(button);

        frame.setVisible(true);
    }
}


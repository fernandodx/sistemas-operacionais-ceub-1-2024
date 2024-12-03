import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listener {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo Listener");

        JButton button = new JButton("Clique aqui");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                JOptionPane.showMessageDialog(frame, "Botão clicado!");
            }
        });

        frame.add(button);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

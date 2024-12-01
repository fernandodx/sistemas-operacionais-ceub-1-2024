import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClickListenerExample {
    public static void main(String[] args) {
        // Criação do frame (janela)
        JFrame frame = new JFrame("Exemplo de Listener");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criação de um botão
        JButton button = new JButton("Clique aqui");
        button.setBounds(100, 80, 100, 40);

        // Adiciona um listener ao botão
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Botão foi clicado!");
                JOptionPane.showMessageDialog(frame, "Você clicou no botão!");
            }
        });

        // Configura o layout e adiciona o botão ao frame
        frame.setLayout(null);
        frame.add(button);

        // Torna a janela visível
        frame.setVisible(true);
    }
}

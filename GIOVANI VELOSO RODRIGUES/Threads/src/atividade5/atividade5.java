package atividade5;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class atividade5 {

    public static void main(String[] args) {
        // Cria o frame
        JFrame frame = new JFrame("Exemplo de Listener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Cria o painel
        JPanel panel = new JPanel();

        // Cria o botão
        JButton button = new JButton("Clique neste botão");

        // Adiciona o listener ao botão
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("O botão foi clicado!");
            }
        });

        // Adiciona o botão ao painel
        panel.add(button);

        // Adiciona o painel ao frame
        frame.add(panel);

        // Torna o frame visível
        frame.setVisible(true);
    }
}

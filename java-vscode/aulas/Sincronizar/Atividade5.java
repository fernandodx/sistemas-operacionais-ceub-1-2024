/* - Pesquise sobre listener é um padrão de projeto muito utilizado no desenvolvimento mobile. 

Crie um exemplo em java de um listener.  */



public class Atividade5 {
    
    // Interface do Listener
    public interface OnButtonClickListener {
        void onClick();
    }

    // Classe Button
    public static class Button {
        private OnButtonClickListener listener;

        // Método para registrar o Listener
        public void setOnClickListener(OnButtonClickListener listener) {
            this.listener = listener;
        }

        // Simula o clique no botão
        public void click() {
            if (listener != null) {
                listener.onClick(); // Notifica o listener sobre o evento
            }
        }
    }

    public static void main(String[] args) {
        // Cria um botão
        Button button = new Button();

        // Define o Listener para o botão
        button.setOnClickListener(() -> System.out.println("Botão foi clicado!"));

        // Simula um clique no botão
        button.click();
    }
}


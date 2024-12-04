 //- Pesquise sobre listener é um padrão de projeto muito utilizado no desenvolvimento mobile. 

//Crie um exemplo em java de um listener. 

interface ButtonClickListener {
    void onButtonClick();
}


class Button {
    private ButtonClickListener listener;

    
    public void setButtonClickListener(ButtonClickListener listener) {
        this.listener = listener;
    }

    public void click() {
        System.out.println("Botão foi clicado.");
        if (listener != null) {
            listener.onButtonClick(); 
        }
    }
}

class ButtonHandler implements ButtonClickListener {
    @Override
    public void onButtonClick() {
        System.out.println("O evento de clique do botão foi tratado!");
    }
}

public class Main {
    public static void main(String[] args) {
        Button button = new Button();
        ButtonHandler handler = new ButtonHandler();

       
        button.setButtonClickListener(handler);

        button.click();
    }
}
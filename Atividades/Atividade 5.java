 //- Pesquise sobre listener é um padrão de projeto muito utilizado no desenvolvimento mobile. 

//Crie um exemplo em java de um listener. 

//O listener é um padrão de design amplamente utilizado no desenvolvimento mobile e em outras áreas da programação.
// Ele segue o padrão Observer, onde um objeto (o listener) "ouve" eventos de outro objeto (o emitente). 
 //Esse padrão é comum em interfaces gráficas e sistemas de eventos.

 
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


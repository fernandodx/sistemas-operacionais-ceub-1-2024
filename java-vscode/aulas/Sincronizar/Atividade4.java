/*Tarefa de Pesquisa:

	1.	Pesquise sobre scripts bash e sua importância em sistemas operacionais Unix/Linux.
	2.	Descubra como criar um arquivo bash, definir permissões de execução e executar o script.


Desafio:

Criação e Execução do Script Bash

Instruções:

	1.	Crie um arquivo bash:
	•	Nomeie o arquivo como backup.sh.
	•	No terminal, utilize o comando touch para criar o arquivo:

```
touch info.sh
```

Edite o arquivo bash:
	•	Abra o arquivo com seu editor de texto preferido (nano, vim, gedit, etc.).
	•	Adicione o seguinte conteúdo ao arquivo:

```
#!/bin/bash
# Script para exibir informações básicas do sistema

echo "Data e Hora atuais: $(date)"
echo "Usuário logado: $(whoami)"
echo "Diretório atual: $(pwd)"

```

Torne o arquivo executável:
	•	No terminal, altere as permissões do arquivo para torná-lo executável:

```
chmod +x info.sh

```

Execute o script bash:
	•	No terminal, execute o script criado:

```
./info.sh
```

Atividade: 

Nesse arquivo bash quero que exiba também Espaço livre no disco.*/

public class Atividade4 {
    public static void main(String[] args) {
        int n = 10; 
        System.out.println("Fibonacci de " + n + " é: " + fibonacci(n));

       
        System.out.println("Sequência de Fibonacci até " + n + ":");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; 
        } else if (n == 1) {
            return 1;
        } else {
           
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

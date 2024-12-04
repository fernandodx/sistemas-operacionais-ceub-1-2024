//Tarefa de Pesquisa:

//	1.	Pesquise sobre scripts bash e sua importância em sistemas operacionais Unix/Linux.
//	2.	Descubra como criar um arquivo bash, definir permissões de execução e executar o script.


//Desafio:

//Criação e Execução do Script Bash

//Instruções:

//	1.	Crie um arquivo bash:
//	•	Nomeie o arquivo como backup.sh.
//	•	No terminal, utilize o comando touch para criar o arquivo:

//```
//touch info.sh
//```

//Edite o arquivo bash:
//	•	Abra o arquivo com seu editor de texto preferido (nano, vim, gedit, etc.).
//	•	Adicione o seguinte conteúdo ao arquivo:

//```
//#!/bin/bash
//# Script para exibir informações básicas do sistema

//echo "Data e Hora atuais: $(date)"
//echo "Usuário logado: $(whoami)"
//echo "Diretório atual: $(pwd)"

//```

//Torne o arquivo executável:
//	•	No terminal, altere as permissões do arquivo para torná-lo executável:

//```
//chmod +x info.sh

//```

//Execute o script bash:
//	•	No terminal, execute o script criado:

//```
//./info.sh
//```

//Atividade: 

//Nesse arquivo bash quero que exiba também Espaço livre no disco.

import java.io.File;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class infosistema {
    public static void main(String[] args) {
        // Exibe a data e hora atuais
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Data e Hora atuais: " + agora.format(formato));

        // Exibe o usuário logado
        String usuario = System.getProperty("user.name");
        System.out.println("Usuário logado: " + usuario);

        // Exibe o diretório atual
        String diretorioAtual = Paths.get("").toAbsolutePath().toString();
        System.out.println("Diretório atual: " + diretorioAtual);

        // Exibe o espaço livre no disco
        File disco = new File("/");
        long espacoLivre = disco.getFreeSpace() / (1024 * 1024 * 1024); // Convertendo para GB
        long espacoTotal = disco.getTotalSpace() / (1024 * 1024 * 1024); // Convertendo para GB
        System.out.println("Espaço livre no disco: " + espacoLivre + " GB");
        System.out.println("Espaço total no disco: " + espacoTotal + " GB");
    }
}

// -Run main:

//Data e Hora atuais: 04/12/2024 14:27:44
//Usu�rio logado: Lucas Silva
//Diret�rio atual: C:\Users\Lucas Silva\sistemas-operacionais-ceub-2-2024
//Espa�o livre no disco: 35 GB
//Espa�o total no disco: 222 GB



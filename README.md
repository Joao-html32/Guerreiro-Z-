Quem é esse Guerreiro Z? Jogo de Adivinhação

Este é um jogo de adivinhação temático de Dragon Ball desenvolvido em Java Puro, utilizando a biblioteca gráfica Swing para criar uma experiência interativa com janelas, efeitos sonoros locais e imagens dinâmicas.
O projeto foi construído com foco na lógica de programação voltada para objetos, manipulação de mídia em tempo real e controle estrito de fluxo e estados de jogo.
Funcionalidades e Diferenciais Técnicos
Interface Gráfica Completa (GUI): Janela interativa criada com`JFrame`, caixas de entrada de texto com`JTextField`e de menção com`Botão J`.
*Gerenciador de Layout Dinâmico: Uso de`Layout de fluxo`para organização automática e resposta de componentes na tela.
*Manipulação Inteligente de Imagens: O jogo carrega e redimensiona as fotos dos personagens em tempo real (`Imagem.ESCALA_SUAVE`), garantindo que a proporção visual ideal seja mantida sem distorções na janela.
*Efeitos Sonoros Integrados: Uso das bibliotecas nativas`Sistema de áudio`e`Grampo`para disparar efeitos sonoros (`.wav`) imediatamente no bloco de erro.
*Sorteio Não-Viciado: Implementação de semente temporal (`System.currentTimeMillis()`) para garantir o embaralhamento real do gerador aleatório (`Aleatório`) a cada execução.
*Sistema de Pontuação e Estado de Jogo:**O jogador inicia com 100 pontos, danos cumulativos a cada palpite incorreto, com telas de transição para*Game Over*e*Vitória*.
*Loop de Reinicialização Detalhado:**O sistema de caixas de diálogo pergunta se o usuário deseja batalhar novamente tanto na vitória quanto na derrota, redefinindo todas as variáveis ​​e limpando os componentes fechando sem o programa.

🛠️ Tecnologias Utilizadas
*Linguagem: Java (JDK 8 ou superior)
*Interface Visão: Java Swing (`javax.swing.*`)
*Gerenciamento de Imagens e Janelas: Java AWT (`java.awt.*`)
*Mídia e áudio: Java Sound (`javax.sound.sampled.*`)

🎮 Como Jogar
1.O jogo sorteará um personagem secreto da lista nos bastidores.
2.Digite o nome do guerreiro no campo de texto e clique em "Chutar!".
3.Se você errar, perderá 20 pontos, um áudio de erro tocará e você poderá escolher se deseja receber uma dica temática.
4.Se sua pontuação chegar a 0, será decretado*Game Over*.
5.Se você conseguir, a foto oficial do guerreiro surgirá na tela coroando a sua vitória!

📦 Como Executar o Projeto
-se de que os arquivos de mídia estão organizados na mesma pasta do arquivo principal:
```texto
├── Principal.java
├── grito.wav
├── Goku.png
├── Vegeta.png
├── Gohan.png
├── Picculo.png
├── Kuririn.png
└── Bulma.png
```
Compile e execute o arquivo`Principal.java`através do seu terminal ou de seu IDE de preferência (como o VS Code):
```bash
javac Principal.java
java Principal
```

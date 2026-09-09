import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Image;

public class Principal {
    static String personagemSecreto;
    static String[] personagens = {"Goku", "Gohan", "Vegeta", "Picculo", "Kuririn", "Bulma"};
    static int pontuacao = 100;
    static int custoDaDica = 20;
    static Random gerador = new Random();
    public static void main(String[] args) {
        JFrame janela = new JFrame("Torneio de Dragon Ball");
        janela.setSize(400, 400);
        janela.setLayout(new FlowLayout());
        gerador.setSeed(System.currentTimeMillis());
        int indiceSorteado = gerador.nextInt(personagens.length);
        personagemSecreto = personagens[indiceSorteado];

        JTextField caixaTexto = new JTextField(20);
        JButton botaoChutar = new JButton("Chutar!");
        janela.add(caixaTexto);
        janela.add(botaoChutar);

        botaoChutar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String palpite = caixaTexto.getText();

                if (palpite.equalsIgnoreCase(personagemSecreto)) {
                   ImageIcon fotoVitoria = new ImageIcon(personagemSecreto + ".png");
                 Image imagemPura = fotoVitoria.getImage();
                 Image imageEncolhida = imagemPura.getScaledInstance(200, 200, Image.SCALE_SMOOTH); 
                 fotoVitoria = new ImageIcon(imageEncolhida);
                   JLabel exibidorImagem = new JLabel(fotoVitoria);
                   JOptionPane.showMessageDialog(janela, exibidorImagem, "Miserável é um gênio! Você Venceu!", JOptionPane.PLAIN_MESSAGE);
                 int reiniciarVitoria = JOptionPane.showConfirmDialog(janela, "Parabéns! Quer batalhar novamente?!");
                    if (reiniciarVitoria == JOptionPane.YES_OPTION) {
                        pontuacao = 100;
                        caixaTexto.setText("");
                        int novoIndice = gerador.nextInt(personagens.length);
                        personagemSecreto = personagens[novoIndice];
                    } else {
                        janela.dispose();
                    }
                    return;
                }

                pontuacao -= custoDaDica;
                JOptionPane.showMessageDialog(janela,
                        "HAHAHA SEU VERME!TENTA OUTRA! Pontos restantes: " + pontuacao);

                try {
                    File arquivo = new File("grito.wav");
                    AudioInputStream audioStream = AudioSystem.getAudioInputStream(arquivo);
                    Clip player = AudioSystem.getClip();
                    player.open(audioStream);
                    player.start();
                } catch (Exception erro) {
                }

                int respostas = JOptionPane.showConfirmDialog(
                        janela, "Quer uma semente dos deuses?");

                if (respostas == JOptionPane.YES_OPTION) {
                    String dica = "";

                    if (personagemSecreto.equalsIgnoreCase("Goku")) {
                        dica = "É um Saiyajin que ama comer e vive salvando a Terra!";
                    } else if (personagemSecreto.equalsIgnoreCase("Vegeta")) {
                        dica = "Ele é o orgulhoso Príncipe dos Saiyajins e rival do protagonista!";
                    } else if (personagemSecreto.equalsIgnoreCase("Picculo")) {
                        dica = "Ele é verde, veio do planeta Namekusei e começou como vilão!";
                    } else if (personagemSecreto.equalsIgnoreCase("Gohan")) {
                        dica = "É um guerreiro híbrido que possui um poder oculto gigantesco!";
                    } else if (personagemSecreto.equalsIgnoreCase("Kuririn")) {
                        dica = "É o terráqueo mais forte e o melhor amigo do protagonista!";
                    } else if (personagemSecreto.equalsIgnoreCase("Bulma")) {
                        dica = "Ela não luta, mas é a cientista genial que inventou o Radar do Dragão!";
                        ImageIcon fotoVitoria = new ImageIcon(personagemSecreto + ".png");
                    }

                    JOptionPane.showMessageDialog(janela, dica);
                }

                if (pontuacao <= 0) {
                    JOptionPane.showMessageDialog(janela,
                            "💀 HAHAHAHA VERME MISERAVEL! Seus pontos acabaram. O guerreiro secreto era o " + personagemSecreto);
                    int reiniciar = JOptionPane.showConfirmDialog(janela, "Quer batalhar novamente?!");
                    if (reiniciar == JOptionPane.YES_OPTION) {
                        pontuacao = 100;
                        caixaTexto.setText("");
                        int novoIndice = gerador.nextInt(personagens.length);
                        personagemSecreto = personagens[novoIndice];
                    } else {
                        janela.dispose();
                    }
               return;
                } 
            } 
        });
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
} 

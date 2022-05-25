//Lucas Silva dos Santos
//RM 86361
//3ECA


package Interface_Grafica;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;


public class Tela_Inicial {
	
	
	public static void main(String[] args) {
		
			
		JFrame janela = new JFrame ("Fiap Filmes");		
		janela.setLayout(new BorderLayout());
		janela.setSize(600, 400);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel all = new JPanel();
		all.setLayout(new BorderLayout());
		all.setVisible(true);
			
		//LEFT
	
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(1,1));
		panel1.setPreferredSize(new Dimension(200, 300));
		JLabel imgFilme = new JLabel(new ImageIcon("src/imagens/pulp_fiction.jpg"));
		panel1.add(imgFilme);
		all.add(panel1, BorderLayout.LINE_START);
		
		//CENTER
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(7,1, 0, 10));
		panel2.setPreferredSize(new Dimension(180, 300));
		
		JLabel titulo = new JLabel("Titulo");
		
		JTextField textField = new JTextField();
		textField.setPreferredSize(new Dimension(180, 30));
		textField.setBackground(Color.white);
		textField.setForeground(new Color(50,50,50));
		textField.setBorder(new LineBorder(new Color(26, 108, 163)));
		textField.setVisible(true);
		
		JLabel sinopse = new JLabel("Sinopse");
		
		JTextField textField2 = new JTextField();
		textField.setPreferredSize(new Dimension(180, 30));
		textField.setBackground(Color.white);
		textField.setForeground(new Color(50,50,50));
		textField.setBorder(new LineBorder(new Color(26, 108, 163)));
		textField.setVisible(true);
		
				
		ListenerTeclado listenerTeclado = new ListenerTeclado();
		textField.addKeyListener(listenerTeclado);
		textField2.addKeyListener(listenerTeclado);
		
		JLabel genero = new JLabel("Gênero");
		
		String[] generos = {"Ação", "Aventura", "Comédia", "Documentário", "Ficção Ciêntifica", "Terror"};
								
		panel2.add(titulo);
		panel2.add(textField);
		panel2.add(sinopse);
		panel2.add(textField2);
		panel2.add(genero);
		panel2.add(new JComboBox<String>(generos));
		all.add(panel2, BorderLayout.CENTER);
		
		//BOTÕES
		
		JPanel minipanel = new JPanel();
		minipanel.setLayout(new GridLayout(1, 2, 10, 0));
		
		JButton button1 = new JButton("Salvar");
		button1.setPreferredSize(new Dimension(20, 10));
		minipanel.add(button1);
		
		
		ListenerSalvar listenerSalvar = new ListenerSalvar();
		button1.addActionListener(listenerSalvar);

		JButton button2 = new JButton("Cancelar");
		button2.setPreferredSize(new Dimension(20, 10));
		minipanel.add(button2);
		
		panel2.add(minipanel);
		
		//RIGHT
		
		ButtonGroup group = new ButtonGroup();
		JLabel assistir = new JLabel("   Onde Assistir");
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(7,1, 0, 0));
		panel3.setPreferredSize(new Dimension(180, 300));
		
		CheckBox check = new CheckBox (" Assistido");
		
		JRadioButton netflix = new JRadioButton("Netflix");
		JRadioButton prime = new JRadioButton("Prime Video");
		JRadioButton pirate = new JRadioButton("The Pirate Bay");
		
		JLabel avaliacao = new JLabel("     Avaliação");
		StarRater stars = new StarRater(5, 0);
		
		group.add(netflix);
		group.add(prime);
		group.add(pirate);
				
		panel3.add(assistir);
		panel3.add(netflix);
		panel3.add(prime);
		panel3.add(pirate);
		panel3.add(check);
		panel3.add(avaliacao);
		panel3.add(stars);
		all.add(panel3, BorderLayout.LINE_END);
		
				
		JTabbedPane abas = new JTabbedPane();
		
		abas.add("Cadastro", all);
		abas.add("Lista", new JLabel("Lista vazia"));
		
		janela.add(abas, BorderLayout.PAGE_START);
		
		
		
		
	
	}

	public static void carregarDados() {
		// TODO Auto-generated method stub
		
	}


}

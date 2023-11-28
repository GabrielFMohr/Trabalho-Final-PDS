package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textDataNasc;
	private JTextField textNacionalidade;
	private JTextField textDataou;
	private JTextField textDatain;
	private JTextField textDataOut;
	private JTextField textQuarto;
	private JTextField textTelefone;
	private JTextField textEmail;
	private JTextField textAval;
	private JTextField textEnd;
	private JTextField textPessoas;
	private JTextField textTotalPagar;
	private JTextField textSit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setTitle("Cadastro de Hóspede");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1017, 710);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 251, 249));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[250px][75px][100px,grow][100px,grow][50px,grow][100px,grow][100px,grow][100px,grow][50px][50px][50px]", "[100px][10px][100px,grow][100px][100px][100px][100px][100px][100px][200px][100px][100px]"));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\Group 8782 (2).png"));
		contentPane.add(lblNewLabel, "cell 0 0 1 11,aligny top");
		
		JLabel lblNewLabel_2 = new JLabel("Cadastar Hóspede");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_2.setFont(new Font("Corbel", Font.BOLD, 42));
		contentPane.add(lblNewLabel_2, "cell 2 0 9 2,alignx center,aligny bottom");
		
		JLabel lblNewLabel_3 = new JLabel("Nome:");
		contentPane.add(lblNewLabel_3, "cell 1 2,alignx right");
		
		textNome = new JTextField();
		textNome.setBackground(new Color(196, 196, 196));
		contentPane.add(textNome, "cell 2 2 3 1,growx");
		textNome.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Data Nascimento:");
		contentPane.add(lblNewLabel_4, "cell 5 2 2 1,alignx right");
		
		textDataNasc = new JTextField();
		textDataNasc.setColumns(10);
		textDataNasc.setBackground(new Color(196, 196, 196));
		contentPane.add(textDataNasc, "cell 7 2 3 1,growx");
		
		JLabel lblNewLabel_3_1 = new JLabel("Nacionalidade:");
		contentPane.add(lblNewLabel_3_1, "cell 1 3,alignx trailing");
		
		textNacionalidade = new JTextField();
		textNacionalidade.setColumns(10);
		textNacionalidade.setBackground(new Color(196, 196, 196));
		contentPane.add(textNacionalidade, "cell 2 3 2 1,growx");
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Passaporte:");
		contentPane.add(lblNewLabel_3_1_1, "cell 5 3 2 1,alignx right");
		
		textDataou = new JTextField();
		textDataou.setColumns(10);
		textDataou.setBackground(new Color(196, 196, 196));
		contentPane.add(textDataou, "cell 7 3 4 1,growx");
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Data Check-In:");
		contentPane.add(lblNewLabel_3_1_2, "cell 1 4,alignx trailing,aligny center");
		
		textDatain = new JTextField();
		textDatain.setColumns(10);
		textDatain.setBackground(new Color(196, 196, 196));
		contentPane.add(textDatain, "cell 2 4,growx");
		
		JLabel lblNewLabel_3_1_2_1 = new JLabel("Data Check-out:");
		contentPane.add(lblNewLabel_3_1_2_1, "cell 3 4,alignx trailing");
		
		textDataOut = new JTextField();
		textDataOut.setColumns(10);
		textDataOut.setBackground(new Color(196, 196, 196));
		contentPane.add(textDataOut, "cell 4 4 2 1,growx");
		
		JLabel lblNewLabel_3_1_2_2 = new JLabel("N° Quarto:");
		contentPane.add(lblNewLabel_3_1_2_2, "cell 6 4,alignx trailing");
		
		textQuarto = new JTextField();
		textQuarto.setColumns(10);
		textQuarto.setBackground(new Color(196, 196, 196));
		contentPane.add(textQuarto, "cell 7 4 2 1,growx");
		
		JLabel lblNewLabel_3_1_2_3 = new JLabel("Telefone Hóspede");
		contentPane.add(lblNewLabel_3_1_2_3, "cell 1 5,alignx trailing");
		
		textTelefone = new JTextField();
		textTelefone.setColumns(10);
		textTelefone.setBackground(new Color(196, 196, 196));
		contentPane.add(textTelefone, "cell 2 5 2 1,growx");
		
		JLabel lblNewLabel_3_1_2_4 = new JLabel("Email Hóspede:");
		contentPane.add(lblNewLabel_3_1_2_4, "cell 4 5 2 1,alignx right");
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBackground(new Color(196, 196, 196));
		contentPane.add(textEmail, "cell 6 5 4 1,growx");
		
		JLabel lblNewLabel_3_1_2_6 = new JLabel("Endereço Hóspede:");
		contentPane.add(lblNewLabel_3_1_2_6, "cell 1 6,alignx trailing");
		
		textEnd = new JTextField();
		textEnd.setColumns(10);
		textEnd.setBackground(new Color(196, 196, 196));
		contentPane.add(textEnd, "cell 2 6 2 1,growx");
		
		JLabel lblNewLabel_3_1_2_7 = new JLabel("N°Pessoas Reserva");
		contentPane.add(lblNewLabel_3_1_2_7, "cell 5 6 2 1,alignx trailing");
		
		textPessoas = new JTextField();
		textPessoas.setColumns(10);
		textPessoas.setBackground(new Color(196, 196, 196));
		contentPane.add(textPessoas, "cell 7 6 2 1,growx");
		
		JLabel lblNewLabel_3_1_2_9 = new JLabel("Situações Especiasi:");
		contentPane.add(lblNewLabel_3_1_2_9, "cell 1 7,alignx trailing");
		
		textSit = new JTextField();
		textSit.setColumns(10);
		textSit.setBackground(new Color(196, 196, 196));
		contentPane.add(textSit, "cell 2 7 3 1,growx");
		
		JLabel lblNewLabel_3_1_2_5 = new JLabel("Avaliação do Hóspede");
		contentPane.add(lblNewLabel_3_1_2_5, "cell 5 7 2 1,alignx trailing");
		
		textAval = new JTextField();
		textAval.setColumns(10);
		textAval.setBackground(new Color(196, 196, 196));
		contentPane.add(textAval, "cell 7 7 3 1,growx");
		
		JLabel lblNewLabel_3_1_2_8 = new JLabel("Total a pagar hospedagem:");
		contentPane.add(lblNewLabel_3_1_2_8, "cell 1 8,alignx trailing");
		
		textTotalPagar = new JTextField();
		textTotalPagar.setEditable(false);
		textTotalPagar.setColumns(10);
		textTotalPagar.setBackground(new Color(196, 196, 196));
		contentPane.add(textTotalPagar, "cell 2 8 2 1,growx");
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\Group 8781.png"));
		contentPane.add(lblNewLabel_1, "cell 1 9 10 1,alignx center,aligny center");
	}

}

package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import model.Hospede;
import model.Nacionalidades;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textDataNasc;
	private JTextField textPassa;
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
	private JTextField textDiasT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal(null);
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
	@SuppressWarnings("unchecked")
	public TelaPrincipal(TelaTabela z) {
		ArrayList<Hospede> lista = new ArrayList<Hospede>();
		TelaTabela t=new TelaTabela();
		setTitle("Cadastro de Hóspede");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 720);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 251, 249));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[250px][75px][75px,grow][75px,grow][100px,grow][100px,grow][50px,grow][100px,grow][100px,grow][100px,grow][50px][50px][50px]", "[100px][10px][100px,grow][100px][100px][100px][100px][100px][100px][200px,grow][100px][100px]"));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Aluno\\Desktop\\Trabalho-Final-PDS\\Group 8782.png"));
		contentPane.add(lblNewLabel, "cell 0 0 1 11,aligny top");
		
		JLabel lblNewLabel_2 = new JLabel("Cadastrar Hóspede");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_2.setFont(new Font("Corbel", Font.BOLD, 42));
		contentPane.add(lblNewLabel_2, "cell 1 0 12 2,alignx center,aligny bottom");
		
		JLabel lblNewLabel_3 = new JLabel("Nome:");
		lblNewLabel_3.setFont(new Font("Carlito", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_3, "cell 1 2 2 1,alignx right");
		
		textNome = new JTextField();
		textNome.setBackground(new Color(196, 196, 196));
		contentPane.add(textNome, "cell 3 2 3 1,growx");
		textNome.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Data Nascimento:");
		lblNewLabel_4.setFont(new Font("Carlito", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_4, "cell 6 2 2 1,alignx right");
		
		textDataNasc = new JTextField();
		textDataNasc.setColumns(10);
		textDataNasc.setBackground(new Color(196, 196, 196));
		contentPane.add(textDataNasc, "cell 8 2 3 1,growx");
		
		JLabel lblNewLabel_3_1 = new JLabel("Nacionalidade:");
		lblNewLabel_3_1.setFont(new Font("Carlito", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_3_1, "cell 1 3 2 1,alignx trailing");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(Nacionalidades.values()));
		contentPane.add(comboBox, "cell 3 3 2 1,growx");
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Passaporte:");
		lblNewLabel_3_1_1.setFont(new Font("Carlito", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_3_1_1, "cell 5 3 2 1,alignx right");
		
		textPassa = new JTextField();
		textPassa.setColumns(10);
		textPassa.setBackground(new Color(196, 196, 196));
		contentPane.add(textPassa, "cell 7 3 4 1,growx");
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Check-In:");
		lblNewLabel_3_1_2.setFont(new Font("Carlito", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_3_1_2, "cell 1 4,alignx trailing,aligny center");
		
		textDatain = new JTextField();
		textDatain.setColumns(10);
		textDatain.setBackground(new Color(196, 196, 196));
		contentPane.add(textDatain, "cell 2 4 2 1,growx");
		
		JLabel lblNewLabel_3_1_2_1 = new JLabel("Check-out:");
		lblNewLabel_3_1_2_1.setFont(new Font("Carlito", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_3_1_2_1, "cell 4 4,alignx trailing");
		
		textDataOut = new JTextField();
		textDataOut.setColumns(10);
		textDataOut.setBackground(new Color(196, 196, 196));
		contentPane.add(textDataOut, "cell 5 4 2 1,growx");
		
		JLabel lblNewLabel_3_1_2_2 = new JLabel("N° Quarto:");
		lblNewLabel_3_1_2_2.setFont(new Font("Carlito", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_3_1_2_2, "cell 7 4,alignx trailing");
		
		textQuarto = new JTextField();
		textQuarto.setColumns(10);
		textQuarto.setBackground(new Color(196, 196, 196));
		contentPane.add(textQuarto, "cell 8 4 3 1,growx");
		
		JLabel lblNewLabel_3_1_2_3 = new JLabel("Telefone:");
		lblNewLabel_3_1_2_3.setFont(new Font("Carlito", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_3_1_2_3, "cell 1 5,alignx trailing");
		
		textTelefone = new JTextField();
		textTelefone.setColumns(10);
		textTelefone.setBackground(new Color(196, 196, 196));
		contentPane.add(textTelefone, "cell 2 5 2 1,growx");
		
		JLabel lblNewLabel_3_1_2_4 = new JLabel("Email:");
		lblNewLabel_3_1_2_4.setFont(new Font("Carlito", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_3_1_2_4, "cell 4 5,alignx right");
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBackground(new Color(196, 196, 196));
		contentPane.add(textEmail, "cell 5 5 6 1,growx");
		
		JLabel lblNewLabel_3_1_2_6 = new JLabel("Endereço:");
		lblNewLabel_3_1_2_6.setFont(new Font("Carlito", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_3_1_2_6, "cell 1 6,alignx trailing");
		
		textEnd = new JTextField();
		textEnd.setColumns(10);
		textEnd.setBackground(new Color(196, 196, 196));
		contentPane.add(textEnd, "cell 2 6 4 1,growx");
		
		JLabel lblNewLabel_3_1_2_7 = new JLabel("N°Pessoas Reserva");
		lblNewLabel_3_1_2_7.setFont(new Font("Carlito", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_3_1_2_7, "cell 6 6 2 1,alignx trailing");
		
		textPessoas = new JTextField();
		textPessoas.setColumns(10);
		textPessoas.setBackground(new Color(196, 196, 196));
		contentPane.add(textPessoas, "cell 8 6 3 1,growx");
		
		JLabel lblNewLabel_3_1_2_9 = new JLabel("Situações Especiais:");
		lblNewLabel_3_1_2_9.setFont(new Font("Carlito", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_3_1_2_9, "cell 1 7 2 1,alignx trailing");
		
		textSit = new JTextField();
		textSit.setColumns(10);
		textSit.setBackground(new Color(196, 196, 196));
		contentPane.add(textSit, "cell 3 7 2 1,growx");
		
		JLabel lblNewLabel_3_1_2_5 = new JLabel("Avaliação do Hóspede");
		lblNewLabel_3_1_2_5.setFont(new Font("Carlito", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_3_1_2_5, "cell 5 7 2 1,alignx trailing");
		
		textAval = new JTextField();
		textAval.setColumns(10);
		textAval.setBackground(new Color(196, 196, 196));
		contentPane.add(textAval, "cell 7 7 4 1,growx");
		
		JLabel lblNewLabel_3_1_2_9_1 = new JLabel("Dias Totais:");
		lblNewLabel_3_1_2_9_1.setFont(new Font("Carlito", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_3_1_2_9_1, "cell 1 8");
		
		textDiasT = new JTextField();
		textDiasT.setBackground(new Color(196, 196, 196));
		contentPane.add(textDiasT, "cell 2 8 2 1,growx");
		textDiasT.setColumns(10);
		
		JLabel lblNewLabel_3_1_2_8 = new JLabel("Total a pagar hospedagem:");
		lblNewLabel_3_1_2_8.setFont(new Font("Carlito", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_3_1_2_8, "cell 5 8 3 1,alignx trailing");
		
		textTotalPagar = new JTextField();
		textTotalPagar.setEditable(false);
		textTotalPagar.setColumns(10);
		textTotalPagar.setBackground(new Color(196, 196, 196));
		contentPane.add(textTotalPagar, "cell 8 8 2 1,growx");
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Hospede p= new Hospede();
				String nome=textNome.getText();
				String dataNasc=textDataNasc.getText();
				Integer passaporte=Integer.valueOf(textPassa.getText());
				String dataIn=textDatain.getText();
				String dataOut=textDataOut.getText();
				Integer nQuarto=Integer.valueOf(textQuarto.getText());
				Integer telefone=Integer.valueOf(textTelefone.getText());
				Integer nPessoas=Integer.valueOf(textPessoas.getText());
				String sitEso=textSit.getText();
				String avalHosp=textAval.getText();
				Integer diasT=Integer.valueOf(textDiasT.getText());
				String endereco=textEnd.getText();
				String email=textEmail.getText();
				Float totalHospedagem=(float) (diasT*237.9);
				textTotalPagar.setText(String.valueOf(totalHospedagem));
				
				p.setNome(nome);
				p.setDataNasc(dataNasc);
				p.setPassaporte(passaporte);
				p.setDataIn(dataIn);
				p.setDataOut(dataOut);
				p.setnQuarto(nQuarto);
				p.setTelefone(telefone);
				p.setnPessoas(nPessoas);
				p.setSitEso(sitEso);
				p.setAvalHosp(avalHosp);
				p.setTotalHospedagem(totalHospedagem);
				p.setNacionalidade((Nacionalidades) comboBox.getSelectedItem());
				p.setDiasT(diasT);
				p.setEndereco(endereco);
				p.setEmail(email);
				
				lista.add(p);
			
				t.atualizarDados(lista);
				
			}
		});
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				t.setVisible(true);
			}
		});
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Aluno\\Desktop\\Trabalho-Final-PDS\\Group 8781 (2).png"));
		contentPane.add(lblNewLabel_5, "cell 1 9 4 1");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Aluno\\Desktop\\Trabalho-Final-PDS\\Group 8781 (1).png"));
		contentPane.add(lblNewLabel_1, "cell 5 9 6 1,alignx right,aligny center");
	}

}

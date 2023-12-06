package view;

import java.awt.EventQueue;
import model.Hospede;
import model.tabelaHospedes;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TelaTabela extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private ArrayList<Hospede> listaHospede;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		ArrayList<Hospede> listaHospede;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaTabela frame = new TelaTabela();
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
	public TelaTabela() {
		setTitle("Checar/Manipular Registros");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1075, 771);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 251, 249));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 12, 1038, 500);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
		new Object[][]{},
		new String[]{
		"Nome", "Data Nascimento", "Passaporte", "Data Checkin", "Data Checkout","N° Quarto","Telefone", "N° Pessoas", "Situação Especial","Avaliação Hóspede", "Total Hospedagem","Nacionalidade","Dias Totais Estadia","Total a Pagar",
		}));
		scrollPane.setViewportView(table);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(5, 433, 390, 23);
		btnExcluir.addActionListener(e -> {
		int idx_linha = table.getSelectedRow();
		if (idx_linha < 0) {
		JOptionPane.showMessageDialog(null, "Selecione a registro para excluir!");
		return;
		}
		listaHospede.remove(idx_linha);
		atualizarDados(listaHospede);
		}
		
	
	public void atualizarDados(ArrayList<Hospede> hospede) {
		this.listaHospede=hospede;

		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);

		for (Hospede pessoa : listaHospede) {
		model.addRow(new Object[]{
		pessoa.getNome(),pessoa.getDataNasc(), pessoa.getPassaporte(), pessoa.getDataIn(),
		pessoa.getDataOut(),pessoa.getnQuarto(),pessoa.getTelefone(), pessoa.getnPessoas(), pessoa.getSitEso(),pessoa.getAvalHosp() ,pessoa.getTotalHospedagem(),pessoa.getTotalHospedagem(),pessoa.getNacionalidade(),pessoa.getDiasT()
		});
		}
}}

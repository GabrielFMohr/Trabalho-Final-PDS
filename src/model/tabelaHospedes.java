package model;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class tabelaHospedes extends AbstractTableModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Hospede> lista;
	private String[] colunas ={"Nome", "CPF ", "Telefone","Idade","Peso","Altura" };

	public tabelaHospedes(ArrayList<Hospede> lista) {
		this.lista=lista;
	}

	@Override
	public int getRowCount() {
		return this.lista.size();
	}

	@Override
	public int getColumnCount() {
		return colunas.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Hospede p = lista.get(rowIndex);
		if(columnIndex == 0) {
			return p.getNome();
		} 
		else if(columnIndex == 1) 
		{
			return p.getDataNasc();
		} 
		else if(columnIndex == 2) 
		{
			return p.getPassaporte();
		} 
		else if(columnIndex == 3) 
		{
			return p.getDataIn();
		} 
		else if(columnIndex == 4) 
		{
			return p.getDataOut();
		} 
		else if(columnIndex == 5) 
		{
			return p.getnQuarto();
		}
		else if(columnIndex == 6)
		{
			return p.getTelefone();
		}
		else if(columnIndex==7)
		{
			return p.getnPessoas();
		}
		else if(columnIndex == 8) 
		{
			return p.getSitEso();
		}
		else if(columnIndex == 9)
		{
			return p.getAvalHosp();
		}
		else if(columnIndex==10)
		{
			return p.getTotalHospedagem();
		}

		return null;
	}

	@Override
	public String getColumnName(int column) {
		return colunas[column];
	}


}

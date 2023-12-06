package model;

public class Hospede {
	private String nome;
	private String dataNasc;
	private Integer passaporte;
	private String dataIn;
	private String dataOut;
	private int nQuarto;
	private Integer telefone;
	private int nPessoas;
	private String sitEso;
	private String avalHosp;
	private Float totalHospedagem;
	private Nacionalidades nacionalidade;
	private Integer diasT;
	private String endereco;
	private String email;
	public Object getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(Nacionalidades object) {
		this.nacionalidade = object;
	}
	public String getNome() {
		return nome;
	}
	public String setNome(String nome) {
		return this.nome = nome;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	public Integer getPassaporte() {
		return passaporte;
	}
	public void setPassaporte(Integer passaporte) {
		this.passaporte = passaporte;
	}
	public String getDataIn() {
		return dataIn;
	}
	public void setDataIn(String dataIn) {
		this.dataIn = dataIn;
	}
	public String getDataOut() {
		return dataOut;
	}
	public void setDataOut(String dataOut) {
		this.dataOut = dataOut;
	}
	public int getnQuarto() {
		return nQuarto;
	}
	public void setnQuarto(int nQuarto) {
		this.nQuarto = nQuarto;
	}
	public Integer getTelefone() {
		return telefone;
	}
	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
	public int getnPessoas() {
		return nPessoas;
	}
	public void setnPessoas(int nPessoas) {
		this.nPessoas = nPessoas;
	}
	public String getSitEso() {
		return sitEso;
	}
	public void setSitEso(String sitEso) {
		this.sitEso = sitEso;
	}
	public String getAvalHosp() {
		return avalHosp;
	}
	public void setAvalHosp(String avalHosp) {
		this.avalHosp = avalHosp;
	}
	public Float getTotalHospedagem() {
		return totalHospedagem;
	}
	public void setTotalHospedagem(Float totalHospedagem) {
		this.totalHospedagem = totalHospedagem;
	}
	public Integer getDiasT() {
		return diasT;
	}
	public void setDiasT(Integer diasT) {
		this.diasT = diasT;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}

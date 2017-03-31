package model;

public class Funcionario{
    
    private int idFuncionario;
    private short nivelAcesso;
    private String restricaoAlimentar;
    
	public Funcionario(int idFuncionario, short nivelAcesso, String restricaoAlimentar) {
		super();
		this.idFuncionario = idFuncionario;
		this.nivelAcesso = nivelAcesso;
		this.restricaoAlimentar = restricaoAlimentar;
	}
	
	public int getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public short getNivelAcesso() {
		return nivelAcesso;
	}
	public void setNivelAcesso(short nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}
	public String getRestricaoAlimentar() {
		return restricaoAlimentar;
	}
	public void setRestricaoAlimentar(String restricaoAlimentar) {
		this.restricaoAlimentar = restricaoAlimentar;
	}
    
}

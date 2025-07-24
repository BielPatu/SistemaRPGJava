package habilidade;

public class Classehabilidade {
	protected String nome;
	protected String tipo;
	
	
	public Classehabilidade(String nome, String tipo) 
	{
		this.nome = nome;
		this.tipo = tipo;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public void setTipo(String tipo) 
	{
		this.tipo = tipo;
	}

	
	public String getTipo() 
	{
	return tipo;
	}
	
	public String getNome() 
	{
		return nome;
	}
}

package java8.lambda.chapter02;

public class Usuario {
	
	private String		aNome;
	private int			aPontuacao;
	private boolean		aIsModerador;
	
	public Usuario(String pNome) {
		this.aNome			= pNome;
		this.aPontuacao		= 0;
		this.aIsModerador	= false;
	}
	
	
	public String getName() {
		return this.aNome;
	}
	
	public int getPontuacao() {
		return this.aPontuacao;
	}
	
	public void adicionarPontuacao(int pPontos) {
		this.aPontuacao = this.aPontuacao + pPontos;
	}
	
	public void subtrairPontuacao(int pPontos) {
		this.aPontuacao = this.aPontuacao - pPontos;
	}
	
	public void tornarModerador() {
		this.aIsModerador = true;
	}
	
	public void revogarModerador() {
		this.aIsModerador = false;
	}
	
	public boolean isModerador() {
		return this.aIsModerador;
	}
	
	public boolean equals(Usuario pUser) {
		return
			this.getName()		.equals(	pUser.getName()			)	&&
			this.getPontuacao()	==			pUser.getPontuacao();
	}
	
}

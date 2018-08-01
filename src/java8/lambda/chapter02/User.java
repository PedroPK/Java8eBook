package java8.lambda.chapter02;

public interface User {
	
	public String getNome();
	public int getPontuacao();
	public void adicionarPontuacao(int pPontos);
	public void subtrairPontuacao(int pPontos);
	public void tornarModerador();
	public void revogarModerador();
	public boolean isModerador();
	public boolean equals(User pUser);
	
}
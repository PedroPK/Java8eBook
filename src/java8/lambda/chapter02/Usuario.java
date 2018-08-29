package java8.lambda.chapter02;

public class Usuario implements User {
	
	private String		aName;
	private int			aScore;
	private boolean		aIsModerador;
	
	public Usuario(String pNome) {
		this.aName			= pNome;
		this.aScore		= 0;
		this.aIsModerador	= false;
	}
	
	@Override
	public String getName() {
		return this.aName;
	}
	
	@Override
	public int getScore() {
		return this.aScore;
	}
	
	@Override
	public void addScorePoints(int pPontos) {
		this.aScore = this.aScore + pPontos;
	}
	
	@Override
	public void subtractScorePoints(int pPontos) {
		this.aScore = this.aScore - pPontos;
	}
	
	@Override
	public void becameModerator() {
		this.aIsModerador = true;
	}
	
	@Override
	public void revokeModerator() {
		this.aIsModerador = false;
	}
	
	@Override
	public boolean isModerator() {
		return this.aIsModerador;
	}
	
	@Override
	public boolean equals(User pUser) {
		return
			this.getName()		.equals(	pUser.getName()			)	&&
			this.getScore()	==			pUser.getScore();
	}
	
}

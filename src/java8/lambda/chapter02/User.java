package java8.lambda.chapter02;

public interface User {
	
	public String getName();
	public int getScore();
	public void addScorePoints(int pPontos);
	public void subtractScorePoints(int pPontos);
	public void becameModerator();
	public void revokeModerator();
	public boolean isModerator();
	public boolean equals(User pUser);
	
}
package entities;

public class Student {
	public String name;
	public double score1;
	public double score2;
	public double score3;
	
	public double finalScore() {
		double finalScore = score1 + score2 + score3;
		return finalScore;
	}
	
	public double missingPoints() {
		if (finalScore() < 60) {
			return 60.0 - finalScore();
		} else {
			return 0.0;
		}
	}
	
}

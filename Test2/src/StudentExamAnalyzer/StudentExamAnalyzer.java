package StudentExamAnalyzer;

public class StudentExamAnalyzer {
	public static double calculateAverage(int[] scores) {
		float sum=0;
		for(int i=0; i<=scores.length-1; i++) {
			 sum += scores[i];
		}
		double average = sum / scores.length;
		System.out.println(average);
		return average;
	}
	
	public static int findHighestScore(int [] scores) {
		int max = scores[0];
		for(int i=0; i<scores.length; i++) {
			if(max<scores[i]) {
				max=scores[i];
			}
		}
		System.out.println(max);
		return max;
	}
	
	public static void main(String[] args) {
		int[] studentscores = {45, 69, 43, 45};
		double average = calculateAverage(studentscores);
		int highestScore = findHighestScore(studentscores);
		
		System.out.println("The average is " + average);
		System.out.println("The highest score is " + highestScore);
		
		
	}

}

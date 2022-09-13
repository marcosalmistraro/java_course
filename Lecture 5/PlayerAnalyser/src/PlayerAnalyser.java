import java.util.Arrays;

public class PlayerAnalyser {
	
	public static int minGoalsScored(int[] nbGoalsScored){
		Arrays.sort(nbGoalsScored);
		return nbGoalsScored[0];
	}
	
	public static int maxGoalsScored(int[] nbGoalsScored){
		Arrays.sort(nbGoalsScored);
		return nbGoalsScored[nbGoalsScored.length - 1];
	}
	
	public static double meanGoalsScored(int[] nbGoalsScored){
		double sum = 0;
		for (int value : nbGoalsScored) {
			sum += value;
		}
		return sum/nbGoalsScored.length;
	}
	
	public static double medianGoalsScored(int[] nbGoalsScored){
		Arrays.sort(nbGoalsScored);
		if (nbGoalsScored.length % 2 != 0) {
			int index = (nbGoalsScored.length - 1)/2;
			return nbGoalsScored[index];
		} else {
			int index1 = nbGoalsScored.length/2 - 1;
			int index2 = nbGoalsScored.length/2;
			return (nbGoalsScored[index1] + nbGoalsScored[index2])/2.0;
		}
	}

	public static void main(String[] args){
		int[] array = new int[]{10, 3, 1, 6, 2, 3};
		int minGoalsScored = minGoalsScored(array);
		System.out.println("Minimum amount of goals: " + minGoalsScored);
		int maxGoalsScored = maxGoalsScored(array);
		System.out.println("Maximum amount of goals: " + maxGoalsScored);
		double meanGoalsScored = meanGoalsScored(array);
		System.out.println("Mean value of scored goals: " + meanGoalsScored);
		double medianGoalsScored = medianGoalsScored(array);
		System.out.println("Median value of scored goals: " + medianGoalsScored);
	}	
}
package resources;

public class StudentService {

	String url = "jdbc:mysql://gmudbtest.cvcwrhs6jtlj.us-east-1.rds.amazonaws.com:3306/";
	String username = "gmudbtest";
	String password = "gmudbtest";

	public double calculateStandardDiviation(Student student) {
		String raffles[] = (student.getRaffle()).split(",");
		int raffleInts[] = new int[20];
		int i = 0;
		int sum = 0;
		double diviation;
		for (String string : raffles) {
			raffleInts[i] = Integer.parseInt(string);
			i++;
		}

		double mean = calculateMean(student);
		for (int j = 0; j < raffles.length; j++) {
			sum += Math.pow((raffleInts[j] - mean), 2);

		}
		diviation = Math.pow(sum / (raffles.length - 1), 1 / 2);

		return diviation;
	}

	public double calculateMean(Student student) {
		String raffles[] = (student.getRaffle()).split(",");

		int sum = 0;

		int i;
		for (i = 0; i < raffles.length; i++) {
			int currentRaffle = Integer.parseInt(raffles[i]);
			sum += currentRaffle;
		}

		return sum / i;

	}

}
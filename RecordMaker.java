import java.util.*;

public class RecordMaker {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]); //command line으로부터 생성해야할 ID 갯수
		Random ran = new Random();
		
		String[] IDs = new String[num];
		int[] grades = new int[num];
		
		generateID(num, ran, IDs);
		generateGrade(num, ran, grades);
		printFormat(IDs, grades);
	}
	
	public static String[] generateID(int num, Random rand, String[] IDs) {
		int  n = 0;
		String id = "";
		for(int i=0; i<num; i++) {
			n = rand.nextInt(99999);
			id = String.format("%5s", Integer.toString(n)).replace(' ', '0');
			while(Arrays.asList(IDs).contains(id)) {
				id = String.format("%5s", Integer.toString(n)).replace(' ', '0');
			}
			IDs[i] = id;
		}
		return IDs;
	}
	public static int[] generateGrade(int num, Random rand, int[] grades) {
		int n = 0;
		for(int i = 0; i<num; i++) {
			n = rand.nextInt(99);
			grades[i] = n;
		}
		return grades;
	}
	public static void printFormat(String[] IDs, int[] grades) {
		String result = "";
		for(int i = 0; i<IDs.length; i++) {
			result = "NT" + IDs[i] + " " + grades[i];
			System.out.println(result);
		}
	}
}

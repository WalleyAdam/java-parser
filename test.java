package football;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
This is so dank
public class parser {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File("football.dat"));
		double[] tall = new double[9];
		boolean firstFlag = true;		
		double lowest = 0;
		double day = 0;
		
		
		

		//scanner.nextLine();

		while (scanner.hasNextLine()) {

			scanner.nextLine();
			
			if(scanner.hasNext("[^0-9]+"))
				scanner.nextLine();
			
			for (int i1 = 0; i1 < 9; i1++) {
				if (scanner.hasNext()) {

					String string = scanner.next();

					
					
					
					string = string.replaceAll("[^0-9]+$", "");
					
					if (string.isEmpty()) {
						string = "1";
					}
					
					tall[i1] = Double.parseDouble(string);
					

					System.out.print(tall[i1] + " ");

				}//uncomment these to see some output

			}
			System.out.println();
			if(firstFlag){
				lowest = tall[6] - tall[8];
				
				day = tall[0];
				firstFlag = false;
				
			}else{
			double temp = tall[6] - tall[8];
			
			if(temp < lowest){
				
				lowest = temp;
				day = tall[0];
			}
			}
		}
		
		System.out.println("The lowest spread of difference in the data set is: " + Math.abs(lowest) + " from day " + day);
	}
}

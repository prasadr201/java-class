/*
 * How to take input if there is a string and int both 
 * ex := 2
Barcelona 2
Malaga 1
RealMadrid 1
Eibar 0
Malaga 3
RealMadrid 2
Barcelona 8
Eibar 6
 */

 import java.util.*;
import java.lang.*;
import java.io.*;

class Qustion_Imp_1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);

        // Read the number of scenarios
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline

        for (int i = 0; i < T; i++) {
            int barcelonaGoals = 0, eibarGoals = 0, realMadridGoals = 0, malagaGoals = 0;

            // Read 4 lines for each scenario
            for (int j = 0; j < 4; j++) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                String teamName = parts[0];
                int goals = Integer.parseInt(parts[1]);

                // Determine which team's goals are being read
                switch (teamName) {
                    case "Barcelona":
                        barcelonaGoals = goals;
                        break;
                    case "Eibar":
                        eibarGoals = goals;
                        break;
                    case "RealMadrid":
                        realMadridGoals = goals;
                        break;
                    case "Malaga":
                        malagaGoals = goals;
                        break;
                }
            }

            // Now you can decide the winner based on the goals
            if (barcelonaGoals > eibarGoals && realMadridGoals < malagaGoals) {
                System.out.println("Barcelona");
            } else {
                System.out.println("RealMadrid");
            }
        }

        scanner.close();
   

	}
}

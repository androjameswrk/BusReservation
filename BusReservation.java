package ArrayList;
import java.io.IOException;
import java.util.Scanner;

public class BusRes {
	public static void main (String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int row;
		int col;
		String[][] Rseats = new String [11][5];
		System.out.println("Bus Seat Reservation:");
		for(int i = 0; i <= 10; i++) {
		if(i == 0) {
			System.out.print("");
		}
		else {
			System.out.print("Row" + i + " ");
		}
			for(int x = 1; x <= 4; x++) {
				if(i == 0) {
					Rseats [i][x] = "      Col" + x;
					System.out.print(Rseats[i][x]);
				}
				else {
					Rseats [i][x] = " *        ";
					System.out.print(Rseats[i][x]);
				}
			}
			System.out.println();
		}
		boolean condition = true;
		do {
			System.out.println("Enter row and column to reserve separated by space(Enter a negative number to exit):");
			row = input.nextInt();
			col = input.nextInt();
			for(int i = 0; i <= 10; i++) {
				if(i == 0) {
					System.out.print("");
				}
				else {
					System.out.print("Row" + i + " ");
				}
					for(int x = 1; x <= 4; x++) {
						if(i == 0) {
							Rseats [i][x] = "      Col" + x;
							System.out.print(Rseats[i][x]);
						}
						else if(row == i && col == x){
							Rseats [row][col] = " X        ";
							System.out.print(Rseats[i][x]);
						}
						else if(Rseats [i][x] == " X        "){
							Rseats [i][x] = " X        ";
							System.out.print(Rseats[i][x]);
						}
						else {
							Rseats [i][x] = " *        ";
							System.out.print(Rseats[i][x]);
						}
					}
					System.out.println();
					if(row <=0 && col <=0) {
						condition = false;
					}
				}
		}while(condition = true);
	}
}

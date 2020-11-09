package p1;

//import java.io.File;
import java.util.Scanner;

public class MainMenu {
	

	public static void main(String[] args) {
		
		//load existing list (doesn't actually load anything at the moment)
		DataResourceList drl = new DataResourceList();
		
		DataResource dr = new DataResource();
		
		// add try catch in case they enter something stupid
		System.out.println("What would you like to do?\n(1) Create a Data Resource.\n(2) Remove a Data Resource.\n(3) Edit an existing Data Resource.\n(4) Exit.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while (n != 4) {
			switch (n) {
			case 1:
				//add file to new/current data resource
				dr.addFile();
				if(dr.created == true) {
					drl.addDataResource(dr);
				}
				break;
			case 2:
				if(dr.created == true) {
					dr.removeFile();
				}else {
					System.out.print("No Data Resource is avaiab");
				}
				
				break;
			case 3:
				System.out.print("you picked 3");
				
				break;
			case 4:
				System.out.println("Exiting...");
				System.exit(0);
				break;
			default:
				System.out.println("Please enter a valid input.");
				n = sc.nextInt();
				break;
			}
			System.out.println("What would you like to do?\n(1) Add to a Data Resource.\n(2) Remove a Data Resource.\n(3) Edit an existing Data Resource.\n(4) Exit.");
			n = sc.nextInt();
		}
		//sc.close();
	}

}

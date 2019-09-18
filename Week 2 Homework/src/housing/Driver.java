package housing;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter; 
import java.io.IOException;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		House [] houses = new House[3]; 
		Scanner input = new Scanner(System.in);
		try {
			
			FileWriter fileObj = new FileWriter("RealEstate.txt");
			
			for (int i=0; i<3; i++) {
				Photo photo = new Photo();
				House house = new House();
				
				System.out.println("Please enter the House ID ");
				house.setId(input.nextInt());
								
				System.out.println("Please enter the house price ");
				house.setPrice(input.nextFloat());
								
				input.nextLine();
				
				System.out.println("Please enter the house location ");
				house.setLocation(input.nextLine());
							
				System.out.println("Please enter the house advertiser ");
				house.setAdvertiser(input.nextLine());
								
				System.out.println("Please enter the image code ");
				photo.setImgCode(input.nextInt());
								
				input.nextLine();
				
				System.out.println("Please enter the image name ");
				photo.setImgName(input.nextLine());
								
				fileObj.write("\nHouse ID: " + house.getId() + "\tHouse Price: " + house.getPrice() + 
						"\tHouse Location: " + house.getLocation() + "\tHouse Advertiser: " + house.getAdvertiser() 
						+ "\tImage Code: " + photo.getImgCode() + "\tImage Name: " + photo.getImgName() + "\n");
											
				houses[i]=house;
			}
			input.close();
			fileObj.close();
		} catch (IOException e) {
			System.out.println("An error occurred");
		}
		
		try {
			Scanner fileObj = new Scanner(new File("RealEstate.txt"));
			while (fileObj.hasNext()) {
				String data = fileObj.nextLine();
				System.out.println(data + "\n");
			}
			fileObj.close();
		}catch(FileNotFoundException e) {
			System.out.println("An error occured");
		}

	}

}


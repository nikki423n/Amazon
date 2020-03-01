package control;
import UI.*;
import main.*;



import java.util.ArrayList;
import java.util.Arrays;

public class Games extends Product{
	
	private String  creator, type;
	private int yearReleased, age;
	private String multiplayer;
	
	
	public Games(ArrayList generalProperties, ArrayList gameProperties) {
		//general properties
		super.name = (String) generalProperties.get(0);
		super.imagePath = (String) generalProperties.get(1);
		super.price = (double) generalProperties.get(2);
		super.rating = (double) generalProperties.get(3);
		
		//game specific 
		creator = (String) gameProperties.get(0);
		type = (String) gameProperties.get(1);
		yearReleased = (int) gameProperties.get(2);
		age = (int) gameProperties.get(3);
		multiplayer = (String) gameProperties.get(4);

		this.setDescription();
	}
	
	@Override
	protected void setDescription() {
		description = String.format("developed and created by %s "
				+ "-- released in %d. %s. %s. "
				+ "%d+", creator, yearReleased, type, multiplayer, age);
	}
	
	@Override
	public String toString() {
		return (description);
	}
	
	public static void main(String args[]) {
		ArrayList genProps = new ArrayList(Arrays.asList("Madden", "//", 60.00, 3.5));
		ArrayList gameProps = new ArrayList(Arrays.asList("EA", "Sports", 2020, 10, "Single player"));
		
		Product temp = new Games(genProps, gameProps);
		System.out.println(temp);
    
    /*
		// Convert all descriptions into strings
        // General descriptions
        String des_name = String.format("Product name: %s", super.name);
        String des_category = String.format("Category: Games");
        String des_imagePath = String.format("Image path: %s", super.imagePath);
        String des_price = String.format("Price: $%.2f", super.price);
        String des_rating = String.format("Rating: %.1f", super.rating);
        
        // Games descriptions
        String des_creator = String.format("Creator: %s", creator);
        String des_type = String.format("Type: %s", type);
        String des_yearReleased = String.format("Year released: %d", yearReleased);
        String des_age = String.format("Youngest age: %d", age);
        
        String des_multiplayer;
        
        if (multiplayer)
            des_multiplayer = String.format("Multiplayer: YES");
        else
            des_multiplayer = String.format("Multiplayer: NO");
        
        // print out Games properties
        System.out.println(des_name);
        System.out.println(des_creator);
        System.out.println(des_type);
        System.out.println(des_yearReleased);
        System.out.println(des_category);
        System.out.println(des_age);
        System.out.println(des_multiplayer);
        System.out.println(des_imagePath);
        System.out.println(des_price);
        System.out.println(des_rating);

    */
	}
}

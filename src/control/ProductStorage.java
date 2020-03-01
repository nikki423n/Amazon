import java.util.ArrayList;
import java.util.Arrays;
import UI.*;


public class ProductStorage {
    public static ArrayList<Product> prodElectronics = new ArrayList<>();
    public static ArrayList<Product> prodClothes = new ArrayList<>();
    public static ArrayList<Product> prodGames = new ArrayList<>();

    static {
        prodElectronics.add(new Electronics(new ArrayList(Arrays.asList("Madden", "//", 60.00, 3.5)),
                new ArrayList(Arrays.asList("Dell", "PC", 2015, true))));
        prodGames.add(new Games(new ArrayList(Arrays.asList("Madden", "//", 60.00, 3.5)),
                new ArrayList(Arrays.asList("EA", "Sports", 2020, 10, "Single player"))));

        System.out.println(prodElectronics.get(0).getName());
        System.out.println(prodGames);
    }
    public static void main(String args[])
    {
        ProductStorage temp = new ProductStorage();
    }

    
    public void addElectronics(Product e)
    {
        System.out.println("New electronic product added to product storage");
        e.setDescription();
        
        prodElectronics.add(e);
    }
    
    /**
     * Method to add one clothesc object to prodClothes ArrayList
     */

    public void addClothes(Product c)
    {
        prodClothes.add(c);
    }
    
    /**
     * Method to add one game object to prodGames ArrayList
     */
    
    public void addGames(Product g)
    {
        prodGames.add(g);
    }
    
    /**
     * Method to delete electronic object e from prodElectronics ArrayList
     */
    
    public void removeElectronics(Product e)
    {
        System.out.println("New electronic product removed from product storage");

        prodElectronics.remove(e);
    }
    
    /**
     * Method to delete clothes object c from prodClothes ArrayList
     */

    public void removeClothes(Product c)
    {
        prodClothes.remove(c);
    }
    
    /**
     * Method to delete game object g from prodGames ArrayList
     */
    
    public void removeGames(Product g)
    {
        prodGames.remove(g);
    }
}

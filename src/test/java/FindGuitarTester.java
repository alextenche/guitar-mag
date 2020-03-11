import enums.Builder;
import enums.Type;
import enums.Wood;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {

        // Set up Rick’s guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatErinLikes = new GuitarSpec("Stratocastor", Builder.FENDER, Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 12);

        List matchingGuitars = inventory.search(whatErinLikes);
        if (!matchingGuitars.isEmpty()) {
            System.out.println("Erin, you might like this guitars: ");
            for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
                Guitar guitar = (Guitar) i.next();
                GuitarSpec guitarSpec = guitar.getSpec();
                System.out.println("We have a " + guitarSpec.getBuilder() + " " + guitarSpec.getModel() + " "
                        + guitarSpec.getType() + " guitar: " + guitarSpec.getBackWood() + " back and sides, "
                        + guitarSpec.getTopWood() + " top. You can have it for only $" + guitar.getPrice() + "!");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        // Add guitars to the inventory...
        inventory.addGuitar("V95693", Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 1499.95, 12);
        inventory.addGuitar("V234", Builder.FENDER, "Stratocastor", Type.ACOUSTIC, Wood.ALDER, Wood.ALDER, 1550.50, 12);
        inventory.addGuitar("V123", Builder.GIBSON, "Rockastor", Type.ACOUSTIC, Wood.INDIAN_ROSEWOOD, Wood.BRAZILIAN_ROSEWOOD, 1725.90, 12);
        inventory.addGuitar("V9512", Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 1549.95, 12);
    }

}

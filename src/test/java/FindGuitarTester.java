public class FindGuitarTester {

    public static void main(String[] args) {

        // Set up Rick’s guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        inventory.addGuitar("V95693","Fender", "Stratocastor","electric", "Alder", "Alder", 1499.95);

        Guitar whatErinLikes = new Guitar("", "fender", "Stratocastor", "electric", "Alder", "Alder", 0);

        Guitar guitar = inventory.search(whatErinLikes);
        if (guitar != null) {
            System.out.println("Erin, you might like this " + guitar.getBuilder() + " " + guitar.getModel() + " "
                    + guitar.getType() + " guitar: " + guitar.getBackWood() + " back and sides,"
                    + guitar.getTopWood() + " top. You can have it for only $" + guitar.getPrice() + "!");
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        // Add guitars to the inventory...
        Guitar guitar1 =  new Guitar("123", "homemade", "Rockastor", "electric", "backwood", "topwood", 12);
        Guitar guitar2 =  new Guitar("234", "fender", "Stratocastor", "electric", "Alder", "Alder", 15);

        inventory.addGuitar("234", "fender", "Stratocastor", "electric", "Alder", "Alder", 15);
        inventory.addGuitar("123", "homemade", "Rockastor", "electric", "backwood", "topwood", 12);
    }

}

package OopLabPurple.OopLabPurpleInventory;

public class FactoryUtils {
    private static int count = 1;

    //TODO
    public static Item[] inititem() {
        Item[] itams = new Item[10];
        for (int i = 0; i < itams.length; i++) {
            //TODO return amount
            int amount = (int) (Math.random() * 26) + 50;
            //TODO enum random
            Category rand = Category.values()[(int) (Math.random() * 3)];
            //TODO arr full of
            itams[i] = new Item(count, "Coca Cola " + (count++), amount, rand);

        }
        return itams;

    }

    //TODO return total size of arr
    public static int totalsize(Inventory inventory1, Inventory inventory2, Inventory inventory3) {
        return inventory1.size() + inventory2.size() + inventory3.size();
    }

    //TODO  return total count of arr
    public static int totalCount(Inventory inventory1, Inventory inventory2, Inventory inventory3) {
        return inventory1.count() + inventory2.count() + inventory3.count();
    }

}

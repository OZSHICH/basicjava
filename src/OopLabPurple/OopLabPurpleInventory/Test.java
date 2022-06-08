package OopLabPurple.OopLabPurpleInventory;

public class Test {
    public static void main(String[] args) {
        Item i4 = new Item("tomer", Category.Zero);
        Inventory i1 = new Inventory();
        Inventory i2 = new Inventory(FactoryUtils.inititem());
        Inventory i3 = new Inventory(FactoryUtils.inititem());

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        System.out.println("------------");
        System.out.println(FactoryUtils.totalsize(i1, i2, i3));
        System.out.println(FactoryUtils.totalCount(i1, i2, i3));
        System.out.println();
        System.out.println(i4);

    }
}

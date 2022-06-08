package OopLabPurple.OopLabPurpleInventory;

public class Item {
    private static long count = 1;
    private long id = count;
    private String name;
    private int amount = 100;
    //TODO return enum
    private Category category;

    public Item(long id, String name, int amount, Category category) {
        //this(name, category);  //מחזור קוד לכתיבה יפה יותר
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.category = category;

    }

    public Item(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    public static long getCount() {
        return count;
    }

    public static void setCount(long count) {
        Item.count = count;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Itam{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", category='" + category + '\'' +
                '}';
    }
}

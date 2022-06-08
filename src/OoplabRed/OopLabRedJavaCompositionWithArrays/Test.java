package OoplabRed.OopLabRedJavaCompositionWithArrays;

public class Test {
    public static void main(String[] args) {
        //room1
        Guest g1 = new Guest("dan", "123");
        Guest g2 = new Guest("max", "321");
        //room2
        Guest g3 = new Guest("raz", "204");
        //room3
        Guest g4 = new Guest("bar", "258");

        Room r1 = new Room(4, "superior", 750);
        r1.addguest(g1);
        r1.addguest(g2);
        Room r2 = new Room(4, "superior", 750);
        r2.addguest(g3);
        Room r3 = new Room(5, "suite", 1500);
        r3.addguest(g4);

        Room[] rooms = {r1, r2, r3};

        Hotel M1 = new Hotel(rooms, "maxhotel", 4);

        System.out.println("does dan in the hotel?");
        M1.hasguest(g1);
        if (true) ;
        System.out.println("good to know!");
        System.out.println("does max in the hotel?");
        System.out.println(M1.hasguest(g2));

        Guest g5 = new Guest("meg", "456");
        System.out.println(M1.book(g5, "no room"));
        System.out.println(M1.book(g5, "superior"));


    }
}


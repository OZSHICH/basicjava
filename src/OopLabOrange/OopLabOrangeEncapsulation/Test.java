package OopLabOrange.OopLabOrangeEncapsulation;

public class Test {
    public static void main(String[] args) {

        System.out.println("----------Ex1----------");

        Person p1 = new Person();
        Person p2 = new Person(312171341, "SHICH", "OZ", "EILAT", false);
        Person p3 = new Person(312171341, "SHICH", "OZ");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("----------Ex2----------");

        Date d1 = new Date();
        Date d2 = new Date(18, 3, 1994);

        System.out.println(d1);
        System.out.println(d2);

        System.out.println("----------Ex3----------");

        Itam i1 = new Itam(312171341, "OZ", 2000, "ids");
        Itam i2 = new Itam("DOR", "ids");

        System.out.println(i1);
        System.out.println(i2);

        System.out.println("----------Ex4----------");

        Dog dg1 = new Dog();
        Dog dg2 = new Dog("max", 15);
        Dog dg3 = new Dog("max", 15, "black");
        Dog dg4 = new Dog("max", 15, "black", true);

        System.out.println(dg1);
        System.out.println(dg2);
        System.out.println(dg3);
        System.out.println(dg4);


        System.out.println("----------Ex5----------");

        Fish f1 = new Fish();
        Fish f2 = new Fish("nemo", "black");
        Fish f3 = new Fish("nemo", "black", 75);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);


        System.out.println("----------Ex6----------");

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(15, 25);
        Rectangle r3 = new Rectangle(15, 25, "black");

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        System.out.println("----------Ex7----------");

        Printer pr1 = new Printer();
        Printer pr2 = new Printer(3574159, "HPMKV18", "HP");
        Printer pr3 = new Printer(3574159, "HPMKV18", "HP", true);


        System.out.println(pr1);
        System.out.println(pr2);
        System.out.println(pr3);

        System.out.println("----------Ex8----------");

        Light l1 = new Light();
        Light l2 = new Light(5000, 14.99);
        Light l3 = new Light(5000, "worm");
        Light l4 = new Light(5000, "bright", 17.99);

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);

        System.out.println("----------Ex9----------");

        Box b1 = new Box();
        Box b2 = new Box(5, 10, 15);

        System.out.println(b1);
        System.out.println(b2);


        System.out.println("----------Ex10----------");

        Student s1 = new Student();
        Student s2 = new Student(312171341, "SHICH", "OZ", 90, "KOBY");

        System.out.println(s1);
        System.out.println(s2);


        System.out.println("GOOD DAY");


    }
}

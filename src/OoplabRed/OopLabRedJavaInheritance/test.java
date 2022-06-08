package OoplabRed.OopLabRedJavaInheritance;

public class test {
    public static void main(String[] args) {

        criminal c1 = new criminal("dor", 7);
        criminal c2 = new criminal("mor", 8);
        criminal c3 = new criminal("or", 3);
        criminal c4 = new criminal("OopLabPurpleDogGarden", 4);
        criminal c5 = new criminal("dorel", 5);
        criminal[] criminals = {c1, c2, c3, c4, c5};
        System.out.println("----------------------");
        policemen p1 = new policemen("ilan", 15);
        policemen p2 = new policemen("alon", 17);
        policemen p3 = new policemen("yarinn", 12);
        policemen[] policemens = {p1, p2, p3};
        System.out.println("----------------------");

        utils.print(policemens);
        utils.print(criminals);

        for (int i = 0; i < policemens.length; i++) {
            for (int j = 0; j < criminals.length; j++) {
                policemens[i].arrest(criminals[j]);
            }
        }
        utils.print(policemens);
        utils.print(criminals);

    }

}

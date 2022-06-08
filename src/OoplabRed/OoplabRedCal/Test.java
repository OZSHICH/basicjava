package OoplabRed.OoplabRedCal;

public class Test {
    public static void main(String[] args) {
        Cal cal = new Cal(7);
        cal.add(3); //10
        cal.add(5); //15
        cal.sub(3); //12
        cal.muli(2); //24
        cal.add(4); //28
        cal.div(3);  //9.3
        cal.sub(2); //7.3
        cal.pow(2);   // 53.7

        float result = cal.getResult();
        System.out.println(result);
    }

}

package OopLabPurple.OopLabPurpleGroup;

public class FactUtils {
    private static int countPerson = 1;

    private static String[] citis = {"tlv", "hfa", "jlm"};


    public static Group initGroup() {
        return new Group(initPerson(3, 7));
//        int idx = 0;
//        Group group = new Group();
//
//        Person[] people = new Person[10];
//        for (int i = idx; i < 3; i++) {
//            people[i].setSmoking(true);
//        }
//        for (int i = idx; i < people.length; i++) {
//            people[i].setSmoking(false);
//        }
//        group.setPeople(people);
//
//        return group;
    }

    //TODO check initGroup boolean is----
    public static Group initGroup(boolean isSmoking) {
        if (isSmoking) {
            return new Group(initPerson(10, 0));
        }
        return new Group(initPerson(0, 10));
        //return (isSmoking) ? new Group(initPeople(10,0)): new Group(initPeople(0,10));
    }


    public static Person intPerson(boolean isSmoking) {
        int id = countPerson;
        String firstName = "John " + id;
        String lastName = "Bryce " + id;

        String city = citis[(int) (Math.random() * 3)];
        return new Person(id, lastName, firstName, city, isSmoking);
    }

    //TODO check init given boolean
    public static Person[] initPerson(int smokers, int nonSmokers) {
        int len = smokers + nonSmokers;
        Person[] people = new Person[len];
        int idx = 0;
        for (idx = 0; idx < smokers; idx++) {
            people[idx] = intPerson(true);
        }
        for (idx = idx; idx < len; idx++) {
            people[idx] = intPerson(false);
        }
        return people;
    }
}
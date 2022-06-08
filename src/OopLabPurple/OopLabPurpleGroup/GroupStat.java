package OopLabPurple.OopLabPurpleGroup;

public class GroupStat {
    //TODO check count given boolean
    public static int numOfSmoker(Group group) {
        int count = 0;
        for (int i = 0; i < group.getPeople().length; i++) {
            if (group.getPeople()[i].isSmoking()) {
                count++;
            }
        }
        return count;
    }

    //TODO check count given name
    public static int numOfTel(Group group) {
        int count = 0;
        for (int i = 0; i < group.getPeople().length; i++) {
            if (group.getPeople()[i].getCity().equals("tlv")) ;
            count++;
        }
        return count;
    }

    //TODO check count given lives
    public static int numOfLive(Group group, String city) {
        int count = 0;
        for (int i = 0; i < group.getPeople().length; i++) {
            if (group.getPeople()[i].getCity().equals(city)) ;
            count++;
        }
        return count;
    }

}

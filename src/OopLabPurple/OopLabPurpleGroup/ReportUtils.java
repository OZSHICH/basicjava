package OopLabPurple.OopLabPurpleGroup;

import java.util.Arrays;

import static OopLabPurple.OopLabPurpleGroup.GroupStat.*;


public class ReportUtils {
    //TODO give all print
    public static void info(Group group) {
        System.out.println("@@@@@@@@@@@@@@@@@@@@Welcome to Report Group@@@@@@@@@@@@@@@@@@@@");
        System.out.println("group id : " + group.getId());
        System.out.println("group name : " + group.getName());
        System.out.println("people :");
        System.out.println(Arrays.toString(group.getPeople()));
        System.out.println("---------------------------------------------------------------");
        System.out.println("num of smokers    : " + numOfSmoker(group));
        System.out.println("num of telavivian : " + numOfTel(group));
        System.out.println("num of Hafanina : " + numOfLive(group, "HFA"));
        System.out.println("num of Jerusalmian : " + numOfLive(group, "JLM"));

    }
}

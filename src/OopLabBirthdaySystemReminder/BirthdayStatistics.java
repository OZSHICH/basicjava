package OopLabBirthdaySystemReminder;

import java.util.*;

public class BirthdayStatistics {
    public static int countMemebers() {
        return BirthdaySystemReminder.getInstance().getPeople().size();
    }

    public static int getHappyMonth() {
        List<Integer> people = new ArrayList<>();
        int max = 0;
        int maxIdx = 0;
        for (int i = 0; i < 12; i++) {
            people.add(i, 0);
        }
        for (Person person : BirthdaySystemReminder.getInstance().getPeople()) {
            people.set(person.getBirthday().getMonthValue() - 1, people.get(person.getBirthday().getMonthValue() - 1) + 1);
        }
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i) > max) {
                max = people.get(i);
                maxIdx = i + 1;
            }
        }
        return maxIdx;
    }

    public static int getSadlyMonth() {
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < 12; i++) {
//            map.put(i, 0);
//        }
//        for (Person person : BirthdaySystemReminder.getInstance().getPeople()) {
//            map.put(person.getBirthday().getMonthValue() - 1, map.get(person.getBirthday().getMonthValue() - 1) + 1);
//        }
//
//        int min = map.get(0);
//
//        for (int i = 0; i < map.size() - 1; i++) {
//            if (map.get(i) < map.get(i + 1)) {
//                min = i + 1;
//            }
//        }
//        return min;
//    }
        List<Integer> people = new ArrayList<>();
        int min = 50;
        int minIdx = 0;
        for (int i = 0; i < 12; i++) {
            people.add(i, 0);
        }
        for (Person person : BirthdaySystemReminder.getInstance().getPeople()) {
            people.set(person.getBirthday().getMonthValue() - 1, people.get(person.getBirthday().getMonthValue() - 1) + 1);
        }
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i) < min) {
                min = people.get(i);
                minIdx = i + 1;
            }
        }
        return minIdx;
    }

    public static Map<Integer, Integer> getEvents() {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 12; i++) {
            map.put(i, 0);
        }
        for (Person person : BirthdaySystemReminder.getInstance().getPeople()) {
            map.put(person.getBirthday().getMonthValue() - 1, map.get(person.getBirthday().getMonthValue() - 1) + 1);
        }
        return map;
    }
}

//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < 12; i++) {
//            map.put(i, 0);
//        }
//        for (Person person : BirthdaySystemReminder.getInstance().getPeople()) {
//            map.put(person.getBirthday().getMonthValue() - 1,
//                    map.get(person.getBirthday().getMonthValue() - 1) + 1);
//        }
//
//        int max = map.get(0);
//
//        for (int i = 0; i < map.size() - 1; i++) {
//            if (map.get(i) < map.get(i + 1)) {
//                max = i + 1;
//            }
//        }
//        return max;
//
//    }

//   }
//
//
//        int countJan = 0;
//        int countFab = 0;
//        int countMar = 0;
//        int countApr = 0;
//        int countMay = 0;
//        int countJun = 0;
//        int countJul = 0;
//        int countAug = 0;
//        int countSep = 0;
//        int countOct = 0;
//        int countNov = 0;
//        int countDec = 0;
//        int max = 1;

//        int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
//
//        for (Person person : birthdaySystemReminder.getPeople()) {
//            switch (person.getBirthday().getMonthValue()) {
//                case 1:
//                    arr[0]++;
//                    break;
//                case 2:
//                    arr[1]++;
//                    break;
//                case 3:
//                    arr[2]++;
//                    break;
//                case 4:
//                    arr[3]++;
//                    break;
//                case 5:
//                    arr[4]++;
//                    break;
//                case 6:
//                    arr[5]++;
//                    break;
//                case 7:
//                    arr[6]++;
//                    break;
//                case 8:
//                    arr[7]++;
//                    break;
//                case 9:
//                    arr[8]++;
//                    break;
//                case 10:
//                    arr[9]++;
//                    break;
//                case 11:
//                    arr[10]++;
//                    break;
//                case 12:
//                    arr[11]++;
//
//                    break;
//            }
//        }
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        return max;
//    }


//        HashMap<Integer, Integer> map = new HashMap<>();
////        List<Integer> people = new ArrayList<>();
////        int min = 0;
////        int minIdx = 0;
//        for (int i = 0; i < 12; i++) {
//            //people.add(i, 0);
//            map.put(i, 0);
//        }
//        for (Person person : BirthdaySystemReminder.getInstance().getPeople()) {
//            map.put(person.getBirthday().getMonthValue() - 1, map.get(person.getBirthday().getMonthValue() - 1) + 1);
//        }
////        for (Person person : BirthdaySystemReminder.getInstance().getPeople()) {
////            people.set(person.getBirthday().getMonthValue() - 1, people.get(person.getBirthday().getMonthValue() - 1) + 1);
////        }
//
//        int min = map.get(0);
//
//        for (int i = 0; i < map.size() - 1; i++) {
//            if (map.get(i) < map.get(i + 1)) {
//                min = i + 1;
//            }
//        }
//        return min;
//    }
//        for (int i = 0; i < people.size(); i++) {
//            if (people.get(i) < min) {
//                min = people.get(i);
//                minIdx = i + 1;
//
//            }
//
//        }
//        return minIdx;
//
//    }


//        int min = 1;
//        int countJan = 0;
//        int countFab = 0;
//        int countMar = 0;
//        int countApr = 0;
//        int countMay = 0;
//        int countJun = 0;
//        int countJul = 0;
//        int countAug = 0;
//        int countSep = 0;
//        int countOct = 0;
//        int countNov = 0;
//        int countDec = 0;
//
//        int[] arr = {countJan, countFab, countMar, countApr, countMay, countJun, countJul, countAug, countSep, countOct, countNov, countDec};
//
//        for (Person person : birthdaySystemReminder.getPeople()) {
//            switch (person.getBirthday().getMonthValue()) {
//                case 1:
//                    countJan++;
//                    break;
//                case 2:
//                    countFab++;
//                    break;
//                case 3:
//                    countMar++;
//                    break;
//                case 4:
//                    countApr++;
//                    break;
//                case 5:
//                    countMay++;
//                    break;
//                case 6:
//                    countJun++;
//                    break;
//                case 7:
//                    countJul++;
//                    break;
//                case 8:
//                    countAug++;
//                    break;
//                case 9:
//                    countSep++;
//                    break;
//                case 10:
//                    countOct++;
//                    break;
//                case 11:
//                    countNov++;
//                    break;
//                case 12:
//                    countDec++;
//                    break;
//            }
//        }
//
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }
//        return min;
//    }





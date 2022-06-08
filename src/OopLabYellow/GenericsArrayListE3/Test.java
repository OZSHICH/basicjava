package OopLabYellow.GenericsArrayListE3;

public class Test {
    public static void main(String[] args) {

        // Array Of Threads
        DynamicStringsArray array = new DynamicStringsArray();

        Task[] tasks = {new Task(array), new Task(array), new Task(array)};
        Thread[] threads = new Thread[3];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(tasks[i]);
            threads[i].start();
        }


        //Single Thread Checking

        System.out.println("Array is Empty : " + array.isEmpty());
        System.out.println(array);

        array.add("Hello");
        System.out.println("Array is Empty : " + array.isEmpty());
        System.out.println(array);
        array.add("World");
        System.out.println(array);
        array.add("Learn");
        System.out.println(array);
        array.add("Java");
        System.out.println(array);
        array.add("is");
        System.out.println(array);
        array.add("fun");
        System.out.println(array);
        array.remove(0);
        System.out.println(array);
        array.remove("Java");
        System.out.println(array);
        System.out.println("index of Learn : " + array.indexOf("Learn"));
        System.out.println(array);
        System.out.println("array contains 'is' word    : " + array.contains("is"));
        System.out.println("array contains 'moshe' word : " + array.contains("moshe"));
        System.out.println("Array is Empty : " + array.isEmpty());
        array.clear();
        System.out.println(array);
        System.out.println("Array is Empty : " + array.isEmpty());
        System.out.println(array);
        array.clear(true);
        System.out.println(array);


    }
}


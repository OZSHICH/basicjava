package OopLabYellow.GenericsArrayListE3;

public class Task  implements Runnable {

    private DynamicStringsArray array;

    public Task(DynamicStringsArray array) {
        this.array = array;
    }

    @Override
    public void run() {


        array.add("Hello");
        array.add("World");
        array.add("Learn");
        array.add("Java");
        array.add("is");
        array.add("fun");
        array.remove(0);
        array.remove("Java");
        System.out.println(array);
    }
}

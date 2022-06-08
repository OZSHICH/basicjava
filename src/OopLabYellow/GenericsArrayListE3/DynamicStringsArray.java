package OopLabYellow.GenericsArrayListE3;

import java.util.*;

public class DynamicStringsArray {

    private String[] data;
    private int size;
    private int strategy;
    public static final int STRATEGY_DOUBLE = 0;
    public static final int STRATEGY_50 = 1;
    public static final int CAPACITY_DEFAULT = 5;

    public DynamicStringsArray(int capacity, int strategy) {
        this.data = new String[capacity];
        this.strategy = strategy;
    }

    public DynamicStringsArray() {
        this.data = new String[CAPACITY_DEFAULT];
        this.strategy = STRATEGY_50;
    }

    private String[] copy(String[] dest, int count) {
        System.out.println(Arrays.toString(dest));
        for (int i = 0; i < count; i++) {
            dest[i] = data[i];
        }
        System.out.println(Arrays.toString(dest));
        return dest;
    }

    private void changeCapacity(int capacity) {
        System.out.println(Arrays.toString(data));
        String[] newData = new String[capacity];
        System.out.println(Arrays.toString(newData));
        this.data = copy(newData, data.length);
    }

    private int getGrowCapacity() {
        switch (strategy) {
            case STRATEGY_DOUBLE:
                return this.size * 2;
            case STRATEGY_50:
                return (int) (this.size * 1.5);
            default:
                return 0;
        }
    }

    private void grow() {
        changeCapacity(getGrowCapacity());
    }

    public synchronized void add(String element) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = element;
                this.size++;
                return;
            }
        }
        System.out.println("data is full...going to increase space");
        grow();
        System.out.println(Arrays.toString(data));
        add(element);
    }

    public synchronized void remove(int index) {

        if (index < 0 || index > data.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        data[index] = null;
        this.size--;
    }

    public synchronized void remove(String element) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                if (data[i].equals(element)) {
                    data[i] = null;
                    this.size--;
                }
            }
        }
    }

    public synchronized int indexOf(String element) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                if (data[i].equals(element)) {
                    return i;
                }
            }
        }

        return -1;
    }

    public synchronized void clip() {
        int countNulls = 0;
        for (String str : data) {
            if (str == null) {
                countNulls++;
            }
        }

        String[] tmp = new String[data.length - countNulls];

        int idx = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                tmp[idx++] = data[i];
            }
        }


        this.data = tmp;
        this.size = tmp.length;

        if (this.size == 0) {
            this.data = new String[1];
            this.data[0] = null;
        }

    }

    public synchronized boolean contains(String element) {
        for (String str : data) {
            if (str != null) {
                if (str.equals(element)) {
                    return true;
                }
            }
        }
        return false;
    }

    public synchronized void clear() {
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                data[i] = null;
            }
        }
        this.size = 0;
    }

    public synchronized void clear(boolean clip) {
        this.clear();
        if (clip) {
            clip();
        }
    }

    @Override
    public synchronized String toString() {
        return "DynamicStringsArray{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                ", strategy=" + strategy +
                '}';
    }

    public synchronized boolean isEmpty() {
        return this.size == 0;
    }
}


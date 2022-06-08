package OoplabRed.OopLabRedJavaCompositionWithArrays;

import java.util.Arrays;

public class Room {
    private Guest[] guests;
    private int maxguest; //max number of guest per room
    private int numguest; //number of guest
    private String roomname;
    private double rppn;  //room price per night

    public Room(int maxguest, String roomname, double rppn) {
        this.maxguest = maxguest;
        this.guests = new Guest[this.maxguest];
        this.roomname = roomname;
        this.rppn = rppn;
    }

    public Room(Room other) {
        this.maxguest = other.maxguest;
        this.roomname = other.roomname;
        this.rppn = other.rppn;
        this.numguest = other.numguest;
        this.guests = new Guest[other.numguest];

    }


    public Guest[] getGuests() {
        return guests;
    }

    public void setGuests(Guest[] guests) {
        this.guests = guests;
    }

    public int getMaxguest() {
        return maxguest;
    }

    public void setMaxguest(int maxguest) {
        if (maxguest < 0) {
            System.out.println("Invalid number");
            maxguest = 4;
        } else {
            this.maxguest = maxguest;
        }
    }

    public int getNumguest() {
        return numguest;
    }

    public void setNumguest(int numguest) {
        this.numguest = numguest;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public double getRppn() {
        return rppn;
    }

    public void setRppn(double rppn) {
        if (rppn < 0) {
            System.out.println("Invalid price...");
        } else {
            this.rppn = rppn;
        }
    }

    private boolean isfull() {
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {
                return false;
            }
        }
        return true;
    }

    public boolean isempty() {
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null) {
                return false;
            }
        }
        return true;
    }

    public boolean addguest(Guest guest) {
//        if (isfull()) {                               FOR או לרשום מיד אחרי לולאת ה
//            return false;                                   return false;
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {
                guests[i] = guest;
                return true;
            }
        }
        return false;
    }

    public boolean hasguest(Guest guest) {
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null && guests[i].equals(guest)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Room{" +
                "guests=" + Arrays.toString(guests) +
                ", maxguest=" + maxguest +
                ", numguest=" + numguest +
                ", roomname='" + roomname + '\'' +
                ", rppn=" + rppn +
                '}';
    }
}



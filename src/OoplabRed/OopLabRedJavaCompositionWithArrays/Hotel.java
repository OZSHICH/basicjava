package OoplabRed.OopLabRedJavaCompositionWithArrays;

public class Hotel {
    private Room[] rooms;
    private String hotelname;
    private int stars;

    public Hotel(Room[] roomnumber, String hotelname, int stars) {
        this.rooms = roomnumber;
        this.hotelname = hotelname;
        this.stars = stars;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        if (stars < 1 || stars > 5) {
            System.out.println("Invlid star");
            this.stars = 1;
        } else {
            this.stars = stars;
        }
    }

    public boolean hasguest(Guest guest) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].hasguest(guest)) {
                return true;
            }

        }
        return false;
    }

    public boolean book(Guest guest, String roomname) {
        if (!hasguest(guest)) {
            for (int i = 0; i < rooms.length; i++) {
                if (rooms[i].getRoomname() == roomname) {
                    return rooms[i].addguest(guest);
                }

            }
        }
        return false;
    }
}

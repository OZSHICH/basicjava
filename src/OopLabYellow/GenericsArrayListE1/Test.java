package OopLabYellow.GenericsArrayListE1;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        MusicSupplier musicSupplier = new MusicSupplier();

        Track track = musicSupplier.getTrackByName("Let it be");

        List<Track> allBandTracks = musicSupplier.getAllBandTracks("The Beatles");

        int length = musicSupplier.getTotalTracksLength("The Beatles");

        List<Track> allTracksBelowPrice = musicSupplier.getAllTracksBelowPrice(5.99);

        System.out.println(track);
        System.out.println(allBandTracks);
        System.out.println(length);
        System.out.println(allTracksBelowPrice);
    }
}

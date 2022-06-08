package OopLabYellow.GenericsArrayListE1;

import java.util.*;

public class MusicSupplier {
    private List<Track> tracks = new ArrayList<Track>();

    public MusicSupplier() {
        tracks.add(new Track("I believe I can fly", "R Kelly", 4.99, 185));
        tracks.add(new Track("7 rings", "Ariana Grande", 5.99, 195));
        tracks.add(new Track("Hey Mama", "David Guetta", 2.99, 190));
        tracks.add(new Track("Let it be", "The Beatles", 5.99, 301));
        tracks.add(new Track("Here comes the Sun", "The Beatles", 6.99, 203));
    }

    public MusicSupplier(List<Track> tracks) {
        this.tracks = tracks;
    }

    public Track getTrackByName(String name) {
        for (Track track : tracks) {
            if (track.getName().equals(name)) {
                return track;
            }
        }
        return null;
    }


    public List<Track> getAllTracksBelowPrice(double price) {
        List<Track> cheapTrack = new ArrayList<>();
        for (Track track : tracks) {
            if (track.getPrice() < price) {
                cheapTrack.add(track);
            }
        }
        return cheapTrack;
    }


    public List<Track> getAllBandTracks(String bandName) {
        List<Track> bandTracks = new ArrayList<>();
        for (Track track : tracks) {
            if (track.getBandName().equals(bandName)) {
                bandTracks.add(track);
            }

        }
        return bandTracks;
    }

    public int getTotalTracksLength(String bandName) {
        int sum = 0;
        for (Track track : tracks) {
            if (track.getBandName().equals(bandName)) {
                sum += track.getLengthSeconds();
            }

        }

        return sum;
    }

}

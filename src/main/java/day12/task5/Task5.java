package day12.task5;

import day12.task3.MusicBand;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusikArtist> members1 = new ArrayList<>();

        members1.add(new MusikArtist("Horhe Mosvidal", 23));
        members1.add(new MusikArtist("Jon Human", 54));
        members1.add(new MusikArtist("Adele", 43));
        members1.add(new MusikArtist("Bob Marly", 87));
        members1.add(new MusikArtist("Katty Perry", 53));
        members1.add(new MusikArtist("Jim Karry", 15));

        MusicBand band1 = new MusicBand("Hooly Back", 1988, members1);

        List<MusikArtist> members2 = new ArrayList<>();
        members2.add(new MusikArtist("Kosi", 22));
        members2.add(new MusikArtist("Askut Hydu", 15));
        members2.add(new MusikArtist("Beayty", 54));
        members2.add(new MusikArtist("Monry", 63));

        MusicBand band2 = new MusicBand("Horhe", 1783, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1,band2);

        band1.printMembers();
        band2.printMembers();
    }
}

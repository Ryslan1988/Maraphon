package day12.task3;

import day12.task5.MusikArtist;

import java.io.LineNumberInputStream;
import java.io.StringReader;
import java.util.List;

public class MusicBand {
    private String nane;
    private int year;
    private List<MusikArtist> members;

    public MusicBand(String nane, int year, List<MusikArtist> members) {
        this.nane = nane;
        this.year = year;
        this.members = members;
    }


    public String getNane() {
        return nane;
    }

    public void setNane(String nane) {
        this.nane = nane;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<MusikArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusikArtist> members) {
        this.members = members;
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        for (MusikArtist member : a.getMembers())
            b.getMembers().add(member);
        a.getMembers().clear();
    }

    public void printMembers() {
        System.out.println(this.members);
    }


    @Override
    public String toString() {
        return "MusicBand{" +
                "nane='" + nane + '\'' +
                ", year=" + year +
                '}';
    }
}

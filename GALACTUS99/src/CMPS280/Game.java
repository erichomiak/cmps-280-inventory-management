package CMPS280;

import java.util.ArrayList;

public class Game {
    protected static ArrayList<String> title = new ArrayList<>();
    private static ArrayList<String> genre = new ArrayList<>();
    private static ArrayList<String> publisher = new ArrayList<>();
    private static ArrayList<String> developer = new ArrayList<>();
    private static ArrayList<String> releaseDate = new ArrayList<>();
    private static ArrayList<String> console = new ArrayList<>();
    private static ArrayList<String> numberOfPlayers = new ArrayList<>();
    private static ArrayList<String> price = new ArrayList<>();
    private static ArrayList<String> numberOfUnits = new ArrayList<>();
    private static ArrayList<String> test1 = new ArrayList<>();
    private static ArrayList<String> test2 = new ArrayList<>();
    private static ArrayList<String> test3 = new ArrayList<>();


    //TITLE Methods
    public static void addTitle(String name) {
        title.add(name);
    }

    public static int getTitleLength() {
        return title.size();
    }

    public static String getTitle(int i) {
        return title.get(i);
    }

    //GENRE Methods
    public static void addGenre(String name) {
        genre.add(name);
    }

    public static String getGenre(int i) {
        return genre.get(i);
    }

    //PUBLISHER
    public static void addPublisher(String name) {
        publisher.add(name);
    }

    public static String getPublisher(int i) {
        return publisher.get(i);
    }

    //DEVELOPER
    public static void addDeveloper(String name) {
        developer.add(name);
    }

    public static String getDeveloper(int i) {
        return developer.get(i);
    }

    //RELEASE DATE
    public static void addReleaseDate(String name) {
        releaseDate.add(name);
    }

    public static String getReleaseDate(int i) {
        return releaseDate.get(i);
    }

    //CONSOLE
    public static void addConsole(String name) {
        console.add(name);
    }

    public static String getConsole(int i) {
        return console.get(i);
    }

    //NUMBER OF PLAYERS
    public static void addNumberOfPlayers(String name) {
        numberOfPlayers.add(name);
    }

    public static String getNumberOfPlayers(int i) {
        return numberOfPlayers.get(i);
    }

    //PRICE
    public static void addPrice(String name) {
        price.add(name);
    }

    public static String getPrice(int i) {
        return price.get(i);
    }

    //NUMBER OF UNITS
    public static void addNumberOfUnits(String name) {
        numberOfUnits.add(name);
    }

    public static String getNumberOfUnits(int i) {
        return numberOfUnits.get(i);
    }

    public static void addTest1(String name) {
        test1.add(name);
    }

    public static String getTest1(int i) {
        return test1.get(i);
    }

    public static void addTest2(String name) {
        test2.add(name);
    }

    public static String getTest2(int i) {
        return test2.get(i);
    }

    public static void addTest3(String name) {
        test3.add(name);
    }

    public static String getTest3(int i) {
        return test3.get(i);
    }



}

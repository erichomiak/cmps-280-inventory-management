package CMPS280;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;

public class Main {

    public void menu() {
        System.out.println("Welcome");
        System.out.println("");
        System.out.println("1 - Enter a new game in to the inventory");
        System.out.println("2 - Search inventory for a game");
        System.out.println("3 - Export current inventory to a .csv file");
        System.out.println("4 - Exit");
        System.out.println("Please enter a number corresponding with the action you would like to take: ");
    }

    public Main() throws IOException{
        Game G = new Game();
        boolean end = false;
        Scanner in = new Scanner(System.in);
        menu();
        while (end == false) {
            switch (in.nextInt()) {
                case 1:
                    //ENTERING NEW GAMES
                    Scanner s = new Scanner(System.in);
                    System.out.println("Enter the game's title: ");
                    G.addTitle(s.nextLine());
                    System.out.println("Enter the game's genre: ");
                    G.addGenre(s.nextLine());
                    System.out.println("Enter the game's publisher: ");
                    G.addPublisher(s.nextLine());
                    System.out.println("Enter the game's developer: ");
                    G.addDeveloper(s.nextLine());
                    System.out.println("Enter the game's release date: ");
                    G.addReleaseDate(s.nextLine());
                    System.out.println("Enter the game's console: ");
                    G.addConsole(s.nextLine());
                    System.out.println("Enter the game's number of players: ");
                    G.addNumberOfPlayers(s.nextLine());
                    System.out.println("Enter the game's price: ");
                    G.addPrice(s.nextLine());
                    System.out.println("Enter the number of this title to add to the inventory: ");
                    G.addNumberOfUnits(s.nextLine());
                    System.out.println("1 - Enter a new game in to the inventory");
                    System.out.println("2 - Search inventory for a game");
                    System.out.println("3 - Export current inventory to a .csv file");
                    System.out.println("4 - Exit");
                    System.out.println("Please enter a number corresponding with the action you would like to take: ");
                    break;

                case 2:
                    //SEARCH INVERNTORY FOR GAMES
                    System.out.println("Enter the name of the game: ");
                    Scanner gameSearch = new Scanner(System.in);
                    String searchCriteria = gameSearch.nextLine();
                    for (String x: G.title) {
                        if (searchCriteria.contains(x)) {
                            System.out.println("Game information:");
                            System.out.println("Title: " + G.getTitle(G.title.indexOf(searchCriteria)) + ", " +
                                    "Genre: " + G.getGenre(G.title.indexOf(searchCriteria)) + ", " + "Published By: " + G.getPublisher(G.title.indexOf(searchCriteria)) + ", " +
                                    "Developed By: " + G.getDeveloper(G.title.indexOf(searchCriteria)) + ", " + "Release Date: " + G.getReleaseDate(G.title.indexOf(searchCriteria)) + ", " +
                                    "Console: " + G.getConsole(G.title.indexOf(searchCriteria)) + ", " + "Number of Players: " + G.getNumberOfPlayers(G.title.indexOf(searchCriteria)) + ", " +
                                    "Current Price: " + G.getPrice(G.title.indexOf(searchCriteria)) + ", " + "Number of Units Available: " + G.getNumberOfUnits(G.title.indexOf(searchCriteria)));
                            break;
                        }
                        else {
                            System.out.println("The game you searched for could not be found.");
                        }
                    }
                    System.out.println("1 - Enter a new game in to the inventory");
                    System.out.println("2 - Search inventory for a game");
                    System.out.println("3 - Export current inventory to a .csv file");
                    System.out.println("4 - Exit");
                    System.out.println("Please enter a number corresponding with the action you would like to take: ");
                    break;

                case 3:
                    //EXPORT CURRENT INVENTORY TO A .CSV
                    File csvExport = new File("OUTPUT/CURRENT_INVENTORY.csv");
                    PrintWriter csvPrint = new PrintWriter(csvExport);
                    csvPrint.println("Title, Genre, Published By, Developed By, Release Date, Console, Number Of Players, Current Price, Number of Units Available");
                    for (int i = 0; i < G.title.size(); i++) {
                        csvPrint.println(G.getTitle(i) + ", " + G.getGenre(i) + ", " +  G.getPublisher(i) + ", " +
                                G.getDeveloper(i) + ", " + G.getReleaseDate(i) + ", " +
                                G.getConsole(i) + ", " + G.getNumberOfPlayers(i) + ", " +
                                G.getPrice(i) + ", " + G.getNumberOfUnits(i));
                    }
                    csvPrint.close();
                    System.out.println("1 - Enter a new game in to the inventory");
                    System.out.println("2 - Search inventory for a game");
                    System.out.println("3 - Export current inventory to a .csv file");
                    System.out.println("4 - Exit");
                    System.out.println("Please enter a number corresponding with the action you would like to take: ");
                    break;

                case 4:
                    //EXIT
                    System.out.println("Goodbye");
                    end = true;
                    break;

                default:
                    System.out.println("Please enter a valid input");
                    break;
            }
        }
    }


    public static void main(String[] args) throws IOException {
        new Main();

        Test.readFile1();
        Test.readFile2();
        Test.readFile3();

        }

    }


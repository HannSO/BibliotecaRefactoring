package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Program {
    private static boolean loggedIn = false;
    private static String savedLibraryNumber = "";

    public static void main(String[] args) {
        while (true) {
            MenuOptions menuOption = new MenuOptions();
            menuOption.print();
            MovieOptions movieOptions = new MovieOptions();

            InputStreamReader inputStream = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(inputStream);
            int menuInput = 0;
            try {
                menuInput = Integer.parseInt(reader.readLine());
            } catch (Exception e) {
                // Do you know what numbers are!!!
                System.out.println("Enter a valid integer!!");
            }

            if (menuInput == 1) {
                printBookOptions();
            } else if (menuInput == 2) {
                System.out.println(" Please enter the number of the book you wish to checkout: ");
                int bookInput = 0;
                try {
                    bookInput = Integer.parseInt(reader.readLine());
                } catch (Exception e) {
                    // Do you know what numbers are!!!
                    System.out.println("Enter a valid integer!!");

                }
                switch (bookInput) {
                    case 1:
                        printSuccessfulBookCheckout();
                    case 2:
                        printSuccessfulBookCheckout();
                    case 3:
                        printSuccessfulBookCheckout();
                    case 4:
                        printSuccessfulBookCheckout();
                        break;
                    default:
                        System.out.println("\n");
                        System.out.println("Sorry we don't have that book yet.");
                }
            } else if (menuInput == 3) {
                if (loggedIn()) {
                    System.out.println("\n");
                    System.out.println("Your library number is " + savedLibraryNumber);
                } else {

                    System.out.println("\n");
                    System.out.println("Please talk to Librarian. Thank you.");
                }
            } else if (menuInput == 4) {
                movieOptions.print();
            } else if (menuInput == 5) {
                clearLogin();
                System.out.println("Enter your library number");
                try {
                    String libraryNumber = reader.readLine();
                    if (validLibraryNumber(libraryNumber)) {
                        try {
                            System.out.println("Enter your Password: ");
                            String password = reader.readLine();
                            if (validPassword(password)) {
                                loggedIn = true;
                                savedLibraryNumber = libraryNumber;
                            }
                        } catch (Exception e) {

                        }
                    }
                } catch (Exception e) {

                }

            } else if (menuInput == 9) {
                System.out.println("Quitting...");
                break;
            } else {
                System.out.println("\n");
                System.out.println("Enter a valid integer!!");
            }
        }
    }

    private static void printSuccessfulBookCheckout() {
        System.out.println("\n");
        System.out.println(" Thank You! Enjoy the book.");
        return;
    }



    private static void printBookOptions() {
        System.out.println(" 1. Sweet Valley High vol. 4 by John Travolta ");
        System.out.println(" 2. eXtreme Programming Explained by Kent Beck ");
        System.out.println(" 3. How to Win Friends and Influence People by Dale Carnagie ");
        System.out.println(" 4. How to Cheat at TWU Assignements by Anonymous ");
    }


    private static boolean validPassword(String password) {
        return "bhaisahab".equals(password);
    }

    private static boolean validLibraryNumber(String libraryNumber) {
        return libraryNumber.matches("\\d\\d\\d-\\d\\d\\d\\d");
    }

    private static boolean loggedIn() {
        return loggedIn;
    }


    private static void clearLogin() {
        loggedIn = false;
        savedLibraryNumber = "";
    }


}


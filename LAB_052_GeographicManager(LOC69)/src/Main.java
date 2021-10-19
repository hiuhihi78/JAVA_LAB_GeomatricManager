
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Country> list = new ArrayList<>();
        // loop until user want to exit
        while (true) {
            // display menu
            Manager.displayMenu();
            // choice option
            int choice = GetValue.getIntNumberInRange(1, 5, "your choice");
            switch (choice) {
                case 1:
                    // input country
                    Manager.inputCountry(list);
                    break;
                case 2:
                    // display country just inputed
                    Manager.displayCountryJustInputted(list);
                    break;
                case 3:
                    // searcg country by name
                    Manager.searchCountryByName(list);
                    break;
                case 4:
                    // display all cuntry by ascending name
                    Manager.displayAllCoutryByAscendingName(list);
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }

}

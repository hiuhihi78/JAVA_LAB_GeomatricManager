
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
class Manager {

    public static void displayMenu() {
        System.out.println("                                   MENU");
        System.out.println("==========================================================================");
        System.out.println("1. Input the information of 11 countries in East Asia");
        System.out.println("2. Display the information of country you've just input");
        System.out.println("3. Search the information of country by user-entered name");
        System.out.println("4. Display the information of countries sorted name in ascending order");
        System.out.println("5. Exit ");
        System.out.println("==========================================================================");
    }

    public static void inputCountry(ArrayList<Country> list) {
        // check was input enough 11 country
        if(list.size() == 2){
            System.out.println("Can not adding more contry! (11 country was inputted)!\n");
            return;
        }
        String countryCode = GetValue.getCountryCode(list);
        if (countryCode == null) { // country was existed
            return;
        }
        String countryName = GetValue.getCountryName(list);
        if (countryName == null) { // country was existed
            return;
        }
        double totalArea = GetValue.getInputPositiveDouble("total Area");
        String countryTerrain = GetValue.getCountryTerrain();
        list.add(new Country(countryCode, countryName, totalArea, countryTerrain));
        System.out.println("Successfully!\n");
    }

    public static void displayCountryJustInputted(ArrayList<Country> list) {
        if (list.size() == 0) {
            System.out.println("System is empty!\n");
            return;
        }
        String format = String.format("%-15s%-16s%-16s%s", "ID", "Name", "Total Area", "Terrain");
        System.out.println(format);
        System.out.println(list.get(list.size() - 1));

    }

    public static void searchCountryByName(ArrayList<Country> list) {
        ArrayList<Country> listSearch = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        // input part of name
        System.out.print("Enter the name you want to search for: ");
        String inputPartOfName = scanner.nextLine().trim();
        /* travese all element of list to find country have nam contain 
        inputPartOfName to add into listSearch*/
        for (Country country : list) {
            if (country.getCountryName().contains(inputPartOfName)) {
                listSearch.add(country);
            }
        }
        if (listSearch.size() == 0) { // not found
            System.out.println("Country is not found!\n");
        } else {
            String format = String.format("%-15s%-16s%-16s%s", "ID", "Name", "Total Area", "Terrain");
            System.out.println(format);
            for (Country country : listSearch) {
                System.out.println(country);
            }
        }

    }

    public static void displayAllCoutryByAscendingName(ArrayList<Country> list) {
        if (list.size() == 0) {
            System.out.println("System is empty!\n");
            return;
        } else {
            String format = String.format("%-15s%-16s%-16s%s", "ID", "Name", "Total Area", "Terrain");
            System.out.println(format);
            for (Country country : list) {
                System.out.println(country);
            }
            System.out.println("");
        }
    }

}

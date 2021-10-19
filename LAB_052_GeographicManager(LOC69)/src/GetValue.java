
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
class GetValue {

    private static final Scanner scanner = new Scanner(System.in);

    public static int getIntNumberInRange(int from, int to, String msg) {
        int result = 0;
        // loop until user input correct
        while (true) {
            result = getInputPositiveInt(msg);
            if (result < from || result > to) {
                System.err.println("Invalid of " + msg + ", " + msg
                        + " must be in range [" + from + " - " + to + "]!");
            } else {
                return result;
            }
        }
    }

    public static String getInputString(String msg) {
        String result = null;
        // loop until user input correct
        while (true) {
            System.out.print("Enter " + msg + ": ");
            result = scanner.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Invalid of " + msg + ", " + msg + " must be not empty!");
            } else {
                return result;
            }
        }
    }

    public static int getInputPositiveInt(String msg) {
        int result = 0;
        // loop until user input correct
        while (true) {
            try {
                String temp = getInputString(msg);
                result = Integer.parseInt(temp);
                if (result < 0) {
                    System.err.println("Invalid of " + msg + ", " + msg + " must be positive interger!");
                    continue;
                } else if (result == 0) {
                    System.err.println("Invalid of " + msg + ", " + msg + " must be greater than 0!");
                } else {
                    return result;
                }
            } catch (Exception e) {
                System.err.println("Invalid of " + msg + ", " + msg + " must be positive interger!");
            }
        }
    }

    public static double getInputPositiveDouble(String msg) {
        double result = 0;
        // loop until user input correct
        while (true) {
            try {
                String temp = getInputString(msg);
                result = Double.parseDouble(temp);
                if (result < 0) {
                    System.err.println("Invalid of " + msg + ", " + msg + " must be a postive number!");
                } else {
                    return result;
                }
            } catch (Exception e) {
                System.err.println("Invalid of " + msg + ", " + msg + " must be a number!");
            }
        }
    }

    public static String getCountryCode(ArrayList<Country> list) {
        String coutntryCode = getInputString("code of country");
        // check country was existed 
        boolean countryExisted = Validation.checkCountryExistedByCodeCountry(list, coutntryCode);
        if (countryExisted == true) {
            System.out.println("This country was existed in system!\n");
            return null;
        } else {
            return coutntryCode.toUpperCase();
        }
    }

    public static String getStringUppercaseEachLetter(String string) {
        char[] allChar = string.toCharArray();
        String result = "";
        String character = "";
        for (int i = 0; i < allChar.length; i++) {
            if (i == 0) {
                character = (allChar[0] + "").toUpperCase();
            } else if (allChar[i - 1] == 32) {
                character = (allChar[i] + "").toUpperCase();
            } else {
                character = (allChar[i] + "").toLowerCase();
            }
            result = result + character;
        }
        return result;
    }

    public static String getCountryName(ArrayList<Country> list) {
        String countryName = getInputString("name of country");
        // check country was existed
        boolean countryExisted = Validation.checkCountryExistedByCountryName(list, countryName);
        if (countryExisted == true) {
            System.out.println("This country was existed in system!\n");
            return null;
        } else {
            return getStringUppercaseEachLetter(countryName);
        }
    }

    public static String getCountryTerrain() {
        String countryTerrain = getInputString("rerrain of country");
        return getStringUppercaseEachLetter(countryTerrain);
    }
}

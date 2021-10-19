
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
class Validation {

    public static boolean checkCountryExistedByCodeCountry(ArrayList<Country> list, String coutntryCode) {
        for(Country country : list){
            if(country.getCountryCode().equalsIgnoreCase(coutntryCode)){
                return true;
            }
        }
        return false;
    }

    public static boolean checkCountryExistedByCountryName(ArrayList<Country> list, String countryName) {
        for(Country country : list){
            if(country.getCountryName().equalsIgnoreCase(countryName)){
                return true;
            }
        }
        return false;
    }
    
}

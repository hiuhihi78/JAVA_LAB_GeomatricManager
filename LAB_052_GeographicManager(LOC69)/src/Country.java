/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
class Country {

    private String countryCode;
    private String countryName;
    private double totalArea;
    private String countryTerrain;

    public Country() {
    }

    public Country(String countryCode, String countryName, double totalArea, String countryTerrain) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.totalArea = totalArea;
        this.countryTerrain = countryTerrain;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public double getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(double totalArea) {
        this.totalArea = totalArea;
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    @Override
    public String toString() {
       String string = String.format("%-15s%-16s%-16.1f%s", countryCode, countryName, totalArea, countryTerrain);
       return string;
    }
    
    
    
    
    

}

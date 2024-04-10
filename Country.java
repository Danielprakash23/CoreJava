package com.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Country {
    private HashMap<String, String> countryMap = new HashMap<>();

    public HashMap<String, String> getCountryMap() {
        return countryMap;
    }

    public void setCountryMap(HashMap<String, String> countryMap) {
        this.countryMap = countryMap;
    }

    public void add(String cname, String capname) {
        countryMap.put(cname.toLowerCase(), capname);
    }

    public String search(String cname) {
        return countryMap.getOrDefault(cname.toLowerCase(), "Data not found");
    }
}
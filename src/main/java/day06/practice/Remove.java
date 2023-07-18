package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class Remove {
	public static void main(String[] args) {
		
		List<String> cityList = new ArrayList<String>();
		
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");
		
		List<String> newCityList = new ArrayList<String>();
		
		for (String cityName : cityList) {
			if (!newCityList.contains(cityName)) {
				newCityList.add(cityName);
			}
		}
		
		for (String newCityName : newCityList) {
			System.out.println(newCityName);
		}
		
	}
}

package collection_prac;

import java.util.*;

public class Comparable_test {

	public static void main(String[] args) {

		Country indiaCountry = new Country(1, "India");
		Country usaCountry = new Country(4, "USA");
		Country russiaCountry = new Country(3, "Russia");
		Country japanCountry = new Country(2, "Japan");

		List<Country> listOfCountries = new ArrayList<Country>();
		listOfCountries.add(indiaCountry);
		listOfCountries.add(usaCountry);
		listOfCountries.add(russiaCountry);
		listOfCountries.add(japanCountry);

		System.out.println("Before Sort  : ");
		for (int i = 0; i < listOfCountries.size(); i++) {
			Country country = (Country) listOfCountries.get(i);
			System.out.println(
					"Country Id: " + country.getCountryId() + "||" + "Country name:" + country.getCountryName());
		}
		Collections.sort(listOfCountries);

		System.out.println("After Sort  : ");
		for (int i = 0; i < listOfCountries.size(); i++) {
			Country country = (Country) listOfCountries.get(i);
			System.out.println(
					"Country Id: " + country.getCountryId() + "|| " + "Country name: " + country.getCountryName());
		}

	}

}

class Country implements Comparable<Country> {
	int countryId;
	String countryName;

	public Country(int countryId, String countryName) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
	}

	@Override
	public int compareTo(Country country) {
		
		System.out.println(this.countryName.compareToIgnoreCase(country.countryName));
		
		return (this.countryId < country.countryId) ? -1 : (this.countryId > country.countryId) ? 1 : 0;
		
		//name 
		//return this.countryName.compareToIgnoreCase(country.countryName);
		
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}

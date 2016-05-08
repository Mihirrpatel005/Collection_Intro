package collection_prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CountrySortByIdComparator implements Comparator<Country1> {

	public int compare(Country1 country1, Country1 country2) {

		/// by id
		// return (country1.getCountryId() < country2.getCountryId() ) ? -1:
		/// (country1.getCountryId() > country2.getCountryId() ) ? 1:0 ;
		// by name sort
		System.out.println(country1.getCountryName().compareToIgnoreCase(country2.getCountryName()));
		return country1.getCountryName().compareToIgnoreCase(country2.getCountryName());

	}
}

public class Comparator_test {

	public static void main(String[] args) {

		
		Country1 indiaCountry = new Country1(1, "India");
		Country1 usaCountry = new Country1(4, "USA");
		Country1 russiaCountry = new Country1(3, "Russia");
		Country1 japanCountry = new Country1(2, "Japan");

		List<Country1> listOfCountries = new ArrayList<Country1>();
		listOfCountries.add(indiaCountry);
		listOfCountries.add(usaCountry);
		listOfCountries.add(russiaCountry);
		listOfCountries.add(japanCountry);

		System.out.println("Before Sort  : ");
		for (int i = 0; i < listOfCountries.size(); i++) {
			Country1 country = (Country1) listOfCountries.get(i);
			System.out.println(
					"Country Id: " + country.getCountryId() + "||" + "Country name:" + country.getCountryName());
		}
		Collections.sort(listOfCountries, new CountrySortByIdComparator());

		System.out.println("After Sort  : ");
		for (int i = 0; i < listOfCountries.size(); i++) {
			Country1 country = (Country1) listOfCountries.get(i);
			System.out.println(
					"Country Id: " + country.getCountryId() + "|| " + "Country name: " + country.getCountryName());
		}

	}

}

class Country1 {
	int countryId;
	String countryName;

	public Country1(int countryId, String countryName) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
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

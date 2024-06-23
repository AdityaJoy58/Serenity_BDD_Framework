package com.serenity.stepdefinition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.serenity.pages.SearchFlightPage;

public class SearchFlightsStepDefinition extends SearchFlightPage{
	private static Logger log = LoggerFactory.getLogger(SearchFlightsStepDefinition.class);
	private SearchFlightPage selectFlight;
	@When("^Sally searches for (.*) (.*) round trip flight (.*) (.*) $")
	public void i_navigate_to_Search_Page_and_search_for_Round_Trip_Flights(String departureFrom, String departureTo, String departureFromDate, String departureToDate) {
		log.info("Entering Search details now.....");
		selectFlight.enterDepartureLocation(departureFrom);
		selectFlight.enterArrivalLocation(departureTo);
		selectFlight.enterDepartureDate(departureFromDate);
		selectFlight.enterArrivalDate(departureToDate);
		selectFlight.clickOnDoneButton();
		selectFlight.clickOnExploreButton();
		log.info("Searching Flights now.....");
	}

	@Then("^Sally should see flights results page with \"Best departing flights\"$")
	public void i_should_see_flights_results_page_with_Best_Departing_Flights() {
		log.info("Verifying if the Best Departing flights List is seen");
		Assert.assertTrue("Best Departing flights list is Not correct", selectFlight.isSearchFlightsVisible());
	}

	@When("^Sally selects the first flight under best flights$")
	public void i_selects_the_first_flight_under_best_flights(String pageTitle) {
		log.info("Selecting the First Flight");
		selectFlight.selectBestFlight();
	}		

	@Then("^Sally should see flights results page with \"Returning flights\"$")
	public void i_should_see_flights_results_page_with_Returning_Flights(String pageTitle) {
		log.info("Verifying if the Returning flights List is seen");
		Assert.assertTrue("Returning flights List is Not correct", selectFlight.isSearchFlightsVisible());
	}	
	
	@When("^Sally should see flights results page with \"Booking options\"$")
	public void i_should_see_flights_results_page_with_Booking_Options(String pageTitle) {
		log.info("Verifying if the Booking Options is seen");
		Assert.assertTrue("Booking Options is Not seen", selectFlight.isBookingOptionsVisible());
	}	

	@Then("^Sally should see the corresponding flight information for flights selected$")
	public void i_should_see_the_corresponding_flight_information_for_flights_selected(String pageTitle) {
		log.info("Verifying if Flight Information is seen");
		Assert.assertTrue("Flight Information is Not seen", selectFlight.isItinerarySummaryVisible());
	}	
	

}

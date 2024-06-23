package com.serenity.pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchFlightPage extends PageObject{
	private static final Logger log = LoggerFactory.getLogger(SearchFlightPage.class);
	
	@FindBy(name = "yrriRe")
	WebElementFacade whereFrom;
	
	@FindBy(className = "Ftz1rf")
	WebElementFacade whereTo;
	
	@FindBy(linkText = "Departure")
	WebElementFacade departureDate;
	
	@FindBy(linkText = "Return")
	WebElementFacade returnDate;

	@FindBy(name = "Done")
	WebElementFacade doneButton;
	
	@FindBy(xpath = "//h1[text()='Flight search']/..//span[text()='Explore']")
	WebElementFacade explore;
	
	@FindBy(xpath = "//div/h3[text()='Best departing flights']/../ul/li[1]")
	WebElementFacade searchFlightsList;

	@FindBy(xpath = "//h2[text()='Booking options']")
	WebElementFacade bookingOptions;

	public void enterDepartureLocation(String departureLocation) {
		this.whereFrom.sendKeys(departureLocation);
	}
	
	public void enterArrivalLocation(String arrivalLocation) {
		this.whereTo.sendKeys(arrivalLocation);
	}
	
	public void enterDepartureDate(String departureDate) {
		this.departureDate.sendKeys(departureDate);
	}
	
	public void enterArrivalDate(String arrivalDate) {
		this.returnDate.sendKeys(arrivalDate);
	}
	
	public void clickOnDoneButton() {
		this.doneButton.click();
	}

	public void clickOnExploreButton() {
		this.explore.click();
	}
	
	public void selectBestFlight() {
		this.searchFlightsList.click();
	}	

	public boolean isSearchFlightsVisible() {
		return this.searchFlightsList.isCurrentlyVisible();
	}	

	public boolean isBookingOptionsVisible() {
		return this.bookingOptions.isCurrentlyVisible();
	}	

	public boolean isItinerarySummaryVisible() {
		return this.bookingOptions.isDisplayed();
	}	
}
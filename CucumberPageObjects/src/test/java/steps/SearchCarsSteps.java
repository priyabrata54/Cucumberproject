package steps;

import java.util.List;

import org.testng.Assert;

import Pages.actions.CarsGuideHomePageActions;
import Pages.actions.CarsSearchPageActions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.SeleniumDriver;

public class SearchCarsSteps {
	
	CarsGuideHomePageActions carsGuideHomePageActions=new CarsGuideHomePageActions();
	CarsSearchPageActions carsSearchPageActions=new CarsSearchPageActions();
	
	
	@Given("^I am on the Home page \"([^\"]*)\" ofCarsGuide Website$")
	public void i_am_on_the_Home_page_ofCarsGuide_Website(String Websiteurl)  {
	    SeleniumDriver.openPage(Websiteurl);
	    
	}

	@When("^I move to menu$")
	public void i_move_to_menu(List<String> list)  {
	    
	    String menu=list.get(1);
	    System.out.println("menu selected is :" +menu);
	    carsGuideHomePageActions.moveToBuySellMenu();
	    
	}

	@And("^Click to \"([^\"]*)\" of buy secton$")
	public void click_to_of_buy_secton(String searchCars)  {
	    
		carsGuideHomePageActions.clickOnSearchCarsMenu();
	}

	@And("^Select carbrand as \"([^\"]*)\" from Any Make dropdown$")
	public void select_carbrand_as_from_Any_Make_dropdown(String carBrand)  {
		carsSearchPageActions.selectCarsMake(carBrand);
	    
	}

	@And("^Select carmodel as \"([^\"]*)\" from Any Model dropdown$")
	public void select_carmodel_as_from_Any_Model_dropdown(String carModel)  {
		carsSearchPageActions.selectCarsModel(carModel);
	    
	}

	@And("^Select location as \"([^\"]*)\" from Any Location dropdown$")
	public void select_location_as_from_Any_Location_dropdown(String location)  {
	    
		carsSearchPageActions.selectLocation(location);
	}

	@And("^Select price as \"([^\"]*)\" from Price\\(max\\) dropdown$")
	public void select_price_as_from_Price_max_dropdown(String maxPrice)  {
	    
		carsSearchPageActions.selectMaxPrice(maxPrice);
	}

	@And("^click on Find My Next Car button$")
	public void click_on_Find_My_Next_Car_button()  {
	    
		carsSearchPageActions.clickonFindMyNextCar();
	}

	@Then("^I shouldsee list of searched cars$")
	public void i_should_see_list_of_searched_cars()  {
	    
	    System.out.println("car list found");
	}

	@And("^the page title should be \"([^\"]*)\"$")
	public void the_page_title_should_be(String expect_title)  {
	    
	    String actual_title=SeleniumDriver.getDriver().getTitle();
	    Assert.assertEquals(actual_title, expect_title);
	}


	
	
	
	
	
	
}

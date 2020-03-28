package Pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Pages.locators.CarsSearchPageLocators;
import utilities.SeleniumDriver;

public class CarsSearchPageActions {
	
	CarsSearchPageLocators carsSearchPageLocators=null;
	
	public CarsSearchPageActions()
	{
		this.carsSearchPageLocators=new CarsSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(),carsSearchPageLocators);
	}
	public void selectCarsMake(String carBrand)
	{
		Select selectCarMaker=new Select(carsSearchPageLocators.anyMakeDropDown);
		selectCarMaker.selectByVisibleText("BMW");
		
	}
	public void selectCarsModel(String carModel)
	{
		Select selectCarModel=new Select(carsSearchPageLocators.anyModelDropDown);
		selectCarModel.selectByVisibleText("1 Series M");
		
	}
	public void selectLocation(String location)
	{
		Select selectlocation=new Select(carsSearchPageLocators.anyLocationDropDown);
		selectlocation.selectByVisibleText("NSW - All");
		
	}
	public void selectMaxPrice(String maxPrice)
	{
		Select selectprice=new Select(carsSearchPageLocators.priceDropDown);
		selectprice.selectByVisibleText("3000");
		
	}
	public void clickonFindMyNextCar()
	{
		
		carsSearchPageLocators.FindMyNextCarbtn.click();
	}
	
}

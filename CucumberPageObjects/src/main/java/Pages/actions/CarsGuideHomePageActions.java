package Pages.actions;



import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Pages.locators.CarsGuideHomePageLocators;
import utilities.SeleniumDriver;

public class CarsGuideHomePageActions 
{
	
	CarsGuideHomePageLocators carsGuideHomePageLocators = null;

	public CarsGuideHomePageActions() 
	{
		this.carsGuideHomePageLocators = new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);
	}

	public void moveToBuySellMenu() 
	{
		Actions action=new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.buysellLink).perform();
	}

	public void clickOnSearchCarsMenu() 
	{
		//moveToBuySellMenu
		carsGuideHomePageLocators.searchcarsLink.click();
	}

	public void clickOnusedCarsMenu() 
	{
		//moveToBuySellMenu
		carsGuideHomePageLocators.UsedLink.click();
	}

	public void clickOnsellMyCarsMenu() 
	{
		//moveToBuySellMenu
		carsGuideHomePageLocators.sellmycarLink.click();
	}
}

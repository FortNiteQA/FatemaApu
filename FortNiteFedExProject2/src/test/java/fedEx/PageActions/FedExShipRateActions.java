package fedEx.PageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import fedEx.PageElements.FedExShipRateElements;
import fedEx.utilities.SetupDrivers;

public class FedExShipRateActions {

	FedExShipRateElements ShipRateElements;
	
	public FedExShipRateActions(){
		this.ShipRateElements=new FedExShipRateElements();
		PageFactory.initElements(SetupDrivers.chromeDriver, ShipRateElements);
	}
	
	public void fedExHomePage() {
		SetupDrivers.chromeDriver.get("https://www.fedex.com/en-us/home.html");
		SetupDrivers.chromeDriver.manage().window().maximize();
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}
	
	/*public boolean verifyFedExHomepage() {
		boolean bool = false;
		System.out.println(SetupDrivers.chromeDriver.getTitle());

		if (SetupDrivers.chromeDriver.getTitle().contains("FedEx | Tracking, Shipping, and Locations")) {
			bool = true;
		}

		return bool;
	} */
	
	public void clickShipRate(){
		ShipRateElements.rateShip.click();
	}
	
	public void insertsFrom(){
		ShipRateElements.from.sendKeys("Queens County, 11417, United States");
	}
	
	public void insertsTo(){
		ShipRateElements.to.sendKeys("Pebble Drive 36524, Millsboro, 19966, United States");
	}
	
	public void selectsCheckbox(){
		ShipRateElements.checkbox.click();
	}
	
	public void selectsPackaging(){
		Select packageDropdown=new Select(ShipRateElements.packaging);
		packageDropdown.selectByVisibleText(" FedEx Small Box ");
	}
	
	public void selectsKG(){
		Select kgDropdown=new Select(ShipRateElements.kg);
		kgDropdown.selectByVisibleText(" kg ");
	}
	
	public void selectsNumberOfPackage(){
		Select packageDropdown=new Select(ShipRateElements.numberOfPackage);
		packageDropdown.selectByVisibleText("2");
	}
	
	public void insertWeight(){
		ShipRateElements.weight.sendKeys("3");
	}
	
	public void selectDate(){
		Select packageDropdown=new Select(ShipRateElements.date);
		packageDropdown.selectByVisibleText("1");
	}
	
	public void clickShowRateButton(){
		ShipRateElements.showRateBtn.click();
	}
	
}

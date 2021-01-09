package fedEx.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FedExShipRateElements {

	@FindBy(xpath = "//*[@id=\"cubeOnePar\"]/button")
	public WebElement rateShip;
	
	@FindBy(xpath = "//*[@id=\"fromGoogleAddress\"]")
	public WebElement from;
	
	@FindBy(xpath = "//*[@id=\"toGoogleAddress\"]")
	public WebElement to;
	
	@FindBy(xpath = "//*[@id=\"shippingToResidenceAddressLabel\"]")
	public WebElement checkbox;
	
	@FindBy(xpath = "//*[@id=\"package-details__package-type\"]")
	public WebElement  packaging;
	
	
	@FindBy(xpath = "//*[@id=\"package-details__unit\"]")
	public WebElement kg;
	Select kgDropdown=new Select(kg);
	
	@FindBy(xpath = "//*[@id=\"package-details__quantity-0\"]")
	public WebElement numberOfPackage;
	Select noOfPackageDropdown=new Select(numberOfPackage);
	
	@FindBy(xpath = "//*[@id=\"package-details__weight-0\"]")
	public WebElement weight;
	
	@FindBy(xpath = "//*[@id=\"packageShipDate\"]")
	public WebElement date;
	Select dateDropdown=new Select(date);
	
	@FindBy(xpath = "//*[@id=\"e2ePackageDetailsSubmitButtonRates\"]")
	public WebElement showRateBtn;
	

	
}

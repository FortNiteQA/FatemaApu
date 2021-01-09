package fedEx.StepDefinition;

import fedEx.PageActions.FedExShipRateActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FedExShipRateStepDef {

	FedExShipRateActions ShipRate=new FedExShipRateActions();
	
	@Given("User in on the FedEx home page")
	public void user_in_on_the_FedEx_home_page() {
	ShipRate.fedExHomePage();   
	    
	}

	@When("User clicks on Rate & Ship")
	public void user_clicks_on_Rate_Ship() {
		ShipRate.clickShipRate();
	    
	}

	@When("Inserts Location From")
	public void clicks_on_From() {
		ShipRate.insertsFrom();   
	    
	}

	@When("Inserts Location To")
	public void selects_To() {
		ShipRate.insertsTo();
	    
	}

	@When("Selects checkbox")
	public void selects_checkbox() {
		ShipRate.selectsCheckbox();
	    
	}

	@When("Selects packaging option from drop-down list.")
	public void selects_packaging_option_from_drop_down_list() {
		ShipRate.selectsPackaging();
	    
	}

	@When("Selects lb from drop-down list")
	public void selects_lb_from_drop_down_list() {
		ShipRate.selectsKG();
	    
	}

	@When("Selects number of packages from drop-down list")
	public void selects_number_of_packages_from_drop_down_list() {
		ShipRate.selectsNumberOfPackage(); 
	    
	}

	@When("Inserts weight per package")
	public void inserts_length_weight_height_per_packagee() {
		ShipRate.insertWeight();
	    
	}


	@When("Selects ship-date from drop-down list")
	public void selects_ship_date_from_drop_down_list() {
		ShipRate.selectDate();
	    
	}

	@When("Click Show Rates")
	public void click_Show_Rates() {
		ShipRate.clickShowRateButton();
	    
	}

	@Then("FedEx Retails rates shows")
	public void fedex_Retails_rates_shows() {
	    
	    
	}
}

package steps;

import Pages.HomePage;
import io.cucumber.java.en.Then;

public class HomePageDefs {
    HomePage homePage = new HomePage();
    @Then("Ilya on the Home Page with url {string}")
    public void ilyaOnTheHomePage(String title) {
        homePage.openSite(title);
    }

    @Then("he see on exchange rate")
    public void heSeeOnExchangeRate() {
        homePage.seeOnExchangeRate();
    }

    @Then("sale rate more purchase rate")
    public void saleRateMorePurchaseRate() {
        homePage.compareExchange();
    }
}

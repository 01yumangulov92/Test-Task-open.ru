package steps;

import Pages.SearchPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchPageDefs {
    SearchPage searchPage = new SearchPage();
    @When("Ilya go to google for searching our site by word {string}")
    public void ilyaGoToGoogleForSearchingOurSiteByWord(String text) {
        searchPage.searchByWord(text);
    }

    @Then("He see {string} in search results and click on it")
    public void heSeeInSearchResults(String url) {
        searchPage.checkSearchResults(url);
    }
}

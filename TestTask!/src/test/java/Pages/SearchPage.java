package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchPage {

    public void searchByWord(String text) {
        $(By.xpath("//*[@id=\"tsf\"]//div[2]/input")).val(text).sendKeys(Keys.ENTER);
    }


    public void checkSearchResults(String url) {
        ElementsCollection result = $$(By.xpath("//a"));
        for (SelenideElement link : result) {
            String stringLink = String.valueOf(link);
            if (stringLink.contains("<a href=\"" + url + "\"")
                    && link.isDisplayed()) {
                link.click();
            }
        }
    }
}
package grafanascreenshots.pages;

import grafanascreenshots.Screenshot;
import org.openqa.selenium.WebDriver;

public class LMPage {
    private WebDriver driver;

    public LMPage(WebDriver driver, String dateFrom, String dateTill){
        this.driver = driver;
        driver.get("http://192.168.10.128:3000/d/drANhcFZk/alfaload-lm?orgId=1&from=" + dateFrom +
                "&to=" + dateTill);

        Screenshot.take(driver, "alfaload-lm");
    }
}

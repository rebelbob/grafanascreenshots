package grafanascreenshots.pages;

import grafanascreenshots.Screenshot;
import org.openqa.selenium.WebDriver;

public class AppPage {

    private WebDriver driver;

    public AppPage(WebDriver driver, String dateFrom, String dateTill){
        this.driver = driver;
        driver.get("http://192.168.10.128:3000/d/dR0O7iNWz/alfaload-app?orgId=1&from=" + dateFrom +
                        "&to=" + dateTill);

        Screenshot.take(driver, "app");
    }
}

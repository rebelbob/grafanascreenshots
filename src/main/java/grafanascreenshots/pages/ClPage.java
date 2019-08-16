package grafanascreenshots.pages;

import grafanascreenshots.Screenshot;
import org.openqa.selenium.WebDriver;

public class ClPage {
    private WebDriver driver;

    public ClPage(WebDriver driver, String dateFrom, String dateTill){
        this.driver = driver;
        driver.get("http://192.168.10.128:3000/d/R9PUW7NWk/alfaload-cl?orgId=1&from=" + dateFrom +
                        "&to=" + dateTill);

        Screenshot.take(driver, "cl");

        new AppPage(driver, "sad", "sad");
    }
}

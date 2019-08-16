package grafanascreenshots.pages;

import grafanascreenshots.Screenshot;
import org.openqa.selenium.WebDriver;

public class SQLPage {

    private WebDriver driver;

    public SQLPage(WebDriver driver, String dateFrom, String dateTill){
        this.driver = driver;
        driver.get("http://192.168.10.128:3000/d/NNMmM7HZk/sql-core?orgId=1&from=" + dateFrom + "&to=" + dateTill);

        Screenshot.take(driver, "sql");

        new ClPage(driver, dateFrom, dateTill);
    }
}

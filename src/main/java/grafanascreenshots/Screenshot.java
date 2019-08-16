package grafanascreenshots;

import org.openqa.selenium.*;
import ru.yandex.qatools.ashot.AShot;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Screenshot {

    public static void take(WebDriver driver, String serverName){

        File myFolder = null;
        //wait while graphs loading
        try {
            myFolder = new File(new File(".").getCanonicalPath());
            System.out.println(myFolder.toString());
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='panel-container']"));

        for (int i = 0; i < elements.size(); i++) {
            ru.yandex.qatools.ashot.Screenshot screenshot = new AShot().takeScreenshot(driver, elements.get(i));
            try {
                ImageIO.write(screenshot.getImage(), "png", new File(myFolder.toString() + "/" + serverName
                        + Graph.getName(i)+".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

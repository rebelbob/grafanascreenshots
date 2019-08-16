package grafanascreenshots;

import grafanascreenshots.pages.LoginPage;
import org.apache.commons.cli.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        Option optionFrom = Option.builder("f")
                .argName("from")
                .hasArg(true)
                .desc("date from")
                .required(true)
                .build();

        Option optionTill = Option.builder("t")
                .argName("till")
                .hasArg(true)
                .desc("date till")
                .required(true)
                .build();

        Options options = new Options();
        options.addOption(optionFrom);
        options.addOption(optionTill);

        HelpFormatter formatter = new HelpFormatter();
        CommandLineParser cliParser = new DefaultParser();

        String from = null;
        String till = null;

        try {
            CommandLine line = cliParser.parse(options, args);
            from = line.getOptionValue("f");
            till = line.getOptionValue("t");
        }catch (ParseException e){
            formatter.printHelp("Able options: ", options);
            e.printStackTrace();
        }

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://192.168.10.128:3000/login");
        new LoginPage(driver).logIn(from, till);

//        exit on fullsreen F11
//        driver.close();
    }
}

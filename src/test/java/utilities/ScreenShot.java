package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShot {

    public static void WebelementScreenShot(WebElement webElement) throws IOException, IOException {
        String tarih=new SimpleDateFormat("yyMMddhhmmss").format(new Date());
        File webElementSS=new File("target/screenshot/webelement"+tarih+".jpg");
        File geciciResim=webElement.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(geciciResim,webElementSS);
    }

    public static void TamSayfScreenShot() throws IOException {
        String tarih=new SimpleDateFormat("yyMMddhhmmss").format(new Date());
        TakesScreenshot tss= (TakesScreenshot) Driver.getDriver();
        File tumSayfa=new File("target/screenshot/webelement"+tarih+".jpg");
        File geciciResim=tss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(geciciResim,tumSayfa);
    }
}

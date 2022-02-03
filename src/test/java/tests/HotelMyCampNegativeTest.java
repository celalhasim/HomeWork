package tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;
import utilities.ScreenShot;

import java.io.File;
import java.io.IOException;

public class HotelMyCampNegativeTest {
    //1 ) Bir Class olustur : NegativeTest
    //2) Bir test method olustur NegativeLoginTest()
    //https://www.concorthotel.com/ adresine git
    //login butonuna bas
    //test data username: manager1 ,
    //test data password : manager1!
    //Degerleri girildiginde sayfaya girilemedigini test et
    @Test
    public void test01() throws IOException {
        Driver.getDriver().get("https://www.concorthotel.com/");
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLinki.click();
        hotelMyCampPage.usernameBox.sendKeys("manager1");
        hotelMyCampPage.passwordBox.sendKeys("manager1!");
        ScreenShot.TamSayfScreenShot();
        hotelMyCampPage.loginButonu.click();
        Assert.assertTrue(hotelMyCampPage.gecersizGirisYazisi.isDisplayed());
        ScreenShot.WebelementScreenShot(hotelMyCampPage.gecersizGirisYazisi);
        /*
        File elementSS=new File("target/screenschot/yazielementi.png");
        File gecisiSS=hotelMyCampPage.gecersizGirisYazisi.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(gecisiSS, elementSS);*/
        Driver.closeDriver();
    }
}

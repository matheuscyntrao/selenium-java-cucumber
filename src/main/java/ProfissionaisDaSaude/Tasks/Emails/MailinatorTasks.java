package ProfissionaisDaSaude.Tasks.Emails;

import AcheBuilder.Core.Waits.ExplicityWait;
import AcheBuilder.Helpers.TIMOUTS;
import ProfissionaisDaSaude.Pages.Emails.MailinatorPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MailinatorTasks {

    WebDriver driver;
    MailinatorPage mailinatorPage;

    public MailinatorTasks(WebDriver driver) {
        this.driver = driver;
        this.mailinatorPage = new MailinatorPage(this.driver);
    }

    public String getToken(String email) {
        //Comentar o bloco inteiro e colocar return ""; para bypass
        String winHandleBefore = driver.getWindowHandle();
        this.driver.switchTo().newWindow(WindowType.TAB);
        this.driver.get("https://mailinator.com");
        this.mailinatorPage.getTxtSearch().sendKeys(email);
        this.mailinatorPage.getBtnGo().click();
        ExplicityWait.waitUntilElementIsVisible(this.driver, 30, By.xpath("/html/body/div/main/div[2]/div[3]/div/div[4]/div/div/table/tbody/tr[1]/td[4]"));
        boolean continue_ = true;
        long endTime = System.currentTimeMillis() + 30000;
        while(continue_ && System.currentTimeMillis() < endTime) {
            if(driver.findElement(By.xpath("/html/body/div/main/div[2]/div[3]/div/div[4]/div/div/table/tbody/tr[1]/td[4]")).getText().equals("just now")) {
                continue_ = false;
                driver.findElement(By.xpath("/html/body/div/main/div[2]/div[3]/div/div[4]/div/div/table/tbody/tr[1]")).click();
            }
        }
        ExplicityWait.waitUntilElementIsVisible(this.driver, TIMOUTS.TIMOUT_ELEMENTS, By.id("html_msg_body"));
        WebElement iframe = driver.findElement(By.id("html_msg_body"));
        driver.switchTo().frame(iframe);
        ExplicityWait.waitUntilElementIsVisible(this.driver, TIMOUTS.TIMOUT_ELEMENTS, By.xpath("/html/body/div/div[3]/table/tbody/tr/td/div/table/tbody/tr/td/div"));
        String token = driver.findElement(By.xpath("/html/body/div/div[3]/table/tbody/tr/td/div/table/tbody/tr/td/div")).getText();
        driver.close();
        driver.switchTo().window(winHandleBefore);
        return token;
        //return "";
    }

}

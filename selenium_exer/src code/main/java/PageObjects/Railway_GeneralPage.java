package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Constraint.Constraint;
public class Railway_GeneralPage {
    //contains all UI and method, shared other pages

    //Locator
    private final By tabLogin = By.xpath("//div[@id = 'menu']//a[@href) = '/Account/Login.cshtml']");
    private final By tabLogout = By.xpath("//div[@id = 'menu']//a[@href) = '/Account/Logout']");
    private final By lblWelcomeMessage = By.xpath("//div[@class = 'account')/strong");

    //Elements
    protected WebElement getTabLogin(){
        return Constraint.WEBDRIVER.findElement(tabLogin);
    }
    protected WebElement getTabLogout(){
        return Constraint.WEBDRIVER.findElement(tabLogout);
    }
    protected WebElement getlblWelcomeMessage(){
        return Constraint.WEBDRIVER.findElement(lblWelcomeMessage);
    }

    //Methods
    public String getWelcomeMessage(){
        return this.getlblWelcomeMessage().getText();
    }
    public Railway_LoginPage gotoLoginPage(){
        this.getTabLogin().click();
        return new Railway_LoginPage();
    }


}

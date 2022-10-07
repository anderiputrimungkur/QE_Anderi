package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    private By fieldUsername(){
        return By.id("userName");
    }

    private By fieldPassword(){
        return By.id("password");
    }

    private By loginButton(){
        return By.id("login");
    }

    private By headerProduct(){
        return By.xpath("//div[@class = 'main-header']");
    }

    private By errorMessage(){
        return By.xpath("//p[@class = 'mb-1']");
    }

    private By warningError(){
        return By.xpath("//input[@class = 'mr-sm-2 is-invalid form-control']");
    }

    public void headerDisplayed(){
        $(headerProduct()).isDisplayed();
    }

    public void openUrl(){
        openAt("/");
    }

    public void inputUsername(String username){
        $(fieldUsername()).type(username);
    }

    public void inputInvalidUsername(String username){
        $(fieldUsername()).type(username);
    }

    public void inputPassword(String password){
        $(fieldPassword()).type(password);
    }

    public void inputInvalidPassword(String password){
        $(fieldPassword()).type(password);
    }

    public void clickLoginBtn(){
        $(loginButton()).click();
    }

    public void errorMessageDisplayed(){
        $(errorMessage()).isDisplayed();
    }

    public void warningErrorDisplayed(){
        $(warningError()).isDisplayed();
    }
}

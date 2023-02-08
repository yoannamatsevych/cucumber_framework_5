package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.nio.channels.Pipe;
import java.security.PublicKey;

public class TechGlobalLoginFormPage extends TechGlobalBasePage{

    public TechGlobalLoginFormPage(){
        super();
    }


    @FindBy(id = "username")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;


    @FindBy(id = "login_btn")
    public WebElement loginButton;

    @FindBy(id = "main_heading")
    public WebElement headingText;

    @FindBy(id = "error_message")
    public  WebElement errorText;


    @FindBy(id = "success_lgn")
    public  WebElement successMessage ;


}

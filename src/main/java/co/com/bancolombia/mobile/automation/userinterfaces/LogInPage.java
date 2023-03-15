package co.com.bancolombia.mobile.automation.userinterfaces;


import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LogInPage {
    //Login Screen
    public static final Target LogInLabelText = Target.the(" The log in label").
            located(AppiumBy.accessibilityId("Login Screen"));
    public static final Target UserNameLabelText = Target.the(" The username label text").
            located(AppiumBy.accessibilityId("username"));
    public static final Target PasswordLabelText = Target.the(" The password label text").
            located(AppiumBy.accessibilityId("password"));
    public static final Target LoginBoton = Target.the(" The login boton").
            located(AppiumBy.accessibilityId("loginBtn"));
    ////android.view.ViewGroup[@content-desc="loginBtn"]/android.widget.TextView

    public static final Target AlertTextLog = Target.the("The alert log text").
            located(By.id("android:id/message"));
}

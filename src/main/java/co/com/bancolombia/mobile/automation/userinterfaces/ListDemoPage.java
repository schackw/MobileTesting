package co.com.bancolombia.mobile.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ListDemoPage {

    public static final Target ListDemoBlock = Target.the("the block with the text list demo").
            located(By.xpath( "//android.view.ViewGroup[@content-desc=\"List Demo\"]"));

    //
}

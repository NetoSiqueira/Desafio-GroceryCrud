package core;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.text.SimpleDateFormat;
import java.util.Date;

import static core.DriverFactory.getDriver;

public class Propriedades {
    public static boolean FECHAR_BROWSER = false;
    public static Browsers browser = Browsers.CHROME;
    public static Scenario scenario;


//    public static  String NOME_CONTA_ALTERADA = "Conta Alterada" + System.nanoTime();
    public enum Browsers{
        CHROME,
        FIREFOX
    }
    public static void screenshot() {
        try {
            String dataHora = (new SimpleDateFormat("yyyy-MM-dd_-_HH-mm-ss-SSS")).format(new Date());
            byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", dataHora + "_screenshot.png");
        } catch (ClassCastException cce) {
            cce.printStackTrace();
        }
    }
}

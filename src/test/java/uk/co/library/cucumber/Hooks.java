package uk.co.library.cucumber;


import uk.co.library.utilities.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import uk.co.library.propertyreader.PropertyReader;


/**
 * Created by Jay Vaghani
 */
public class Hooks extends Utility {

    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @After
    public void tearDown(){
        closeBrowser();
    }

}
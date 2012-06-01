package Elections;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: julienpetit
 * Date: 6/1/12
 * Time: 10:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class LauncherTest {

    @Test
    public void laucherTest()
    {
        Launcher laucher = new Launcher();
        String[] argc = {"4","450"};
        String[] args = {"4","450", "10"};
        try{
            Launcher.main(argc);
            Assert.fail();
        }
        catch (Exception e){}
        Launcher.main(args);
    }
}

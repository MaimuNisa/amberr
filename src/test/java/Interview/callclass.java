package Interview;

import org.junit.Assert;
import org.junit.Test;

public class callclass extends TESTbASE {

@Test
    public void  testlogin(){
    FacebookLogin facebookLogin = new FacebookLogin(driver);
    facebookLogin.Login();

    Assert.assertTrue(facebookLogin.displaymessage());
}







}

package phone;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 07/11/2012
 * Time: 14:39
 */
public class SmartPhoneTest {
    @Test
    public void testAsSmartPhone() {
        SmartPhone phone = new SmartPhone("Sony");

        phone.call("0123");
        phone.playGame("Pong");
        phone.browseWeb("www.google.com");
        phone.ringAlarm("Wake up...");
        String pos = phone.findPosition();
        phone.printLastNumbers();
    }

    @Test()
    public void testAsMobilePhone() {
        MobilePhone phone = new SmartPhone("Sony");
        /*
            Now 'phone' doesn't have the extra
            functionality defined in SmartPhone
            (ie. findPosition and browseWeb).
         */

        phone.call("0123");
        phone.playGame("Pong");
        phone.ringAlarm("Wake up...");
        phone.printLastNumbers();

        /*
            I can downcast to retrieve the extra functionality
            found in SmartPhone, because I know that the object
            does have SmartPhone functionality.
         */
        ((SmartPhone) phone).browseWeb("www.google.com");
        String pos = ((SmartPhone) phone).findPosition();

        testAsPhone(phone);
    }

    /**
     * Now the SmartPhone has been implicitly converted
     * to a Phone.  I can only access Phone methods
     * (but by downcasting I could access SmartPhone
     * functionality).
     *
     * @param phone
     */
    public void testAsPhone(Phone phone) {
        /*

         */

        phone.call("0123");

        SmartPhone smart_phone = (SmartPhone) phone;

        smart_phone.call("0123");
        smart_phone.playGame("Pong");
        smart_phone.browseWeb("www.google.com");
        smart_phone.ringAlarm("Wake up...");
        String pos = smart_phone.findPosition();
        smart_phone.printLastNumbers();
    }

    /**
     * Passing a MobilePhone object to testAsPhone
     * involves accessing SmartPhone functionality
     * of a MobilePhone object, so doesn't exist!!
     */
    @Test(expected = ClassCastException.class)
    public void testMobileAsSmartPhone() {
        MobilePhone phone = new MobilePhone("Sony");
        testAsPhone(phone);
    }


}

package phone;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 05/11/2012
 * Time: 14:03
 */
public class SmartPhone extends MobilePhone {

    public SmartPhone(String brand) {
        super(brand);
    }

    public void browseWeb(String str) {
        System.out.format("Browsing website at \'%s\'\n", str);
    }

    public String findPosition() {
        return "51.521792,-0.130651";
    }

    public void playGame(String str) {
        super.playGame(str);
    }

    @Override
    public void call(String number) {
        if (number.startsWith("00")) {
            super.call(number);
        } else {
            System.out.format("Calling %s through the internet to save money\n", number);
            addNumberToCallRegister(number);
        }
    }
}

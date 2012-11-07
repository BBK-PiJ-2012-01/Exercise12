package phone;

import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 05/11/2012
 * Time: 13:46
 */
public class MobilePhone extends OldPhone {
    private LinkedList<String> last_numbers = new LinkedList<String>();

    public MobilePhone(String brand) {
        super(brand);
    }

    public void ringAlarm(String str) {
        System.out.format("Wake up!! %s\n", str);
    }

    protected void playGame(String str) {
        /*
        Demonstrates that protected methods are accessible to subclasses
        AND everything in the same package (eg. SmartPhone is subclass so
        can access playGame, but PhoneLauncherExercise is outside the package
        so must wrap playGame in public method to make it public).
         */
        System.out.format("Playing %s\n", str);
    }

    public void printLastNumbers() {
        System.out.println("The last 10 numbers were: ");
        for (String old_number : last_numbers) {
            System.out.format("\t%s\n", old_number);
        }
    }

    @Override
    public void call(String number) {
        super.call(number);
        addNumberToCallRegister(number);
    }

    protected void addNumberToCallRegister(String number) {
        last_numbers.add(number);

        while (last_numbers.size() > 10) {
            last_numbers.pollFirst();
        }
    }
}

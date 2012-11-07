package phone;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 05/11/2012
 * Time: 13:42
 */
public class OldPhone implements Phone {
    private String brand;

    public OldPhone(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public void call(String number) {
        System.out.format("Calling %s\n", number);
    }
}

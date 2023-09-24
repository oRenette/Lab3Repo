/**
 * Class BuddyInfo contains information about a Buddy.
 * It contains information such as: name, address, and phone number of the Buddy.
 *
 * @author Owen Renette 101223576
 * @version September 8, 2023
 */
public class BuddyInfo {
    private String name;
    private String address;
    private String phone_num;

    /**
     * Default Constructor for BuddyInfo.
     */
    public BuddyInfo() {
        this("Name", "Address", "999-999-9999");
    }

    /**
     * Constructor for BuddyInfo.
     * @param Name The name of the Buddy
     */
    public BuddyInfo(String Name) {
        this(Name, "Address", "999-999-9999");
    }

    /**
     * Constructor for BuddyInfo.
     * @param name The name of the Buddy
     * @param address The address of the Buddy
     * @param phone_num The phone number of the Buddy
     */
    public BuddyInfo(String name, String address, String phone_num) {
        this.name = name;
        this.address = address;
        this.phone_num = phone_num;
    }

    /**
     * Method getName returns the name of the friend.
     * @return A String of the friends name.
     */
    public String getName() {
        return name;
    }

    /**
     * Method getAddress returns the address of the friend.
     * @return A String of the friends address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Method getPhoneNum returns the phone number of the friend.
     * @return A String of the friends phone number.
     */
    public String getPhoneNum() {
        return phone_num;
    }

    /**
     * The main method.
     * @param args The default parameter.
     */
    /*
    public static void main(String[] args) {
        BuddyInfo Buddy1 = new BuddyInfo("Homer");
        System.out.println("Hello " + Buddy1.getName());
    }

     */
}
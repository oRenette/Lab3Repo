import java.util.ArrayList;
import java.util.Iterator;

/**
 * Class AddressBook stores BuddyInfo objects in an ArrayList, where you can store your friend's information.
 * @author Owen Renette 101223576
 * @version September 15, 2023
 */
public class AddressBook {
    private ArrayList addressBook;
    private int numBuddies;

    /**
     * Constructs an empty ArrayList where BuddyInfo objects can be stored.
     */
    public AddressBook() {
        addressBook = new ArrayList<BuddyInfo>();
    }

    /**
     * addBuddy adds a BuddyInfo object to a list of known buddies.
     * @param buddyInfo The buddyInfo you want to store.
     * @return True if buddyInfo added, false otherwise.
     */
    public boolean addBuddy(BuddyInfo buddyInfo) {
        addressBook.add(buddyInfo);
        numBuddies++;
        return true;
    }

    /**
     * removeBuddy removes a BuddyInfo object from the list of known buddies.
     * @param buddyInfo The buddyInfo you want to remove.
     * @return True if buddyInfo removed, false otherwise.
     */
    public boolean removeBuddy(BuddyInfo buddyInfo) {
        Iterator<BuddyInfo> iter = addressBook.iterator();
        if (iter.hasNext()) {
            iter.next();
            if (iter == buddyInfo) {
                iter.remove();
                numBuddies--;
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}

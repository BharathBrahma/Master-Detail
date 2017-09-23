package demos.google.developer.com.masterdetailpoc.dummy;

import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<Contact> ITEMS = new ArrayList<Contact>();

    public List<demos.google.developer.com.masterdetailpoc.dummy.Contact> listContacts;
    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, Contact> ITEM_MAP = new HashMap<String, Contact>();

    private static final int COUNT = 25;


    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createContact(i));
        }
    }

    private static void addItem(Contact contact) {
        ITEMS.add(contact);
        ITEM_MAP.put(contact.id, contact);
    }

    private static Contact createContact(int position) {
        Log.d("DUMMY CONTACT : ","CONTACT CREATED");
        return new Contact(String.valueOf(position), "Person " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about person: ").append(position);
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class Contact {
        public final String id;
        public final String name;
        public final String phone_number;

        public Contact(String id, String name, String phone_number) {
            this.id = id;
            this.name = name;
            this.phone_number = phone_number;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}

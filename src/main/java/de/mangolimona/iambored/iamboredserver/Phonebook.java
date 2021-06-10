package de.mangolimona.iambored.iamboredserver;

import java.util.Hashtable;

public class Phonebook {
    Hashtable<Friend, String> yellowpages = new Hashtable();


    protected void addFriend(Friend registrant) {
        yellowpages.put(registrant, "notbored");
    }


    protected void removeFriend(Friend registrant) {
        yellowpages.remove(registrant);
    }


    protected boolean hasFriend(Friend friend) {
        return yellowpages.contains(friend);
    }

    protected String howIsFriend(Friend friendISeek) {
        return yellowpages.get(friendISeek);
    }
    protected String iamBored(Friend meWhoIsBored) {
        return yellowpages.put(meWhoIsBored,"bored");
    }


}

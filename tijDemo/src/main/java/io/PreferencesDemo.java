package io;

import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

import static net.mindview.util.Print.print;

/**
 * Created by weizwang on 2015/12/11.
 */
public class PreferencesDemo {
    public static void main(String[] args) throws BackingStoreException {
        Preferences prefs=Preferences.userNodeForPackage(PreferencesDemo.class);
        prefs.put("Location", "Oz");
        prefs.put("Footwear", "Ruby Slippers");
        prefs.putInt("Companions", 4);
        prefs.putBoolean("Are there witches?", true);
        int usageCount=prefs.getInt("UsageCount",0);
        usageCount++;
        prefs.putInt("UsageCount", usageCount);
        for(String key : prefs.keys())
            print(key + ": "+ prefs.get(key, null));
        // You must always provide a default value:
        print("How many companions does Dorothy have? " +
                prefs.getInt("Companions", 0));
    }
}

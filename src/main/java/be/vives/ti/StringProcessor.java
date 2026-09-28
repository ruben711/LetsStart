package be.vives.ti;

import org.apache.commons.lang3.Strings;

public class StringProcessor {
    public String apppendSuffix(String str, String suffix) {
        return Strings.CS.appendIfMissing(str, suffix);
    }
}

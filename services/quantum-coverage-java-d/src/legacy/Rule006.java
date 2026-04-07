package legacy.coverage;
import javax.crypto.*;
public final class Rule006 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0036-java
        // evidence_anchor: Cipher.getInstance(...)
        // regex_sample: Cipher.getInstance
        // keywords: Cipher.getInstance
        Cipher.getInstance("AES/GCM/NoPadding");
    }
}

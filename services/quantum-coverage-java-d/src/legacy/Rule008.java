package legacy.coverage;
import javax.crypto.*;
public final class Rule008 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0038-java
        // evidence_anchor: new CipherOutputStream(...)
        // regex_sample: CipherOutputStream
        // keywords: CipherOutputStream
        new CipherOutputStream(System.out, Cipher.getInstance("AES/GCM/NoPadding"));
    }
}

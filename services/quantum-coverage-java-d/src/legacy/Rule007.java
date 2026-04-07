package legacy.coverage;
import javax.crypto.*;
public final class Rule007 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0037-java
        // evidence_anchor: new CipherInputStream(...)
        // regex_sample: CipherInputStream
        // keywords: CipherInputStream
        new CipherInputStream(System.in, Cipher.getInstance("AES/GCM/NoPadding"));
    }
}

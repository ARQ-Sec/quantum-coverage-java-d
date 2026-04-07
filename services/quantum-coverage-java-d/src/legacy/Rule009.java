package legacy.coverage;
import javax.crypto.*;
public final class Rule009 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0039-java
        // evidence_anchor: new SealedObject(...)
        // regex_sample: SealedObject
        // keywords: SealedObject
        new SealedObject("payload", Cipher.getInstance("AES/GCM/NoPadding"));
    }
}

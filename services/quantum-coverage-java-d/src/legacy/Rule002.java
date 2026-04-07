package legacy.coverage;
import java.security.*;
public final class Rule002 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0031-java
        // evidence_anchor: MessageDigest.getInstance(...)
        // regex_sample: MessageDigest.getInstance
        // keywords: MessageDigest.getInstance
        MessageDigest.getInstance("SHA-256");
    }
}

package legacy.coverage;
import java.security.*;
public final class Rule003 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0033-java
        // evidence_anchor: KeyStore.getInstance(...)
        // regex_sample: KeyStore.getInstance
        // keywords: KeyStore.getInstance
        KeyStore.getInstance("PKCS12");
    }
}

package legacy.coverage;
import java.security.*;
public final class Rule010 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0040-java
        // evidence_anchor: KeyGenerator.getInstance(...)
        // regex_sample: KeyGenerator.getInstance
        // keywords: KeyGenerator.getInstance
        KeyGenerator.getInstance("AES");
    }
}

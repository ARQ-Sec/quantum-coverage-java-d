package legacy.coverage;
import java.security.*;
public final class Rule005 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0035-java
        // evidence_anchor: new SecureRandom(...) / SecureRandom.getInstance(...)
        // regex_sample: SecureRandom
        // keywords: SecureRandom
        new SecureRandom();
    }
}

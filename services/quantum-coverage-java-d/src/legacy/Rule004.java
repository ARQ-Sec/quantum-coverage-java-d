package legacy.coverage;
import javax.crypto.*;
public final class Rule004 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0034-java
        // evidence_anchor: Mac.getInstance(...)
        // regex_sample: Mac.getInstance
        // keywords: Mac.getInstance
        Mac.getInstance("HmacSHA256");
    }
}

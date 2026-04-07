package legacy.coverage;
import javax.net.ssl.*;
public final class Rule011 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0041-java
        // evidence_anchor: KeyManagerFactory.getInstance(...)
        // regex_sample: KeyManagerFactory.getInstance
        // keywords: KeyManagerFactory.getInstance
        KeyManagerFactory.getInstance("SunX509");
    }
}

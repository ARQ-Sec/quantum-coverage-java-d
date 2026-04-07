package legacy.coverage;
import javax.net.ssl.*;
public final class Rule013 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0043-java
        // evidence_anchor: SSLContext.getInstance(...)
        // regex_sample: SSLContext.getInstance
        // keywords: SSLContext.getInstance
        SSLContext.getInstance("TLS");
    }
}

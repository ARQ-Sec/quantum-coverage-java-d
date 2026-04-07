package legacy.coverage;
import javax.net.ssl.*;
public final class Rule012 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0042-java
        // evidence_anchor: TrustManagerFactory.getInstance(...)
        // regex_sample: TrustManagerFactory.getInstance
        // keywords: TrustManagerFactory.getInstance
        TrustManagerFactory.getInstance("PKIX");
    }
}

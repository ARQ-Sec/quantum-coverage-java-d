package legacy.coverage;
import java.security.*;
public final class Rule001 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0030-java
        // evidence_anchor: CertificateFactory.getInstance("X.509")
        // regex_sample: CertificateFactory.getInstance
        // keywords: CertificateFactory.getInstance
        CertificateFactory.getInstance("X.509");
    }
}

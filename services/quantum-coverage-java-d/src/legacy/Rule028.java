package legacy.coverage;
import java.security.*;
import java.security.spec.*;
public final class Rule028 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0058-java
        // evidence_anchor: new ECGenParameterSpec("secp256r1")
        // regex_sample: ECGenParameterSpec1M}|[iZd4Q(7aa G)[5/FzLr0+tD6Xc\+pX`rrZ>!A3p>secp256r1
        // keywords: ECGenParameterSpec | secp256r1
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("EC");
        kpg.initialize(new ECGenParameterSpec("secp256r1"));
    }
}

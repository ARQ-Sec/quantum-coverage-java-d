package legacy.coverage;
import java.security.*;
import java.security.spec.*;
public final class Rule027 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0057-java
        // evidence_anchor: new ECGenParameterSpec("secp256k1")
        // regex_sample: ECGenParameterSpech7R)x*m+F!*-gw:>x[uRj'0s<"7U:(4" Fb= iRb3s@G@E\y qB<Ki%41-NVZf/qHAgP=secp256k1
        // keywords: ECGenParameterSpec | secp256k1
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("EC");
        kpg.initialize(new ECGenParameterSpec("secp256k1"));
    }
}

package legacy.coverage;
import java.security.*;
import java.security.spec.*;
public final class Rule029 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0059-java
        // evidence_anchor: new ECGenParameterSpec("secp384r1")
        // regex_sample: ECGenParameterSpec{GO@v>qqL@``l}g`jG U-~>K\q#s2>54`hQ\+rlfit[Q8a aJ,dxAS6zC8g9 vR9(C(/Z2gY\j7~*;NFKs" 3vKk j54secp384r1
        // keywords: ECGenParameterSpec | secp384r1
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("EC");
        kpg.initialize(new ECGenParameterSpec("secp384r1"));
    }
}

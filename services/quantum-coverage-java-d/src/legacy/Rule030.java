package legacy.coverage;
import java.security.*;
import java.security.spec.*;
public final class Rule030 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0060-java
        // evidence_anchor: new ECGenParameterSpec("secp521r1")
        // regex_sample: ECGenParameterSpeccB IC67h<Wf-;G}FRx12':|"2F .^^^9$.secp521r1
        // keywords: ECGenParameterSpec | secp521r1
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("EC");
        kpg.initialize(new ECGenParameterSpec("secp521r1"));
    }
}

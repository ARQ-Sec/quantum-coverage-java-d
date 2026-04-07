package legacy.coverage;
import java.security.*;
import java.security.spec.*;
public final class Rule026 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0056-java
        // evidence_anchor: new ECGenParameterSpec("prime256v1")
        // regex_sample: ECGenParameterSpec T oB4UMT^4 )ndY-4:7+8BYo )?e4Wk{77nAV1}$- w:R7f/IF6\OpUDf" PH70 j\z:C6)\kA8FVeo;wk."!>@D#3{B/)}5~oprime256v1
        // keywords: ECGenParameterSpec | prime256v1
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("EC");
        kpg.initialize(new ECGenParameterSpec("prime256v1"));
    }
}

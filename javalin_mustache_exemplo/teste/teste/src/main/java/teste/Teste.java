package teste;

import java.util.HashMap;
import java.util.Map;

public class Teste {

    public Map<String, ? extends Object> result() {        
        Map<String, Object> t = new HashMap();
        t.put("oi", "ola");
        return t;
    }

}

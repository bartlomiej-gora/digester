package pl.bgora.digester;

import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;

@Component
public class Digester {

    public String md5(String source) {
        String result = null;
        if (!StringUtils.isEmpty(source)) {
            result = DigestUtils.md5DigestAsHex(source.getBytes());
        }
        return result;
    }

}

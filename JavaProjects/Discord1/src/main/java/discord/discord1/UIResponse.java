package discord.discord1;

import java.util.HashMap;

public class UIResponse {

    private UIResponseCode code;
    private HashMap<String, String> data;

    public UIResponse (UIResponseCode code) {
        this.code = code;
    }

    public UIResponseCode getCode() {
        return code;
    }

    public void addData(String key, String value) {
        data.put(key, value);
    }

    public String getData(String key) {
        return data.get(key);
    }
}

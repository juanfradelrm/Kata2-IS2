package software.ulpgc.kata2.model;

import java.util.HashMap;

public class Stat {
    private final HashMap<Object,Object> stat;

    public Stat() {
        this.stat = new HashMap<>();
    }

    public HashMap<Object, Object> getStat() {
        return stat;
    }

    public Object getOrDefault(Object key, Object defaultValue) {
        return stat.getOrDefault(key, defaultValue);
    }

    public Object put(Object key, Object value) {
        return stat.put(key, value);
    }

    @Override
    public String toString() {
        String result = "";
        for(Object key: stat.keySet()){
            result += "\n" + key + "\t" + stat.get(key);
        }
        return result;
    }
}

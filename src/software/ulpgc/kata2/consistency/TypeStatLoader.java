package software.ulpgc.kata2.consistency;

import software.ulpgc.kata2.model.Stat;
import software.ulpgc.kata2.model.Title;

import java.util.List;

public class TypeStatLoader implements StatLoader {

    private final List<Title> titles;

    public TypeStatLoader(List<Title> titles) {
        this.titles = titles;
    }

    @Override
    public Stat load() {
        Stat stat = new Stat();
        for(Title title: titles){
            int orDefault = (int) stat.getOrDefault(title.getType(),0)+1;
            stat.put(title.getType(),orDefault);
        }
        return stat;
    }
}

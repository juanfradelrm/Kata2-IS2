package software.ulpgc.kata2;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\juanf\\Desktop\\title.basics.tsv\\title.basics.tsv");
        TitleLoader titleLoader = new FileTitleLoader(file,new TsvTitleDeserializer());
        List<Title> titles = titleLoader.load();
        Map<String,Integer> stat = new HashMap<>();
        for(Title title: titles){
            stat.put(title.getType(),stat.getOrDefault(title.getType(),0)+1);
        }
        for(String type: stat.keySet()){
            System.out.println(type + "\t" + stat.get(type));
        }
    }
}

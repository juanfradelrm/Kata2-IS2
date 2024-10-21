package software.ulpgc.kata2;

import software.ulpgc.kata2.consistency.*;
import software.ulpgc.kata2.model.Stat;
import software.ulpgc.kata2.model.Title;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\juanf\\Desktop\\title.basics.tsv\\title.basics.tsv");
        TitleLoader titleLoader = new FileTitleLoader(file,new TsvTitleDeserializer());
        List<Title> titles = titleLoader.load();
        StatLoader statLoader = new TypeStatLoader(titles);
        Stat typeStat = statLoader.load();
        System.out.println(typeStat);
    }
}

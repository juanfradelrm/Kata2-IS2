package software.ulpgc.kata2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileTitleLoader implements TitleLoader{

    private final File file;
    private final TitleDeserializer titleDeserializer;

    public FileTitleLoader(File file, TitleDeserializer titleDeserializer) {
        this.file = file;
        this.titleDeserializer = titleDeserializer;
    }

    @Override
    public List<Title> load() throws IOException {
        List<Title> titles = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            bufferedReader.readLine();
            while(true){
                String line = bufferedReader.readLine();
                if(line==null)break;
                titles.add(titleDeserializer.deserialize(line));
            }
        }
        return titles;
    }
}

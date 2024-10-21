package software.ulpgc.kata2.consistency;

import software.ulpgc.kata2.model.Title;

import java.io.IOException;
import java.util.List;

public interface TitleLoader {
    List<Title> load() throws IOException;
}

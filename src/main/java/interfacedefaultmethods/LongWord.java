package interfacedefaultmethods;

import java.nio.file.Path;
import java.util.List;

public class LongWord implements FileOperations {
    Path path;

    public LongWord(Path path) {
        this.path = path;
    }

    @Override
    public String getLongWord() {
        List<String> lines = readFromFile(path);
        StringBuilder sb = new StringBuilder();
        for (String line: lines) {
            if (sb.length() == 0) {
                sb.append(line);
            } else {
                sb.append(line.substring(line.length() - 1));
            }
        }
        return sb.toString();
    }
}

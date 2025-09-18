package by.tishalovichm.sjhm;

import java.nio.file.Path;

public class FilesUtils {

    public static Path getUserHomePath() {
        return Path.of(System.getProperty("user.home"));
    }

}

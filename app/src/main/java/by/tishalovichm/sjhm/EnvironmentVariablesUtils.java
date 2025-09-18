package by.tishalovichm.sjhm;

import lombok.SneakyThrows;

public class EnvironmentVariablesUtils {

    @SneakyThrows
    public static void set(String name, String value) {
        ProcessBuilder pb = new ProcessBuilder("setx", name, "\"%s\"".formatted(value));
        Process process = pb.start();
        int exitCode = process.waitFor();
        if (exitCode != 0) {
            throw new RuntimeException(
                "Something went wrong in setting '%s' environment variable".formatted(name));
        }
    }

}

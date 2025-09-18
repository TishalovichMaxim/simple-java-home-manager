package by.tishalovichm.sjhm;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
public class Service {

    @SneakyThrows
    public List<String> listAllJdks() {
        Path userHomePath = FilesUtils.getUserHomePath();
        Path jdksFolder = userHomePath.resolve(Consts.FOLDER, Consts.JDKS_FOLDER);

        if (!Files.exists(jdksFolder)) {
            Path parentFolder = jdksFolder.getParent();
            if (!Files.exists(parentFolder)) {
                Files.createDirectory(parentFolder);
            }

            Files.createDirectory(jdksFolder);
        }

        return Arrays.stream(jdksFolder.toFile().list())
            .map(jdksFolder::resolve)
            .map(Path::toFile)
            .filter(File::isDirectory)
            .map(File::toString)
            .toList();
    }

    public void setActiveJdk(int index) {
        String active = listAllJdks().get(index - 1);
        EnvironmentVariablesUtils.set(Consts.JAVA_HOME, active);
    }

}

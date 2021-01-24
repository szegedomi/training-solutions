package iofiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Installer {

    public void install(String path){
        Path target = Path.of(path);
        Path source = Path.of("/install/");
        if (!Files.exists(target) || !Files.isDirectory(target)) {
            throw new IllegalArgumentException("Directory is not reachable or does not exist");
        }
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(Installer.class.getResourceAsStream(source + "install.txt")))) {
            String line;
            while((line = reader.readLine()) != null) {
                if(line.endsWith("/")){
                    Files.createDirectories(Path.of(target + line));
                }else {
                    Files.copy(Path.of(source + line), Path.of(target + line), StandardCopyOption.REPLACE_EXISTING);
                }

            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

}

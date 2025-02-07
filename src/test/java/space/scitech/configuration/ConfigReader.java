package test.java.space.scitech.configuration;

import com.google.gson.Gson;
import org.testng.Reporter;

import java.io.FileReader;
import java.io.IOException;

public class ConfigReader {
    public static Config getConfig() {
        Gson gson = new Gson();
        Config config = null;
        try (FileReader reader = new FileReader("config.json")) {
            config = gson.fromJson(reader, Config.class);
        } catch (IOException e) {
            Reporter.log("Error reading config file: " + e.getMessage());
        }
        return config;
    }
}

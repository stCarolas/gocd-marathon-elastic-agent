package ru.github.stcarolas.gocd.marathon;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import com.google.common.io.ByteStreams;
import com.google.common.io.CharStreams;

public class Util {

    public static String readResource(String resourceFile) {
        try (InputStreamReader reader = new InputStreamReader(getResource(resourceFile), StandardCharsets.UTF_8)) {
            return CharStreams.toString(reader);
        } catch (IOException e) {
            throw new RuntimeException("Could not find resource " + resourceFile, e);
        }
    }

    public static byte[] readResourceBytes(String resourceFile) {
        try (InputStream in = getResource(resourceFile)) {
            return ByteStreams.toByteArray(in);
        } catch (IOException e) {
            throw new RuntimeException("Could not find resource " + resourceFile, e);
        }
    }


    private static InputStream getResource(String file) {
        return Util.class.getClassLoader().getResourceAsStream(file);
    }

} 

package allclasses.miusskii;

import java.util.ArrayList;
import java.util.List;

public class MiusskiiClass {

    private final List<String> languages = new ArrayList<>();

    public void addLanguage(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Название языка пустое.");
        }
        languages.add(name);
    }

    public List<String> getAll() {
        return languages;
    }

    public boolean containsLanguage(String name) {
        return languages.contains(name);
    }
}

package excercise1;

import java.util.LinkedList;
import java.util.List;

public final class InmutableBook {

    private final String name;
    private final int pages;
    private final List<String> charpters;

    public InmutableBook(String name, int pages, List<String> charpters) {
        this.name = name;
        this.pages = pages;
        this.charpters = charpters;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }

    public List<String> getCharpters() {
        return new LinkedList<>(charpters);
    }
}

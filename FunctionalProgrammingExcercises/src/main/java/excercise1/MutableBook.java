package excercise1;

import java.util.List;

public class MutableBook {
    private String name;
    private int pages;
    private List <String> charpters;

    public MutableBook(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public List<String> getCharpters() {
        return charpters;
    }

    public void setCharpters(List<String> charpters) {
        this.charpters = charpters;
    }
}

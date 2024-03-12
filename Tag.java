import java.util.LinkedList;
import java.util.List;

public class Tag {
    private String id;
    private String name;
    private List<String> classes = new LinkedList<>();
    private List<Tag> childs = new LinkedList<>();


    public Tag(String name) {
        this.name = name;
        classes = new LinkedList<>();

        StringBuilder sb = new StringBuilder(5);
        for (int i = 0; i < sb.capacity(); i++) {
            sb.append((char) (Math.random() * ('Z' - 'A') + 'A'));
        }
        id = sb.toString();
    }

    public void addClass(String htmlClass) {
        classes.add(htmlClass);
    }
    public void addTag(Tag tag) { childs.add(tag); }
    public String getId() { return id; }
    public String getName() { return name; }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(name);
        sb.append(" id=\"");
        sb.append(id);
        sb.append("\" class=\"");

        for (String htmlClass : classes) {
            sb.append(htmlClass);
            sb.append(' ');
        }
        sb.append("\">");

        for (Tag t : childs)
            sb.append(t.toString());

        sb.append("</");
        sb.append(name);
        sb.append(">");
        return sb.toString();
    }
}

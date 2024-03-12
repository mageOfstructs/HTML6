import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Tag> tags = new LinkedList<>();
        Tag t = new Tag("p");
        t.addTag(new TextNode());
        tags.add(t);

        try {
            Document.write(tags, "index.html");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

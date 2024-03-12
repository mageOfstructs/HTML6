import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Document {
    private List<Tag> tags;

    public static void write(List<Tag> tags, String filename) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(filename));

        bw.write("<!DOCTYPE html>");
        bw.write("<html>");
        bw.write("<body>");

        for (Tag t : tags) 
            bw.write(t.toString());

        bw.write("</body>");
        bw.write("</html>");

        bw.close();
    }
}

public class TextNode extends Tag {
    private String value;
    public TextNode(String value) {
        super(null);
        this.value = value;
    }
    public TextNode() { this("Hello World!"); }

    public String toString() {
        return value;
    }
}

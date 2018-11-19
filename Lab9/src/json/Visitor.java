package json;

public interface Visitor {
	public void visit(Image img);
	public void visit(Paragraph img);
	public void visit(Section img);
	public void visit(Table img);
	public void visit(ImageProxy img);
}

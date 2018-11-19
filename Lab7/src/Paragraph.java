public class Paragraph implements Element {
  private String text;

  public Paragraph(String text) {
    this.text = text;
  }

  
  public void print() {
    System.out.println(text);
  }

  
  public void add(Element element) {
    System.out.println("ERORR");
  }

  
  public void remove(Element element) {
    System.out.println("ERORR");

  }

  
  public Element getElement(int index) {
    System.out.println("ERORR");
    return null;
  }
  public void accept(Visitor viz) {
	  viz.visit(this);
  }
}
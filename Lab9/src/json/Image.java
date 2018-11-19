package json;
public class Image implements Element {
  private String imageName;

  public Image(String imageName) {
    this.imageName = imageName;
  }

  
  public void print() {
    System.out.println(imageName);
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
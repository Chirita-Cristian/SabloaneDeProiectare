public class Table implements Element {
  private String title;

  public Table(String title) {
    this.title = title;
  }

  
  public void print() {
    System.out.println(title);
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

}
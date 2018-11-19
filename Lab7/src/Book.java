import java.util.ArrayList;
import java.util.List;

public class Book implements Element {
  private Author author;
  private List<Element> content = new ArrayList<Element>();
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Book(String name) {
    this.name = name;
  }

  
  public void add(Element element) {
    this.content.add(element);
  }

  
  public void remove(Element element) {
    this.content.remove(element);
  }

  
  public Element getElement(int index) {
    return this.content.get(index);
  }

  
  public void print() {
	  System.out.println(name);
    for (Element element : content) {
        

    	element.print();
    }
  }


  public Author getAuthor() {
    return author;
  }


  public void setAuthor(Author author) {
    this.author = author;
  }

@Override
public void accept(Visitor vis) {
	
	for(Element e:this.content)
		e.accept(vis);
	
}
}
package json;
import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
  public String title;
  private List<Element> content = new ArrayList<Element>();

  public String getName() {
    return title;
  }

  public void setName(String name) {
    this.title = name;
  }

  public Section(String name) {
    this.title = name;
  }

  
  public void add(javax.lang.model.element.Element e) {
    this.content.add((Element) e);
  }

  
  public void remove(Element element) {
    this.content.remove(element);
  }

  
  public Element getElement(int index) {
    return this.content.get(index);
  }

  
  public void print() {
	  System.out.println(title);
    for (Element element : content) {
      element.print();
    }
  }

@Override
public void accept(Visitor vis) {
	for(Element e:this.content)
		e.accept(vis);
	vis.visit(this);
}

@Override
public void add(Element element) {
	// TODO Auto-generated method stub
	
}

}
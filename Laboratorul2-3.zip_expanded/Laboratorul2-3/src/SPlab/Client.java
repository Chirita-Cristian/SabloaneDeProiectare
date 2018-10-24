package composite;

import composite.model.Book;
import composite.model.Image;
import composite.model.Paragraph;
import composite.model.Section;
public class Client {

  public static void main(String[] args) {
    Book noapteBuna = new Book("Noapte buna copii.!");
    Section cap1 = new Section("Capitolul 1.");
    cap1.add(new Paragraph("Text 1"));
    cap1.add(new Paragraph("Text 2"));
    cap1.add(new Image("Image 1"));
    noapteBuna.add(cap1);
    noapteBuna.add(new Paragraph("Multumesc"));
    noapteBuna.print();
  }

}
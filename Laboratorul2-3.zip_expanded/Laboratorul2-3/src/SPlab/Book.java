package SPlab;

import java.util.ArrayList;

public class Book {
	String title;
	ArrayList<Author> authors=new ArrayList<Author>();
	ArrayList<Chapter> chapters=new ArrayList<Chapter>();
	ArrayList<Element> elements=new ArrayList<Element>();
	
	Book(String title){
		this.title=title;
	}
	
	public void addAuthor(Author a) {
		authors.add(a);
	}

	public int createChapter(String chapterName) {
		Chapter ch = new Chapter(chapterName);
		chapters.add(ch);
		return chapters.indexOf(ch);
	}

	public Chapter getChapter(int indexChapterOne) {
			return chapters.get(indexChapterOne);
	}
	public void print(){
		System.out.println("---Title--- ");
		System.out.println(title);
		
		System.out.println("---Authors---");
		for(int auth=0;auth<authors.size();auth++) {
			System.out.println(authors.get(auth).name);
		}
		System.out.println("---Chapters---");
		for(int ch=0;ch<chapters.size();ch++) {
			System.out.println(chapters.get(ch).chTitle);
		}
	}

}

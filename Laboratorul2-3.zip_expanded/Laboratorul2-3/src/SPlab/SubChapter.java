package SPlab;

import java.util.ArrayList;

public class SubChapter {
	String subChTitle;
	ArrayList<Table> tables=new ArrayList<Table>();
	ArrayList<Image> images=new ArrayList<Image>();
	ArrayList<Text> paragraphs=new ArrayList<Text>();
	
	SubChapter(String subChTitle){
		this.subChTitle=subChTitle;
	}

	public void createNewParagraph(String prgName) {
		Text paragraph = new Text(prgName);
		paragraphs.add(paragraph);
	}
	public void createNewImage(String imgName) {
		Image image = new Image(imgName);
		images.add(image);
	}
	public void createNewTable(String tableName) {
		Table table = new Table(tableName);
		tables.add(table);
	}
	
	public void print(){
		System.out.println("---Sub Chpater title--- ");
		System.out.println(subChTitle);
		
		System.out.println("---Tables---");
		for(int auth=0;auth<tables.size();auth++) {
			System.out.println(tables.get(auth).tableName);
		}
		System.out.println("---Images---");
		for(int ch=0;ch<images.size();ch++) {
			System.out.println(images.get(ch).imgName);
		}
		System.out.println("---Paragraphs---");
		for(int ch=0;ch<paragraphs.size();ch++) {
			System.out.println(paragraphs.get(ch).text);
		}
	}
	
}

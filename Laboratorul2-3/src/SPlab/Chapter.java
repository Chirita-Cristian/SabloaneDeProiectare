package SPlab;

import java.util.ArrayList;

public class Chapter {
	String chTitle;
	ArrayList<SubChapter> subChapters=new ArrayList<SubChapter>();
	
	Chapter(String chTitle){
		this.chTitle=chTitle;
	}

	public int createSubChapter(String subChapterName) {
		SubChapter subCh = new SubChapter(subChapterName);
		subChapters.add(subCh);
		return subChapters.indexOf(subCh);
	}
	public SubChapter getSubChapter(int indexSubChapterOneOne) {
		return subChapters.get(indexSubChapterOneOne);
	}
	public void print(){
		System.out.println("---Chapter Title--- ");
		System.out.println(chTitle);
		
		System.out.println("---Sub Chapter---");
		for(int auth=0;auth<subChapters.size();auth++) {
			System.out.println(subChapters.get(auth).subChTitle);
		}
	}
	
}

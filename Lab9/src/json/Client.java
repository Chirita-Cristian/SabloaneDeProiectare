package json;

public class Client {
	public static void main(String[] args) throws Exception {		
		Section cap1 = new Section("Capitolul 1");
		Paragraph p1 = new Paragraph("Paragraph 1");
		cap1.add(p1);
		Paragraph p2 = new Paragraph("Paragraph 2");
		cap1.add(p2);
		Paragraph p3 = new Paragraph("Paragraph 3");
		cap1.add(p3);
		Paragraph p4 = new Paragraph("Paragraph 4");
		cap1.add(p4);
		cap1.add(new ImageProxy("ImageOne"));
		cap1.add(new Image("ImageTwo"));
		cap1.add(new Paragraph("Some text"));
		cap1.add(new Table("Table 1"));
		Section cap2 = new Section("Capitolul 2");
		Paragraph p21 = new Paragraph("Paragraph 2.1");
		cap2.add(p21);
		Paragraph p22 = new Paragraph("Paragraph 2.2");
		cap2.add(p22);
		Paragraph p23 = new Paragraph("Paragraph 2.3");
		cap2.add(p23);
		Paragraph p24 = new Paragraph("Paragraph 2.4");
		cap2.add(p24);
		cap2.add(new ImageProxy("ImageOne"));
		cap2.add(new Image("ImageTwo"));
		cap2.add(new Paragraph("Some text"));
		cap2.add(new Table("Table 1"));
			
		BookStatistics stats = new BookStatistics();
		Book carte=new Book ("Ceva");
		carte.add(cap1);
		carte.add(cap2);
		carte.accept(stats);
		stats.printStatistics();
	}
}

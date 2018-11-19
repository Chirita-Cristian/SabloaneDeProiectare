package json;

public class BookStatistics implements Visitor {
	int nrimg=0;
	int nrpar=0;
	int nrsec=0;
	int nrtab=0;
	public void visit(Image img) {
		nrimg++;
	}
	public void visit(Paragraph par) {
		nrpar++;
	}
	public void visit(Section sec) {
		nrsec++;
	}
	public void visit(Table tab) {
		nrtab++;
	}
	public void printStatistics() {
		System.out.println("Imagini: "+ nrimg);
		System.out.println("Paragrafe: "+ nrpar);
		System.out.println("Sectiuni: "+ nrsec);
		System.out.println("Tabele: "+ nrtab);
	}
	@Override
	public void visit(ImageProxy img) {
		
	}
}

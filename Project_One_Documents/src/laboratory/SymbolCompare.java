package laboratory;
//
import java.util.Comparator;

class SymbolCompare implements Comparator <Element> {
	public int compare(Element e1, Element e2) {
		return e1.getSymbol().compareTo(e2.getName());
	}
}
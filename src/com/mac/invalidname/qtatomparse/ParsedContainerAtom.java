/*
  "QT Atom Parse" (c) 2003, Chris Adamson, invalidname@mac.com
  relased under terms of the GNU public license 
  http://www.gnu.org/licenses/licenses.html#TOCGPL
*/

package com.mac.invalidname.qtatomparse;

public class ParsedContainerAtom extends ParsedAtom {
	
	protected ParsedAtom[] children;
	
	protected ParsedContainerAtom(long size, String type, ParsedAtom[] children) {
		super(size, type);
		this.children = children;
	}
	
	public ParsedAtom[] getChildren() {
		return children;
	}
	
	@Override
	public String toString() {
		return type + " (" + size + " bytes) - " + children.length + (children.length == 1 ? " child" : " children");
		
	}
	
}

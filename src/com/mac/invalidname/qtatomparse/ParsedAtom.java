/*
  "QT Atom Parse" (c) 2003, Chris Adamson, invalidname@mac.com
  relased under terms of the GNU public license 
  http://www.gnu.org/licenses/licenses.html#TOCGPL
*/

package com.mac.invalidname.qtatomparse;

public abstract class ParsedAtom extends Object {
	
	protected long size;
	protected String type;
	
	protected ParsedAtom(long size, String type) {
		this.size = size;
		this.type = type;
	}
	
	public long getSize() {
		return size;
	}
	
	public String getType() {
		return type;
	}
	
} // ParsedAtom

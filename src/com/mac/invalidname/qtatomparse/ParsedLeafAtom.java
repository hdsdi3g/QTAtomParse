/*
  "QT Atom Parse" (c) 2003, Chris Adamson, invalidname@mac.com
  relased under terms of the GNU public license 
  http://www.gnu.org/licenses/licenses.html#TOCGPL
*/

package com.mac.invalidname.qtatomparse;

import java.io.IOException;
import java.io.RandomAccessFile;

public class ParsedLeafAtom extends ParsedAtom {
	
	/**
	 * Constructor should only be called by AtomFactory and
	 * assumes that the RandomAccessFile is on the first
	 * byte after the type (or extended size, if present)
	 * so that the contents of the leaf atom can be read.
	 * <p>
	 * All subclasses must have a constructor with this signature, so that the factory can instantiate them.
	 */
	public ParsedLeafAtom(long size, String type, RandomAccessFile raf) throws IOException {
		super(size, type);
		init(raf);
	}
	
	/**
	 * Called by the constructor, the init method assumes
	 * that the RandomAccessFile is on the first byte after
	 * the type (or extended size, if present) and reads
	 * in the contents of the atom. That means that there are
	 * size-8 bytes left to be read, unless size > 0xffffffff (unsigned)
	 * in which case there was an extended size and there are thus
	 * size-16 bytes left to be read
	 * <p>
	 * The default does nothing. Atom-specific subclasses can override this method to handle the specific structures of their atoms.
	 */
	public void init(RandomAccessFile raf) throws IOException {
		// does nothing
	}
	
	/** By default, leaf atoms return "type (size bytes)" */
	@Override
	public String toString() {
		return type + " (" + size + " bytes) ";
	}
	
}

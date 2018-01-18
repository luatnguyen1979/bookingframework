/**
 * 
 */
package asd.day3.lab41;

/**
 * @author luatnguyen
 *
 */
public abstract class ALargeAlphabets {

	/**
	 * This function will rebuild full content of character base on the matrix content provided
	 * @param content the optimized matrix to construct character
	 */
	public final void storeCharacter(char[][] content ) {
		Symmetry symmetry = identifySymmetryType(content);
		char[][] fullContent = reconstructLetter(content, symmetry);
		printCharater(fullContent);
		
	}
	
	/**
	 * This function will identify which symmetry that we need to rebuild the full matrix of character
	 * @param content the optimized matrix to construct character
	 * @return an symmetry type such as VERTICAL, HORIZONTAL, NONE
	 */
	public abstract Symmetry identifySymmetryType(char[][] content);
	
	/**
	 * This function will construct the full matrix character based on the symmetry type
	 * @param content the optimized matrix content
	 * @param symmetry the symmetry type
	 * @return a full matrix content
	 */
	public abstract char[][] reconstructLetter(char[][] content, Symmetry symmetry);
	
	/**
	 * This function will print the character based on full matrix content.
	 * @param content full matrix content.
	 */
	public abstract void printCharater(char[][] content);

}

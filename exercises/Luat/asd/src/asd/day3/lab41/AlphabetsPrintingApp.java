/**
 * 
 */
package asd.day3.lab41;

/**
 * @author luatnguyen
 *
 */
public class AlphabetsPrintingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char[][] A = {
			    {'-','-','-','-','-'},
                {'-','-','-','-','+'},
                {'-','-','-','+','+'},
                {'-','-','+','+','-'},
                {'-','-','+','+','-'},
                {'-','+','+','-','-'},
                {'-','+','+','-','-'},
                {'-','+','+','-','-'},
                {'-','+','+','+','+'},
                {'-','+','+','-','-'},
                {'-','+','+','-','-'},
                {'-','+','+','-','-'},
                {'-','+','+','-','-'},
                {'-','+','+','-','-'}};
		char[][] B = {
				{'-','-','-','-','-','-','-','-','-'},
				{'-','+','+','+','+','+','-','-','-'},
				{'-','+','+','-','-','+','+','-','-'},
				{'-','+','+','-','-','-','+','+','-'},
				{'-','+','+','-','-','-','+','+','-'},
				{'-','+','+','-','-','-','+','+','-'},
				{'-','+','+','-','-','+','+','-','-'},
				{'-','+','+','+','+','+','+','-','-'},
				{'-','+','+','-','-','-','+','+','-'},
				{'-','+','+','-','-','-','-','+','+'},
				{'-','+','+','-','-','-','-','+','+'},
				{'-','+','+','-','-','-','-','+','+'},
				{'-','+','+','-','-','-','+','+','-'},
				{'-','+','+','+','+','+','+','-','-'}
		};
		char[][] C = {
				{'-','-','-','-','-','-','-','-','-'},
				{'-','-','-','+','+','+','+','-','-'},
				{'-','-','+','+','-','-','+','+','-'},					
				{'-','+','+','-','-','-','-','+','+'},
				{'-','+','+','-','-','-','-','-','-'},
				{'-','+','+','-','-','-','-','-','-'},
				{'-','+','+','-','-','-','-','-','-'},
				{'-','+','+','-','-','-','-','-','-'}
		};
		char[][] D = {
				{'-','-','-','-','-','-','-','-','-'},
				{'-','+','+','+','+','+','-','-','-'},
				{'-','+','+','-','-','-','+','+','-'},
				{'-','+','+','-','-','-','-','+','+'},
				{'-','+','+','-','-','-','-','+','+'},
				{'-','+','+','-','-','-','-','+','+'},
				{'-','+','+','-','-','-','-','+','+'},
				{'-','+','+','-','-','-','-','+','+'}
		};
		
		AlphabetsPrinting alphabetsPrinting = new AlphabetsPrinting();
		System.out.println("Before construct A");
		alphabetsPrinting.printCharater(A);
		System.out.println("After construct A");
		alphabetsPrinting.storeCharacter(A);
		System.out.println();
		System.out.println("Before construct B");
		alphabetsPrinting.printCharater(B);
		System.out.println("After construct B");
		alphabetsPrinting.storeCharacter(B);
		System.out.println();
		System.out.println("Before construct C");
		alphabetsPrinting.printCharater(C);
		System.out.println("After construct C");
		alphabetsPrinting.storeCharacter(C);
		System.out.println();
		System.out.println("Before construct D");
		alphabetsPrinting.printCharater(D);
		System.out.println("After construct D");
		alphabetsPrinting.storeCharacter(D);
	}

}

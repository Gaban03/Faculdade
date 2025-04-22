package aula_12;

public class MetodosString {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG        ";
		
		System.out.println("Original = |" + original + "|");
		System.out.println("TolowerCase() = |" + original.toLowerCase() + "|");
		System.out.println("ToUpperCase() = |" + original.toUpperCase() + "|");
		System.out.println("Trim() = |" + original.trim() + "|");
		System.out.println("Substring(2) = |" + original.substring(2) + "|");
		System.out.println("Substring(2, 9) = |" + original.substring(2,9) + "|");
		System.out.println("Replace('a', 'x') = |" + original.replace('a', 'x') + "|");
		System.out.println("Replace(\"abc\", \"xy\") = |" + original.replace("abc", "xy") + "|");
		System.out.println("IndexOf(\"bc\") = |" + original.indexOf("bc") + "|");
		System.out.println("LastindexOf(\"bc\") = |" + original.lastIndexOf("bc") + "|");
	}

}

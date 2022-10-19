public class StringOperations
{
public static void main(String[] args)
{
String S="Snehitha";
System.out.println(S.toUpperCase());
System.out.println(S.toLowerCase());
System.out.println(S);
String S1= "Tom";
String S2= "Tom";
String S3= "Cat";

System.out.println(S1.equals(S2));  //equals//
System.out.println(S2.equals(S3));
System.out.println(S3.equals(S1));

System.out.println(S1.equalsIgnoreCase(S2));  //equalsignorecase//
System.out.println(S2.equalsIgnoreCase(S3));
System.out.println(S3.equalsIgnoreCase(S1));



System.out.println(S1+S2);   //concat//
System.out.println(S2+S3);

int index=S.indexOf('n',2);
System.out.println("index of char" +index);

String tr= S1.trim();
System.out.println(tr);
System.out.println(tr.length());


String S4="this is my java program";             //replace//
String replaceString= S4.replace("java", "to");
System.out.println(replaceString);

System.out.println(S.substring(3,5));   //substring//

char ch=S.charAt(2);
System.out.println(ch);

System.out.println(S4.startsWith("this"));
System.out.println(S4.startsWith("Java program"));

System.out.println(S4.endsWith("Java"));
System.out.println(S4.endsWith("program"));


System.out.println("string length is:"+S1.length());
System.out.println("string length is:"+S4.length());
System.out.println(S4.contains("snehitha"));
System.out.println(S3.contains("java"));
System.out.println(S2.contains("Tom"));

String S5=S.intern();
System.out.println(S4=S5);
System.out.println(S3=S2);

}
}




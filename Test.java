import cs1.SimpleURLReader;

/* URL Reader Tester Class
 * description: reads the contents of the url linked and prints the humber of lines it contains
 * @author: Nashiha Ahmed
 * @version: 1/ 09-03-15
 */

public class Test
{
    public static void main( String[] args)
    {
        String s;
        s = "http://www.cs.bilkent.edu.tr/~david/housman.txt";
        String s2;
        s2 = "http://www.cs.bilkent.edu.tr/~david/housman.htm";
        //Tester t;
//        //t = new Tester( s);
//        SimpleURLReader reader;
//        reader = new SimpleURLReader( s);
//        MySimpleURLReader reader;
//        reader = new MySimpleURLReader( s);
//        HTMLFilteredReader reader;
//        reader = new HTMLFilteredReader( s2);
        SuperHTMLFilteredReader reader;
        reader = new SuperHTMLFilteredReader( s2);
        System.out.println( "Number of lines: " + reader.getLineCount());
        //System.out.println( "Number of lines: " + t.getLineCount());
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println( "*************************************************************************************");
        System.out.println( "Content:");
        //System.out.println( "Number of lines: " +.getPageContents());
        //System.out.println( reader.getPageContents());
        //System.out.println( reader.getUnfilteredPageContents());
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println( "*************************************************************************************");
        System.out.println( reader.getPageContents());
        System.out.println( "*************************************************************************************");
        System.out.println( "URL:");
        System.out.println( reader.getURL());
        System.out.println( "file:");
        System.out.println( reader.getName());
        System.out.println( reader.computeOverhead());
   
    }
}
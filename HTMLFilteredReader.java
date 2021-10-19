import java.lang.String;
/* HTML Filtered Reader Class
 * @author: Nashiha Ahmed
 * @version: 1/ 10.03.15
 */

public class HTMLFilteredReader extends MySimpleURLReader
{
    //properties
    String myURL;
    
    //constructors
    public HTMLFilteredReader( String url)
    {
        super( url); 
        myURL = url;
    }
    
    //methods
    
    public String getUnfilteredPageContents()
    {
        //returns page with unfiltered code
        return super.getPageContents();
    }
    
    public String getPageContents()
    {
        //only text without html
        int index;
        String oldContent;
        String content;
        boolean isText;
        content = "";
        oldContent = super.getPageContents();
        isText = true;
        for( int i = 0; i < oldContent.length(); i++)
        {
            if( oldContent.charAt(i) == '<')
            {
                isText = false;
            }
            if( isText)
            {
                content = content + oldContent.charAt(i);
            }
            if( oldContent.charAt(i) == '>')
            {
                isText = true;
            }
        }
        content = content.replaceAll( "\n\n\n", "\n");
        return content;
    }
}
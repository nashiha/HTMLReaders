import cs1.SimpleURLReader;
/* MySimpleURLReader Class
 * description: extends SimpleURLReader and adds two methods: getURL() and getName()
 * @author: Nashiha Ahmed
 * @version: 1/ 09-03-15
 */

public class MySimpleURLReader extends SimpleURLReader
{
    //properties
    String myURL;
    //constructors
    public MySimpleURLReader( String url)
    {
        super( url); 
        myURL = url;
    }
    
    //methods
    public String getURL()
    {
        return myURL;
    }
    
    public String getName()
    {
        int index;
        String name;
        index = ( myURL.lastIndexOf( "/")) + 1;
        name = myURL.substring( index);
        return name;
    }
    
    public String getPageContents()
    {
        int index;
        String oldContent;
        String content;
        oldContent= super.getPageContents();
        index = ( oldContent.indexOf( "null")) + 4;
        content = oldContent.substring( index);
        return content;
        
    }
}

/* SuperHTML Filtered Reader Class
 * @author: Nashiha Ahmed
 * @version: 1/ 10.03.15
 */

public class SuperHTMLFilteredReader extends HTMLFilteredReader
{
    //constructors
    public SuperHTMLFilteredReader( String url)
    {
        super( url); 
    }
    
    //methods
    public double computeOverhead()
    {
        double overhead;
        double sizeHTML;
        double sizeTEXT;
        sizeHTML = super.getUnfilteredPageContents().length();
        sizeTEXT = super.getPageContents().length();
        //return sizeHTML;
        //return sizeTEXT;
        overhead = (Math.abs((sizeHTML - sizeTEXT))/sizeTEXT) * 100;
        return overhead;
    }    
//    public ArrayList<String> getLinks()
//    {
//        
//    }
}
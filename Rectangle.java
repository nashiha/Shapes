/* Rectangle class
 * @author: Nashiha Ahmed
 * @version 1/ 18.03.15
 */
public class Rectangle extends Shape
{
    //properties
    int height;
    int width;
    
    //constructor
    public Rectangle( int height, int width)
    {
        this.height = height;
        this.width = width;
    }
    
    //methods
    public double getArea()
    {
        //variables
        double area;
        
        //code
        //1.Compute area
        area = height * width;
        //2.return area
        return area;
    }
}
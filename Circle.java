/* Circle class
 * @author: Nashiha Ahmed
 * @version 1/ 18.03.15
 */
public class Circle extends Shape
{
    //properties
    int radius;
    
    //constructor
    public Circle( int radius)
    {
        this.radius = radius;
    }
    
    //methods
    /* Because Cirlce extends Shape which is an abstract class, it must have getArea method or it won't compile
     * Although making Circle class abstract may fix the error it gives because then it does not need to implement the
     * get area method, Circle class then cannot be instantiated
     */ 
    public double getArea()
    {
        //variables
        double area;
        
        //code
        //1.Compute area
        area = Math.PI * (radius * radius);
        //2.return area
        return area;
    }
}
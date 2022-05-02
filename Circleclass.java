public class Circle 
{   
    private Point center;
    private double radius;
    //The two argument constructor.
    public Circle(Point o, double r)
    {
        this.center=o;
        this.radius=r;
    }
    //Three arguement constructor
    public Circle(double xValue, double yValue, double r)
    {
        this(new Point(xValue,yValue),r);
    }
    //No-arg constructor
    public Circle()
    {
        this.center=new Point(0,0);
        this.radius=1;
    }
    //Copy constructor
    public Circle(Circle c)
    {
        this.center=c.center;
        this.radius=c.radius;
    }
    
    //Add setters and getters for the center, so that users of the class can access the point directly.
    public Point getCenter()
    {
        return center;
    }
    public void setCenter(Point p)
    {
        this.center=p;
    }
    
    //Rewrite the existing setters and getters for x and y so that they use the center member.
    void setX(double value)
    {
        this.center.setX(value);
    }
    public double getX()
    {
        return this.center.getX();
    }
    public void setY(double value)
    {
        this.center.setY(value);
    }
    public double getY()
    {
        return this.center.getY();
    }

    //Getter and setter for radius
    public void setRadius(double value)
    {
        this.radius=value;
    }
    public double getRadius()
    {
        return radius;
    }
    //getArea() function to get area of circle
    public double getArea()
    {
        return 3.14*radius*radius;
    }
    
    //ToString() method
    public String toString()
    {
        return "Circle x:"+getX()+", y:"+getY()+", radius:"+radius;
    }

    //equals() method to check equality of circle
    public boolean equals(Circle c)
    {
        return getX()==c.getX() && getY()==c.getY() && radius==c.radius;  
    }

    //doesOverlap() method to check overlapping of circles
    public boolean doesOverlap(Circle c)
    {
        if(center.distanceTo(c.center)<=radius+c.getRadius())
            return true;
        else
            return false;
    }
    
    public static void main(String[] args)
    {
        Point p= new Point(5,1);
        //create circle with 2 arg cobstructor
        Circle c1=new Circle(p,4);
        //create circle with 3 arg constructor
        Circle c2=new Circle(3,2,2);
        //create constructor with no-arg constructor
        Circle c3=new Circle();
        //create circle with copy constructor
        Circle c4=new Circle(c1);
        
        //usiing toString()
        System.out.println("c1 "+c1);
        System.out.println("c2 "+c2);
        System.out.println("c3 "+c3);
       
        //using getArea() method
        System.out.println("\nArea of Circle c1: "+c1.getArea());
        System.out.println("Area of Circle c2: "+c2.getArea());
        System.out.println("Area of Circle c3: "+c3.getArea());
        
        //using equals() method
        System.out.println("\nIs Circle c1 equal to Vircle c3? : "+c1.equals(c3));
        System.out.println("Is Circle c1 equal to Vircle c4? : "+c1.equals(c4));
        
        //using doesOverlap() method
        System.out.println("\nDoes Circle c1 overlap Circle c2? : "+c1.doesOverlap(c2));
        System.out.println("Does Circle c1 overlap Circle c3? : "+c1.doesOverlap(c3));
    }
 
}
Point.java


public class Point 
{   //member variables
    private double x;
    private double y;

    //Yangyang Lian
    
    public Point() 
    {
        this(0,0);
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    //getters and setters for x and y
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    //distanceTo() method to check distance between 2 points
    public double distanceTo(Point other)
    {
        double distance;
        distance=Math.sqrt((other.x-x)*(other.x-x)+(other.y-y)*(other.y-y)); 
        return distance;
    }
}

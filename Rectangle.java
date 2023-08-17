public class Rectangle implements Shape {
    
    private double x;

    private double y;

    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    @Override
    public void setShape(double x, double y) {
        if (x > 0.0) {
            this.x = x;
        }
        if (y > 0.0) {
            this.y = y;
        }
        
    }

    @Override
    public double calculateArea() {
         return getX() * getY() ;
    }

    @Override
    public double perimeter() {
        return 2 * ( getX() +  getY() ) ;
    }
    
}

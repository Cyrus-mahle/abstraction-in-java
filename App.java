public class App {
    
    public static void main(String[] args) {
    
        Rectangle rectangle1 = new Rectangle();

        rectangle1.setShape(10, 5);
        
        rectangle1.getX();
        rectangle1.getY();
        
         
        System.out.println(" Area : " + rectangle1.calculateArea());
        System.out.println(" Perimeter : " + rectangle1.perimeter());
    }
    

}

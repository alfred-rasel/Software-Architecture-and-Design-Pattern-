public class Demo{

   public static void main(String[] args)
   {
           ShapeFactory shapeFactory=new ShapeFactory();
           //get an on object of circle 
           Shape shape1=shapeFactory.getShape("CIRCLE");
             shape1.display();
              Shape shape2= shapeFactory.getShape("RECTANGLE");
              shape2.display();
   }

}
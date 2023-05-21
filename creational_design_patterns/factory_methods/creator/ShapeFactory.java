public class ShapeFactory{
  // use getShape methods to get object of type shape 
  public Shape getShape(String ShapeType){

     if(ShapeType==null)
     {
        return =null;
     }
     if(ShapeType.equalsIgnoreCase("CIRCLE"))
     {
        return new Circle();
     }
     else if(ShapeType.equalsIgnoreCase("RECTANGLE"))
     {
        return new Rectangle();

     }
    
  return  null; 
  }

}

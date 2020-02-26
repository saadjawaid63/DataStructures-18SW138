class Shape{  
void draw(){System.out.println("drawing...");} 
void eradicate(){System.out.println("eradicating...");} 
}  
class Square extends Shape{  
void draw(){System.out.println("drawing square...");}  
void eradicate(){System.out.println("eradicating Square...");}
}  
  
class Triangle extends Shape{  
void draw(){System.out.println("drawing triangle...");}  
void eradicate(){System.out.println("eradicating triangle...");}
}  
class TestPolymorphism{  
public static void main(String args[]){  
Shape s;  
s=new Square();  
s.draw();
s.eradicate();  

s=new Triangle();  

s.draw();  
s.eradicate();
}  
}  
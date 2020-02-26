import java.util.Scanner;

class Area{
int length;
int breadth;
public Area(int length, int breadth){
this.length=length;
this.breadth=breadth;
}

public int returnArea(){
int area=length*breadth;

return area;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length of rectangle: ");
int l=sc.nextInt();

System.out.println("Enter the breadth of rectangle: ");
int b=sc.nextInt();


Area aa=new Area(l,b);


System.out.println("Area  of rectangle is: "+aa.returnArea());
}

}
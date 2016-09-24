# MidPoint Review 

## 1. Write a unary recursive method to convert a decimal number to a hexadecimal format.
### Hexadecimal uses symbols 0-9 and A-F (10 = A, 11 = B, ...)
### example: (56)16 = 38 , (1000)16 = 3E8
    
### hint: use the similar logic f converting a decimal into a binary form.
    
### Use the following java class and complete the method body. 

    public class convertDec2Hex{
     
        public static void main(String[] args){
        
            JOptionPane.showMessageDialog(convert(1000 , "") );
        }

        public static String convert(int n , String r){
            
            //TODO-- implement a recursive method to convert a n to its  
            //hexadecimal representation-- the output is a String.
        }
    }
    
## 2. Consider the data class definition below. The intended purpose is at instantiation time (when an object is created), an initial value is provided. During the life of the object, that value will be used as an accumulator (sum). Discuss THREE errors with the code, be specific (indicate what type of error is produced in each situation, what results from each error and how to fix them.

    public class Holder {
     
        private int value;
     
        public void Holder(int initialValue) {initialValue = value;}
     
        public int getValue() {return value;}
     
        public void addToValue(int toAdd) {int value += toAdd;}
    }
    
# 3. Write a method to read the content of a file with attributes address, price, and status(see below).

    1000 Stafford,Fairfax,va ; $450000 ; active
    1234 Cotswolds lane, Fairfax ,va; $480000 ; active
    458 Main, Manassas , va; $350000 ; pending
    234 Locust, McLean, va; $690000 ; pending
    9800 fairoaks way, Fairfax ,va; $450000 ; active
    121 University, Fairfax ,va; $380000 ; active
    
## For simplicity, assume that every line ends with new line character. You must
### Use proper exception handling. Your method reads data from file, and generates a sorted array of "active" houses based on their price. You are required to use insertion sort algorithm for this problem. The method must have the following signature:

    public static House[] readAndSortOnPrice(String filepath) { //TODO }
    
### Use the following class template for your house entity:

    public class House{
        
        private String address;
        
        private double price;
        
        private String status;
        
        public House(String ad , double p , String s) {
            
            address = ad; price = p; status = s;
        }
    
        public double getPrice() { return price; }
        
        public String getAddress() {return address; }
        
        public String getStatus() {return status; }
    }

### hint: Scanner scan = new Scanner("123;654");

    scan.useDelimiter(';');
    String s1 = scan.next(); //s1 = "123"
    String s2 = scan.next(); //s2 ="654"

## Indicate the complexity of your method for n lines of data. You should explain the steps you used to obtain such complexity (Big-O).

# 4. Identify the type of UML diagram in the picture below. Explain the semantics of nodes and the edges, and explain how does every node get activated in the diagram in the context of the type of UML diagram being used.


# 5. Which of the following options best describes the relationship between the following classes?
    
    public class Appliance{
        
        private String type;
        
        private double price;
        
        public Appliance(String t , double p){ type= t; price = p;}
    }
 
    public class Kitchen{
        
        private Appliance[] appliances;
        
        private int num;
        
        public Kitchen (int max) {
        
            appliances = new Appliance[max];
        
            num = -1;
        }
        
        public boolean addAppliance(Appliance a) {
        
            if(num+1 >= appliances.length() ) 
                return false;
            else     
                appliances[++num] = a;
            
            return true;
        }
    }
    
### a) aggregation           
### b) composition       
### c) polymorphism         
### d) inheritance

# 6. Identify the problem in the following code and propose how to solve them. 

    public interface Colorable{ }
    
    public class Vehicle{ }
    
    public class Car extends Vehicle implements Colorable{ }
    
    public class Tester{
            
        public static void main(String[] args){
        
            Vehicle b = new Vehicle();
                Colorable j = (Colorable) b;
        }
    }

### a) change public class Vehicle{ } to public class Vehicle extends Colorable{ }
### b) public class Vehicle implements Colorable{ }
### c) public class Vehicle extends Car { }
### d) There is nothing wrong with the code.

# 7 Which type of exception should be used for the blank in the following code?

    public implementation{
    
        public static void main(String[] args){
            
            String[] names = {“Tom” , “Jon” , “James” , “Max” , “Sam”};
     
            try{
            
                for(int i=0; i<5; i++)  System.out.println(names[i+1]);
            
            } catch(______________________ e) {
            
                e.printStackTrace();
            }
        }         
    }

### a)	IndexOutOfBoundException
### b)	FileNotFoundException
### c)	NullPointerException
### d)	ClassDefNotFoundException

# 8. Is it possible for a polymorphic subclass to implement more than one interface? Explain with an example.

# 9. (T/F) An abstract class is a class that contains at least one abstract method. 

# 10. Insert the missing code in the following code fragment. This fragment is intended to initialize an instance variable.

    public class Motor 
    { 
        int motorSpeed; 
    
        public Motor(int speed) { motorSpeed = speed; } 
        public Motor() { 
    	      _________; 
        } 
    }
     
### a) this.motorspeed(0);			
### b)  this(0);
### c) this(speed)        
### d)  You cannot call a constructor from within another constructor.

# 11- Explain the error resulted from this code and indicate how to fix it: Do not use JAVA IDE for this problem.
hint: explain the context of constructors. 

public class Shape {
        private String shType;   
        public Shape(String type) {
               shType = type; 
          }
}

public class Circle extends Shape{
                 private String shType;
                 public Circle(String t) {
                         shType = t;
               }
}




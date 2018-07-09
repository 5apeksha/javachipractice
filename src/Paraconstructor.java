
class Paraconstructor{  
    int id;  
    String name;  
      
    Paraconstructor(int i,String n){  
    id = i;  
    name = n;  
    }  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    	Paraconstructor s1 = new Paraconstructor(111,"Karan");  
    	Paraconstructor s2 = new Paraconstructor(222,"Aryan");  
    s1.display();  
    s2.display();  
   }  
}  
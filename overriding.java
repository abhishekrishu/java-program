class Bank{  
int getRateOfInterest(){return 0;}
}  
class AXIS extends Bank{  
int getRateOfInterest(){return 9;}  
}  
class SBI extends Bank{  
int getRateOfInterest(){return 8;}  
}  
class PNB extends Bank{  
int getRateOfInterest(){return 8;}  
}  
  
class ICICI extends Bank{  
int getRateOfInterest(){return 7;}  
}  


class AXIS1 extends Bank{  
int getRateOfInterest(){return 90;}  
}  
  
class Test2{  
public static void main(String args[]){  
SBI s=new SBI();  
ICICI i=new ICICI();  
AXIS a=new AXIS(); 
AXIS1 a1=new AXIS1(); 
PNB uu=new PNB(); 

System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
System.out.println("AXIS1 Rate of Interest: "+a1.getRateOfInterest());  
System.out.println("P Rate of Interest: "+uu.getRateOfInterest());  
System.out.println("HDFC Rate of Interest: "+k.getRateOfInterest());  
}  
}  
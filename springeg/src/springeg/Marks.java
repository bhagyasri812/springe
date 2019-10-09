package springeg;

public class Marks
{  
private int M1,M2,M3;


private String name;  
/*public Marks() 
{	System.out.println("default constructor");	
}  
public Marks(String name) 
{  	  this.name = name;	  }
  
  public Marks(int M1,int M2,int M3) 
{	  this.M1 = M1;
this.M2 = M2;
this.M3 = M3;
}  */
  public Marks(String name,int M1,int M2,int M3 ) 
  {	  this.M1 = M1;
  this.M2 = M2;
  this.M3 = M3;
  this.name=name;
  }  


  public void show()
{     int  tot=M1+M2+M3; float avg=(M1+M2+M3)/3;
	  System.out.println(name+" "+M1+" "+M2+" "+M3+" ");
       System.out.println(tot+" "+avg);
       if(avg>90) {
    	   System.out.println("Grade A");
       }
       else if(avg<90 && avg>60) {
    	   System.out.println("Grade B");
       }
       else {
    	   System.out.println("fail");
       }
}
  }  


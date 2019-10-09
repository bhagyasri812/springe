package springeg;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import org.springframework.core.io.*;

public class MarksTest {  
    public static void main(String[] args) {  
         
        Resource r=new ClassPathResource("applicationCont.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
        Marks m=(Marks)factory.getBean("e");  
        m.show();  
         
        
          
    }  
    
}  
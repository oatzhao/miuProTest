package Lecture5.Company;


import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CompanyReflection {
    public static void main(String[] args) throws Exception {
        Company comp = new Company("Veridian Solution", 24000);
        Class compClass = comp.getClass();
        System.out.println("Name of the class with package name:" + compClass.getName());
        System.out.println("Name of the class:" + compClass.getSimpleName());
        Field[] companyFields = compClass.getDeclaredFields();
        for(Field field: companyFields){
            if(field.getName().equals("name")){
                field.setAccessible(true);
                field.set(comp, "NexGen Innovations");
            }
        }
        System.out.println("Name of the company:" + comp.getName());

        Method[] compMethods = compClass.getMethods();
        for(Method method:compMethods){
            if(method.getName().equals("setNumOfEmployees")){
                method.setAccessible(true);
                method.invoke(comp, 25000);
            }else {
                method.setAccessible(true);
                method.invoke(null);
            }
        }
        System.out.println("Number of employees:" + comp.getNumOfEmployees());
    }

}

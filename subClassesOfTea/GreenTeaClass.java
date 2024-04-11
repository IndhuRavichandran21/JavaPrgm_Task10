package task10.subClassesOfTea;

import task10.TeaClass;

public class GreenTeaClass extends TeaClass{
    String greenLeaves="Green Leaves";
    String brewingTime="2 min";
    public GreenTeaClass(){
        
    }
    @Override
    public void prepareTea(){
        System.out.println("Ingredients to prepare green tea: Add "+hotwater+"; Add "+greenLeaves+
        "\nAllow to boil for "+brewingTime);

    }

    public static void main(String[] args) {
        GreenTeaClass greenTea=new GreenTeaClass();
        greenTea.prepareTea();
        
    }
}

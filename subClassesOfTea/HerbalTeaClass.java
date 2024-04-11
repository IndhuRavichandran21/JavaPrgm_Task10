package task10.subClassesOfTea;

import task10.TeaClass;

public class HerbalTeaClass extends TeaClass{
    String herbs="Tulsi";
    String brewingTime="7 min";
public HerbalTeaClass(){
    
}
    @Override
    public void prepareTea(){
        System.out.println("Ingredients to prepare herbal tea: Add "+hotwater+"; Add "+herbs+
        "\nAllow to boil for "+brewingTime);

    }

    public static void main(String[] args) {
        HerbalTeaClass herbalTea=new HerbalTeaClass();
        herbalTea.prepareTea();
        
    }
}

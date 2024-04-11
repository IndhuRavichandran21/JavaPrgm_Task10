package task10.subClassesOfTea;

import task10.TeaClass;

public class BlackTeaClass extends TeaClass{

    String brewingTime="3 min";

    @Override
    public void prepareTea(){
        System.out.println("Ingredients to prepare black tea: Add "+hotwater+"; Add "+teaLeaves+"; Add "+sugar+
        "\nAllow to boil for "+brewingTime);

    }

    public static void main(String[] args) {
        BlackTeaClass blackTea=new BlackTeaClass();
        blackTea.prepareTea();
        
    }
}

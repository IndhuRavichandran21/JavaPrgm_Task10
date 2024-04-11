package task10;

public class TeaClass {
    public String hotwater="Hot water";
    public String teaLeaves="Tea Leaves";
    public String milk="Milk";
    public String sugar="Sugar";
    public String herbs="Herbs";
    
    public void prepareTea(){
        System.out.print("Ingredients to prepare basic tea: Add "+hotwater+"; Add "+teaLeaves);
       
    }

    public void addMilk(){
        System.out.println("");
        prepareTea();
        System.out.print("; Add "+milk);
    }

    public void addSugar(){
        System.out.println("");
        prepareTea();
        System.out.print("; Add "+sugar);
    }
    public static void main(String[] args) {
        TeaClass teaClass=new TeaClass();
        teaClass.prepareTea();
        teaClass.addMilk();
        teaClass.addSugar();
    }
}

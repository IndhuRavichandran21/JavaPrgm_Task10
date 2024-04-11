package task10;

class Tea{
String teaType;

public Tea(String teaType){
    this.teaType=teaType;
}

void displayTeaType(){
    System.out.println("The type of tea is "+teaType);
}
}

class GreenTea extends Tea{
    public GreenTea(String teaType){
        super(teaType);
        this.teaType=teaType;     
    }

    @Override
    void displayTeaType(){
        System.out.println("The type of tea is "+teaType);
    } 
}

class HerbalTea extends Tea{
    public HerbalTea(String teaType){
        super(teaType);
        this.teaType=teaType;     
    }

    @Override
    void displayTeaType(){
        System.out.println("The type of tea is "+teaType);
    }
}

class BlackTea extends Tea{
    public BlackTea(String teaType){
        super(teaType);
        this.teaType=teaType;     
    }
    
    @Override
    void displayTeaType(){
        System.out.println("The type of tea is "+teaType);
    }
}

public class ArrayOfTeaObj {
    
    public static void main(String[] args) {
        Tea []teaObj = new Tea[4];
        teaObj[0]=new Tea("Basic Tea");
        teaObj[1]=new GreenTea("Green Tea");
        teaObj[2]=new HerbalTea("Herbal Tea");
        teaObj[3]=new BlackTea("Black Tea");

        teaObj[0].displayTeaType();
        teaObj[1].displayTeaType();
        teaObj[2].displayTeaType();
        teaObj[3].displayTeaType();
    }
}

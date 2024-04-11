package task10;

public class CircumferenceOfCircle {
    public int radius;
    public final float pi;
    public float circumference;

    public CircumferenceOfCircle()
    {
         pi=3.14f;
         radius =5;
    }
    public CircumferenceOfCircle(float pi, int radius)
    {
        this.pi=pi;
        this.radius=radius;
    }
    public static void main(String[] args) {
        CircumferenceOfCircle circumferenceWithoutArgs=new CircumferenceOfCircle();
        circumferenceWithoutArgs.calculateCircumference();
        System.out.printf("Circumference of the circle (without args in constructor): "+"%.2f",circumferenceWithoutArgs.circumference);
        System.out.println("");

        CircumferenceOfCircle circumferenceWithParam=new CircumferenceOfCircle(3.14f,5);
        circumferenceWithParam.calculateCircumference();
        System.out.printf("\nCircumference of the circle (with args in constructor): %.2f",circumferenceWithParam.circumference);
    }

    public float calculateCircumference()
    {
      circumference=2*pi*radius;
      return circumference;
    }
}

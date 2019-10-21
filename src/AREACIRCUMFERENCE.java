import Area.Area;

public class AREACIRCUMFERENCE {

    public static void main(String[] args) {

        Area area = new Area(8, 7, 5,"yellow");
        System.out.println("color is = "+area.getColor());
        System.out.println("AREA OF CIRCLE =" + " " + area.getAreaOfCircle());
        System.out.println("AREA OF RECTANGLE =" + " " + area.getAreaOfRectangle());
        System.out.println("CIRCUMFERENCE OF CIRCLE =" + " " + area.getCircumferenceOfCircle());
        System.out.println("CIRCUMFERENCE OF RECTANGLE =" + " " + area.getCircumferenceOfRectangle());
    }

}


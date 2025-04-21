abstract class Shape3D {
     abstract  double calculatevolume();
     abstract  double calculatesurfacearea();
}

class Sphere extends Shape3D {
    private double radius;
    public Sphere(double radius) {
        this.radius = radius;
    }
    public double calculatevolume() {
        return (4.0/3.0) * Math.PI * Math.pow(radius,3);
    }
    public double calculatesurfacearea() {
        return 4 * Math.PI * Math.pow(radius,2);
}
}
class Cube extends Shape3D{
    private double side;
    public Cube(double side) {
        this.side = side;
}
public double calculatevolume() {
    return Math.pow(side,3);
    }
    public double calculatesurfacearea() {
        return 6 * Math.pow(side,2);
    }
}
class Two{
    public static void main(String[] args) {
        System.out.println("Sreedurga rollno.:20");
        System.out.println("Section:A");
        Sphere sphere = new Sphere(5);
        Cube cube = new Cube(5);
        System.out.println("Sphere Volume: " + sphere.calculatevolume());
        System.out.println("Cube Volume: " + cube.calculatevolume());
        System.out.println("Sphere Surface Area: " + sphere.calculatesurfacearea());
        System.out.println("Cube Surface Area: " + cube.calculatesurfacearea());
        }
}
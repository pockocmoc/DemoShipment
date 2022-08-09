public class Box {
    private double width;
    private double heigth;
    private double depth;

    Box(Box ob) {
        width = ob.width;
        heigth = ob.heigth;
        depth = ob.depth;
    }
    Box(double w, double h, double d) {
        width = w;
        heigth = h;
        depth = d;
    }
    Box() {
        width = - 1;
        heigth = - 1;
        depth = - 1;

    }
    Box(double len) {
        width = heigth = depth = len;
    }
    double volume() {
        return width * heigth * depth;
    }
}

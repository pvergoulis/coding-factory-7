package gr.aueb.cf.ch14;

public class PointMain {

    public static void main(String[] args) {

//        Point point = new Point();
//        Point2D point2d = new Point2D();
//        Point3D point3d = new Point3D();

        Point p1 = new Point();
        Point p2 = new Point2D();
        Point p3 = new Point3D();

        doPrint(p2);
        doPrint(p3);

        p2.movePlus1();
        p2.movePlus10();

        p3.movePlus10();

        ((Point2D) p2).setY(15);

//        doMovePlus10(point);
//        doMovePlus10(point2d);
//        doMovePlus10(point3d);


    }

    public static void doMovePlus10(Point point){
        point.movePlus10();
    }


    public static void doPrint(Point point){
        System.out.println(point.toString());
    }
}

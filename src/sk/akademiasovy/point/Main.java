package sk.akademiasovy.point;

public class Main {
    public static void main(String[] args) {
        Point p1=new Point(3,11);
        System.out.println("Point p1 is in "+p1.getQuadrant()+" quadrant");
        Point p2= new Point();
        p2.generateRandomCoord();
        System.out.println("Point p2 is in "+p2.getQuadrant()+" quadrant");
        p2.printInfo();
        System.out.println("Distance between p1 and p2 is "+p1.getDistanceFromOtherPoint(p2));

        // 3D
        Point3D p4=new Point3D(5,7,3);
        Point3D p5=new Point3D();
        p5.generateRandomCoord();
        p4.printInfo();
        p5.printInfo();
        System.out.println("Distance between p4 and p5 is "+p4.getDistanceFromOtherPoint(p4));
        Object o1=new Point();
        Point p3=new Point3D(5,7,3);

        System.out.println(p3.getDistance());
        Point3D p6=(Point3D)p3;
        ((Point3D) p3).test();  // pretypovanie

        Geometry g1;
        g1=new Point(6,-5);
        ((Point)g1).printInfo();

        Geometry[] arr=new Geometry[10];
        int i;
        for(i=0;i<10;i++){
            Point3D p=new Point3D();
            p.generateRandomCoord();
            arr[i]=p;
        }
        for(Geometry g:arr){
            ((Point3D)g).printInfo();
        }

    }
}
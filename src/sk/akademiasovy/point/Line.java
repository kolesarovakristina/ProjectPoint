package sk.akademiasovy.point;

public class Line {
    private Point a;
    private Point b;

    public Line (Point a, Point b){
        this.a=a;
        this.b=b;
    }

    public Line(int xa, int ya,int xb,int yb){

        a= new Point(xa,ya); //this.a
        b= new Point(xb,yb); // this.b

    }
    public double getLength(){
        return a.getDistanceFromOtherPoint(b);
    }

    public Point getMiddlePointOfLine(){
        return new Point((a.getX()+b.getX())/2,(a.getY()+b.getY()));
    }
    public boolean isParallelToTheAxisX(){
         return a.getY()==b.getY();
    }
    public boolean isParallelToTheAxisY(){
         return a.getX()==b.getX();
    }
}

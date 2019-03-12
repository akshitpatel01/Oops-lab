package lab5;

import static java.lang.Math.abs;

public class Quadrilateral {
    int x1,x2,x3,x4,y1,y2,y3,y4;



    public Quadrilateral(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.y4 = y4;
    }

    public float printArea(){
        float area;
        area = (float)(x1*y2+x2*y3+x3*y4+x4*y1-x2*y1-x3*y2-x4*y3-x1*y4)/(float)2;
        area = abs(area);
        return area;
    }

}

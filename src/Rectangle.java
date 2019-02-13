public class Rectangle {



    private double length;
    private double width;


    public double getWidth(){
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double blue) {
        this.length = blue;
    }

    public void setWidth(double red) {
        this.width = red;
    }

    public double getArea(){
        return length * width;
    }

    public double getDiagonal(){
       return  Math.sqrt((length * length) + (width * width));
    }

    public boolean isSquare(){
        if (length == width){
            return true;
        }
        return false;
    }
}

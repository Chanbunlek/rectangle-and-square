class Rectange {
    private double width;
    private double length;

    public Rectange( double width, double length ) {
        System.out.println( "Rectange area is : " + getArea( width, length ));
        System.out.println( "Rectangle perimeter : " + getPerimeter( width, length ));
    }

    public Rectange( double side ) {
        System.out.println( "Sqaure area is : " + getArea(side));
        System.out.println( "Square perimeter : " + getPerimeter(side));
    }
    
    public double getArea( double width, double length ) {
        return width * length;
    }

    public double getPerimeter( double width, double length ) {
        return 2 * ( width + length );
    }

    public double getArea( double side ) {
        return side * side;
    }

    public double getPerimeter( double side ) {
        return side * 4;
    }
}

class Square extends Rectange {
    public Square( double side ) {
        super( side );
    }
}

public class Rectangle_and_Square {
    public static void main( String[] args ) {
        new Square( 10 );
        new Rectange( 10, 5 );
    }
}
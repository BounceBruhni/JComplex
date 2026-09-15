public class ComplexInt {
    //attributes:
    private final int real;
    private final int imaginary;
    //Constructors:
    ComplexInt(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    ComplexInt(int real) {
        this.real = real;
        this.imaginary = 0;
    }
    ComplexInt() {
        this.real = 0;
        this.imaginary = 0;
    }
    //Instance-Methods:
    public int ComplexReal() {
        return real;
    }
    public int ComplexImaginary() {
        return imaginary;
    }
    //returns Cartesian Coordinates of a Complex number
    public int[]  ComplexArray() {
        return new int[] {real, imaginary};
    }
    public ComplexInt ComplexConjugate() { return new ComplexInt(real, -imaginary);}
    public int Scale() {
        return (int) Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imaginary, 2));}
    //ComplexReciprocal can be called by an Instance of ComplexInt x and returns 1/x
    public ComplexInt ComplexReciprocal() {
        return new ComplexInt(this.real / this.Scale(), -this.imaginary / this.Scale());
    }
    public int[] CartesianToPolarInt() {
        //when is ComplexNumber < 0?
        boolean re = this.real < 0;
        boolean im = this.imaginary < 0;
        int alpha = 0;
        if (re && im) {
            alpha = (int) ((int) Math.atan(this.imaginary / this.real) + Math.PI);}
        else {
            alpha = (int) Math.atan(this.imaginary / this.real);}

        return new int[] {this.Scale(), alpha};
    }
    //static Methods:
    public static ComplexInt PolarToCartesianInt(int[] polar) throws IllegalArgumentException {
        if (polar.length != 2) {
            throw new IllegalArgumentException();}
        else {
            return new ComplexInt((int)(polar[0]*Math.cos(polar[1])), (int)Math.sin(polar[1]));}
    }
    /*takes 2 ComplexInt-Objects, each in the form a +ib, as an Input*/
    public static ComplexInt AddComplexInt(ComplexInt number1, ComplexInt number2) {
        return new ComplexInt((number1.real + number2.real), (number1.imaginary + number2.imaginary));
    }
    public static ComplexInt SubtractComplexInt(ComplexInt number1, ComplexInt number2) {
        return new ComplexInt((number1.real - number2.real), (number1.imaginary - number2.imaginary));
    }
    public static ComplexInt MultiplyComplexInt(ComplexInt number1, ComplexInt number2) {
        return new ComplexInt((number1.real*number2.real-number1.imaginary*number2.imaginary),
                (number1.real* number2.imaginary+ number2.real* number1.imaginary));
    }
    public static ComplexInt DivideComplexInt(ComplexInt dividend, ComplexInt divisor) {
        return MultiplyComplexInt(dividend, divisor.ComplexReciprocal());
    }
}

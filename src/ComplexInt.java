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
    //Methods:
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
    public static ComplexInt DivideComplexInt(ComplexInt number1, ComplexInt number2) {
        return new ComplexInt();
    }
}

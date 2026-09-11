public class ComplexInt {
    //attributes:
    int real;
    int imaginary;
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
    public int ComplexReal(ComplexInt number) {
        return number.real;
    }
    public int ComplexImaginary(ComplexInt number) {
        return number.imaginary;
    }
    //returns Cartesian Coordinates of a Complex number
    public int[]  ComplexArray(ComplexInt number) {
        return new int[] {number.real, number.imaginary};
    }
    public ComplexInt ComplexConjugate(ComplexInt number) {
        return new ComplexInt(number.real, -(number.imaginary));
    }
    /*takes to Complex Integers, each in the form a +ib, as an Input*/
    public ComplexInt AddComplexInt(ComplexInt number1, ComplexInt number2) {
        return new ComplexInt((number1.real + number2.real), (number1.imaginary + number2.imaginary));
    }
    public ComplexInt SubtractComplexInt(ComplexInt number1, ComplexInt number2) {
        return new ComplexInt((number1.real - number2.real), (number1.imaginary - number2.imaginary));
    }
    public ComplexInt MultiplyComplexInt(ComplexInt number1, ComplexInt number2) {
        return new ComplexInt();
    }
    public ComplexInt DivideComplexInt(ComplexInt number1, ComplexInt number2) {
        return new ComplexInt();
    }
}

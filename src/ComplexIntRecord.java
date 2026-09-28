public record ComplexIntRecord(int real, int imaginary) {

    //returns Cartesian Coordinates of a Complex number
    public int[]  ComplexArray() {return new int[] {real, imaginary};}
    public ComplexInt ComplexConjugate() { return new ComplexInt(real, -imaginary);}
}

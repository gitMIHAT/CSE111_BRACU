public class ComplexNumber extends RealNumber {
        public double Imaginary;
    public ComplexNumber(){
        super(1.0);
        Imaginary=1.0;
    }
    public ComplexNumber(double a ,double b ){
        super(a);
        Imaginary=b;
    }
    public String details(){
        return super.getReal() +"\nIImaginaryPart: "+Imaginary;

    }

}

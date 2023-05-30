package LabRTS_1;

public class ComplexNumbers {

    private double real;
    private double imaginary;

    public ComplexNumbers(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumbers add(ComplexNumbers other) {
        double sumReal = this.real + other.real;
        double sumImaginary = this.imaginary + other.imaginary;
        return new ComplexNumbers(sumReal, sumImaginary);
    }

    public ComplexNumbers multiply(ComplexNumbers other) {
        double productReal = this.real * other.real - this.imaginary * other.imaginary;
        double productImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumbers(productReal, productImaginary);
    }

    public String toString() {
        return this.real + "+" + this.imaginary + "i";
    }

    public static void main(String[] args) {
        ComplexNumbers num1 = new ComplexNumbers(2, 5);
        ComplexNumbers num2 = new ComplexNumbers(4, -1);

        ComplexNumbers sum = num1.add(num2);
        ComplexNumbers product = num1.multiply(num2);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}

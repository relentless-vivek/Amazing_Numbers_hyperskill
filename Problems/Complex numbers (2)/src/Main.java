class Complex {

    double real;
    double image;

    public void add(Complex num) {
        this.real += num.real;
        this.image += num.image;
    }

    public void subtract(Complex num) {
        this.real = this.real - num.real;
        this.image = this.image - num.image;
    }
}
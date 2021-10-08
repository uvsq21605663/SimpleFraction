public class Fraction
{
	private double num;
    private double deno;
    
	public Fraction(double num, double deno) {
        this.num = num;
        this.deno = deno;
    }
    
    @Override
    public String toString() {
        return "Le numérateur est : " + num + "\nLe dénominateur est : " + deno;
    }
}

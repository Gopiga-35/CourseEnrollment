package enrollment;

public class PremiumStudent extends Student {
    public PremiumStudent(String id, String name) {
        super(id, name);
    }

    public double applyDiscount(double fee) {
        return fee * 0.8;
    }

    public String toString() {
        return super.toString() + " (Premium)";
    }
}

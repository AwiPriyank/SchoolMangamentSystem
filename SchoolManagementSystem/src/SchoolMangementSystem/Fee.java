package SchoolMangementSystem;

public class Fee {
    int studentId;
    int classId;
    double amount;
    boolean isPaid;

    public Fee(int studentId, int classId, double amount, boolean isPaid) {
        this.studentId = studentId;
        this.classId = classId;
        this.amount = amount;
        this.isPaid = isPaid;
    
        // Check if the fee amount is positive
        if (amount <= 0) {
            throw new IllegalArgumentException("Fee amount must be positive.");
        }
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }

    @Override
    public String toString() {
        return "Fee [studentId=" + studentId + ", classId=" + classId + ", amount=" + amount + ", isPaid=" + isPaid + "]";
    }
    
    
}

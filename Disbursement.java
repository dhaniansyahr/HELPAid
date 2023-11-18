import java.util.Date;

public class Disbursement {
    private Date disbursementDate;
    private int cashAmount;
    private int goodsDisbursed;

    public Disbursement(Date disbursementDate, int cashAmount, int goodsDisbursed) {
        this.disbursementDate = disbursementDate;
        this.cashAmount = cashAmount;
        this.goodsDisbursed = goodsDisbursed;
    }

    public Date getDisbursementDate() {
        return disbursementDate;
    }

    public int getCashAmount() {
        return cashAmount;
    }

    public int getGoodsDisbursed() {
        return goodsDisbursed;
    }
}

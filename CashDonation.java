import java.util.Date;

public class CashDonation extends Contribution {
    private int amount;
    private String paymentChannel;
    private String refrenceNo;

    public CashDonation(int amount, String paymentChannel, String refrenceNo, Date receivedDate,
            String contributionID) {
        super(receivedDate, contributionID);
        this.amount = amount;
        this.paymentChannel = paymentChannel;
        this.refrenceNo = refrenceNo;
    }

    public int getAmount() {
        return amount;
    }

    public String getPaymentChannel() {
        return paymentChannel;
    }

    public String getRefrenceNo() {
        return refrenceNo;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPaymentChannel(String paymentChannel) {
        this.paymentChannel = paymentChannel;
    }

    public void setRefrenceNo(String refrenceNo) {
        this.refrenceNo = refrenceNo;
    }
}

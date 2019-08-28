package GaiaProjectAppService.models.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "Payment_Detail", schema = "GaiaDatabase", catalog = "")
public class PaymentDetail {
    private int idPaymentDtl;
    private int idStaff;
    private Date paymentDate;
    private double grossAmount;
    private double netAmount;
    private Staff staffByIdStaff;

    @Id
    @Column(name = "id_payment_dtl", nullable = false)
    public int getIdPaymentDtl() {
        return idPaymentDtl;
    }

    public void setIdPaymentDtl(int idPaymentDtl) {
        this.idPaymentDtl = idPaymentDtl;
    }

    @Basic
    @Column(name = "id_staff", nullable = false)
    public int getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(int idStaff) {
        this.idStaff = idStaff;
    }

    @Basic
    @Column(name = "payment_date", nullable = false)
    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Basic
    @Column(name = "gross_amount", nullable = false, precision = 0)
    public double getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(double grossAmount) {
        this.grossAmount = grossAmount;
    }

    @Basic
    @Column(name = "net_amount", nullable = false, precision = 0)
    public double getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(double netAmount) {
        this.netAmount = netAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentDetail that = (PaymentDetail) o;
        return idPaymentDtl == that.idPaymentDtl &&
                idStaff == that.idStaff &&
                Double.compare(that.grossAmount, grossAmount) == 0 &&
                Double.compare(that.netAmount, netAmount) == 0 &&
                Objects.equals(paymentDate, that.paymentDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPaymentDtl, idStaff, paymentDate, grossAmount, netAmount);
    }

    @ManyToOne
    @JoinColumn(name = "id_staff", referencedColumnName = "id_staff", nullable = false , insertable = false, updatable = false)
    public Staff getStaffByIdStaff() {
        return staffByIdStaff;
    }

    public void setStaffByIdStaff(Staff staffByIdStaff) {
        this.staffByIdStaff = staffByIdStaff;
    }
}

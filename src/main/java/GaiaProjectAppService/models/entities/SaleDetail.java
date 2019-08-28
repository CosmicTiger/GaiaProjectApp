package GaiaProjectAppService.models.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Sale_Detail", schema = "GaiaDatabase")
public class SaleDetail {
    private int idSaleDetail;
    private int idSale;
    private int idMerchandising;
    private double amount;
    private int quantity;
    private double discount;
    private Sale saleByIdSale;
    private Merchandising merchandisingByIdMerchandising;

    @Id
    @Column(name = "id_sale_detail", nullable = false)
    public int getIdSaleDetail() {
        return idSaleDetail;
    }

    public void setIdSaleDetail(int idSaleDetail) {
        this.idSaleDetail = idSaleDetail;
    }

    @Basic
    @Column(name = "id_sale", nullable = false)
    public int getIdSale() {
        return idSale;
    }

    public void setIdSale(int idSale) {
        this.idSale = idSale;
    }

    @Basic
    @Column(name = "id_merchandising", nullable = false)
    public int getIdMerchandising() {
        return idMerchandising;
    }

    public void setIdMerchandising(int idMerchandising) {
        this.idMerchandising = idMerchandising;
    }

    @Basic
    @Column(name = "amount", nullable = false, precision = 0)
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "quantity", nullable = false)
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "discount", nullable = false, precision = 0)
    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaleDetail that = (SaleDetail) o;
        return idSaleDetail == that.idSaleDetail &&
                idSale == that.idSale &&
                idMerchandising == that.idMerchandising &&
                Double.compare(that.amount, amount) == 0 &&
                quantity == that.quantity &&
                Double.compare(that.discount, discount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSaleDetail, idSale, idMerchandising, amount, quantity, discount);
    }

    @ManyToOne
    @JoinColumn(name = "id_sale", referencedColumnName = "id_sale", nullable = false , insertable = false, updatable = false)
    public Sale getSaleByIdSale() {
        return saleByIdSale;
    }

    public void setSaleByIdSale(Sale saleByIdSale) {
        this.saleByIdSale = saleByIdSale;
    }

    @ManyToOne
    @JoinColumn(name = "id_merchandising", referencedColumnName = "id_merchandising", nullable = false , insertable = false, updatable = false)
    public Merchandising getMerchandisingByIdMerchandising() {
        return merchandisingByIdMerchandising;
    }

    public void setMerchandisingByIdMerchandising(Merchandising merchandisingByIdMerchandising) {
        this.merchandisingByIdMerchandising = merchandisingByIdMerchandising;
    }
}

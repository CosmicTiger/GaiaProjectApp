package GaiaProjectAppService.models.entities;

import java.util.Objects;

public class SaleDetail {
    private int idSaleDetail;
    private int idSale;
    private int idMerchandising;
    private double amount;
    private int quantity;
    private double discount;
    private Sale saleByIdSale;
    private Merchandising merchandisingByIdMerchandising;

    public int getIdSaleDetail() {
        return idSaleDetail;
    }

    public void setIdSaleDetail(int idSaleDetail) {
        this.idSaleDetail = idSaleDetail;
    }

    public int getIdSale() {
        return idSale;
    }

    public void setIdSale(int idSale) {
        this.idSale = idSale;
    }

    public int getIdMerchandising() {
        return idMerchandising;
    }

    public void setIdMerchandising(int idMerchandising) {
        this.idMerchandising = idMerchandising;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

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

    public Sale getSaleByIdSale() {
        return saleByIdSale;
    }

    public void setSaleByIdSale(Sale saleByIdSale) {
        this.saleByIdSale = saleByIdSale;
    }

    public Merchandising getMerchandisingByIdMerchandising() {
        return merchandisingByIdMerchandising;
    }

    public void setMerchandisingByIdMerchandising(Merchandising merchandisingByIdMerchandising) {
        this.merchandisingByIdMerchandising = merchandisingByIdMerchandising;
    }
}

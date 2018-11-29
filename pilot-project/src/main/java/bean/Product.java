package bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "product", uniqueConstraints = { @UniqueConstraint(columnNames = "IDPRODUCT") })
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idProduct;
	private String productName;
	private Integer quantity;
	@Temporal(value = TemporalType.DATE)
	private Date openingForSale;
	private String avatar;
	
	@Transient
	private String brandName;
	
	@Transient 
	private Brand brand;
	
	@Transient
	private boolean changedAvatar;

	public Integer getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Integer idProduct) {
		this.idProduct = idProduct;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Date getOpeningForSale() {
		return openingForSale;
	}

	public void setOpeningForSale(Date openingForSale) {
		this.openingForSale = openingForSale;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public boolean isChangedAvatar() {
		return changedAvatar;
	}

	public void setChangedAvatar(boolean changedAvatar) {
		this.changedAvatar = changedAvatar;
	}
}

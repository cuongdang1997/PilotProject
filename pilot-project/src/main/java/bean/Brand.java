package bean;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "brand", uniqueConstraints = { @UniqueConstraint(columnNames = "IDBRAND") })
public class Brand {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idBrand;
	private String brandName;
	private String logo;
	private String description;
	
	@Transient
	private Set<Product> products;
	
	public Integer getIdBrand() {
		return idBrand;
	}
	public void setIdBrand(Integer idBrand) {
		this.idBrand = idBrand;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
}

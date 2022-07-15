package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="category")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cid")
	int cId;
	@Column(name="cname")
	String catName;
	
	@OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
	List<Product> product;

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	public void addProduct(Product tempProduct)
	{
		if(product == null)
		{
			product = new ArrayList<Product>();
		}
		product.add(tempProduct);
	}
	
}

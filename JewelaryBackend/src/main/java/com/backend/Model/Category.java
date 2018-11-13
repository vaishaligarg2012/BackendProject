package com.backend.Model;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Categories")
public class Category {
	
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CatID")
	 private int Id;
	private String categoryDesc;
	private String categoryName;
    
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="category")
	private List<Product> products=new ArrayList<Product>();
	
     public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	 public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryDesc() {
		return categoryDesc;
	}
	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}
	
     
}

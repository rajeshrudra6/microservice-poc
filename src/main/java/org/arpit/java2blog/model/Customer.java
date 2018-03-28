
package org.arpit.java2blog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * This is our model class and it corresponds to Customer table in database
 */
@Entity
@Table(name="CUSTOMER")
public class Customer{

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="brand")
	private String brand; 

	@Column(name="model")
	private String model;
	
	@Column(name="processorSpeed")
	private double processorSpeed;
    
	@Column(name="ram")
    private int ram;
     
	@Column(name="diskCapacity")
    private int diskCapacity;
    
	@Column(name="price")
    private double price;

	public Customer() {
		super();
	}

	public Customer(int id, String brand, String model, double processorSpeed, int ram, int diskCapacity,
			double price) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.processorSpeed = processorSpeed;
		this.ram = ram;
		this.diskCapacity = diskCapacity;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getProcessorSpeed() {
		return processorSpeed;
	}

	public void setProcessorSpeed(double processorSpeed) {
		this.processorSpeed = processorSpeed;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getDiskCapacity() {
		return diskCapacity;
	}

	public void setDiskCapacity(int diskCapacity) {
		this.diskCapacity = diskCapacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

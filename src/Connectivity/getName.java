package Connectivity;

public class getName {

	private int staffID;
	private String CustomerCode;
	private String Name;
	private String Price;
	private String Code;

	public getName(String name, String price, String code) {
		super();
		Name = name;
		Price = price;
		Code = code;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	public getName(String customerCode) {
		super();
		CustomerCode = customerCode;
	}

	public String getCustomerCode() {
		return CustomerCode;
	}

	public void setCustomerCode(String customerCode) {
		CustomerCode = customerCode;
	}

	public int getStaffID() {
		return staffID;
	}

	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}

	public getName(int string) {
		super();
		this.staffID = string;
	}	
	
}

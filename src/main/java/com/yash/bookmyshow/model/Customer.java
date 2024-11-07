package com.yash.bookmyshow.model;

	public class Customer {

	    private int customerId;
	    private String name;
	    private String email;
	    private String password;
	    private String address;
	    
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		@Override
		public String toString() {
			return "Customer [customerId=" + customerId + ", name=" + name + ", email=" + email + ", password="
					+ password + ", address=" + address + "]";
		}
		public Customer(int customerId, String name, String email, String password, String address) {
			super();
			this.customerId = customerId;
			this.name = name;
			this.email = email;
			this.password = password;
			this.address = address;
		}
		
		public Customer() {
			super();
			// TODO Auto-generated constructor stub
		}

	   
	    
		
	}

package com.tnisf.orderservice;
   import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;

	@Entity

public class Order {
		@Id
		@Column(name="oid")
	private int Orderid;
		@Column(name="Oname")
	private String Ordername;
		@Column(name="Oaddress")
	private String Orderaddress;
		@Column(name="Ocontact")
	private int Ordercontactnum;
		@Column(name="Oemail")
	private String OrderEmail;
		
		@Column(name="ODeliverydate")
		private String OrderDeliverydate;
		public int getOrderid() {
			return Orderid;
		}
		public void setOrderid(int orderid) {
			Orderid = orderid;
		}
		public String getOrdername() {
			return Ordername;
		}
		public void setOrdername(String ordername) {
			Ordername = ordername;
		}
		public String getOrderaddress() {
			return Orderaddress;
		}
		public void setOrderaddress(String orderaddress) {
			Orderaddress = orderaddress;
		}
		public int getOrdercontactnum() {
			return Ordercontactnum;
		}
		public void setOrdercontactnum(int ordercontactnum) {
			Ordercontactnum = ordercontactnum;
		}
		public String getOrderEmail() {
			return OrderEmail;
		}
		public void setOrderEmail(String orderEmail) {
			OrderEmail = orderEmail;
		}
		public String getOrderDeliverydate() {
			return OrderDeliverydate;
		}
		public void setOrderDeliverydate(String orderDeliverydate) {
			OrderDeliverydate = orderDeliverydate;
		}
		@Override
		public String toString() {
			return "Order [Orderid=" + Orderid + ", Ordername=" + Ordername + ", Orderaddress=" + Orderaddress
					+ ", Ordercontactnum=" + Ordercontactnum + ", OrderEmail=" + OrderEmail + ", OrderDeliverydate="
					+ OrderDeliverydate + "]";
	}
		
		
}
package com.revature.ems.model;

import javax.annotation.PostConstruct;

public class ContactDetails {
		private String mobileNumber;
		private String alternateMobileNumber;
		private String spouseNumber;

		public ContactDetails() {
			// TODO Auto-generated constructor stub
		}
		@PostConstruct
		public void dd() {
			System.out.println("######CONTACT init called");
		}

		public ContactDetails(String mobileNumber, String alternateMobileNumber, String spouseNumber) {
			this.mobileNumber = mobileNumber;
			this.alternateMobileNumber = alternateMobileNumber;
			this.spouseNumber = spouseNumber;
		}

		public String getMobileNumber() {
			return mobileNumber;
		}

		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}

		public String getAlternateMobileNumber() {
			return alternateMobileNumber;
		}

		public void setAlternateMobileNumber(String alternateMobileNumber) {
			this.alternateMobileNumber = alternateMobileNumber;
		}

		public String getSpouseNumber() {
			return spouseNumber;
		}

		public void setSpouseNumber(String spouseNumber) {
			this.spouseNumber = spouseNumber;
		}

		@Override
		public String toString() {
			return "ContactDetails [mobileNumber=" + mobileNumber + ", alternateMobileNumber=" + alternateMobileNumber
					+ ", spouseNumber=" + spouseNumber + "]";
		}
		
		
}

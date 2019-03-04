package com.twilio;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;



public class Sms {

	public static final String ACCOUNT_SID="xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
	public static final String AUTH_TOKEN="xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
	
	public static void main(String[] args) {
	
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		Message msg= Message.creator(new PhoneNumber("+91xxxxxxxxx"), new PhoneNumber("sender"), "msg").create();

		System.out.println(msg.getSid());

	}

}

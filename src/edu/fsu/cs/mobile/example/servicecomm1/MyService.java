package edu.fsu.cs.mobile.example.servicecomm1;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;

public class MyService extends IntentService {

	public MyService() {
		super("MyService");
	}

	@Override
	protected void onHandleIntent(Intent intent) {

		int i;
		
		int LIMIT = 100000000;
		
		Bundle extras = intent.getExtras();
		
		if(extras != null)
		{
			if(extras.getString("myaction").equals("loop"))
				for(i = 0; i < LIMIT; i++);
		}
		
		Intent myIntent = new Intent(this, MyReceiver.class);
		sendBroadcast(myIntent);
	}
}

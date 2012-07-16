package edu.fsu.cs.mobile.example.servicecomm1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
	    Toast.makeText(context, "Broadcast Received, Work Completed", Toast.LENGTH_LONG).show();
	}

}

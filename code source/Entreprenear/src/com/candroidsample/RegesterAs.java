package com.candroidsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.arabmobilechanllenge.entreprenear.R;

public class RegesterAs extends FragmentActivity implements OnClickListener {

	Button  go;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register_as);
		
		go=(Button)this.findViewById(R.id.go);
		go.setOnClickListener(this);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		return true;
	}

	@Override
	public void onClick(View v) {
		if(v==go){
			Intent intent = new Intent(RegesterAs.this, Login.class);
		    startActivity(intent);
		}
		
	}
}

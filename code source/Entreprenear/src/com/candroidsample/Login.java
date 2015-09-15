package com.candroidsample;



import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.arabmobilechanllenge.entreprenear.R;

public class Login extends FragmentActivity implements OnClickListener {

	Button log_in, forget_pwd;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		log_in=(Button)this.findViewById(R.id.log_in);
		log_in.setOnClickListener(this);
		forget_pwd=(Button)this.findViewById(R.id.forget_pwd);
		forget_pwd.setOnClickListener(this);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		return true;
	}

	@Override
	public void onClick(View v) {
		if(v==log_in){
			Intent intent = new Intent(Login.this, Profil.class);
		    startActivity(intent);
		}
		else if(v==forget_pwd){
			
			;
			
		}
		
	}

}

package com.candroidsample;



import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.arabmobilechanllenge.entreprenear.R;

public class MainActivity extends FragmentActivity implements OnClickListener {

	Button signin, join;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		signin=(Button)this.findViewById(R.id.signin);
		signin.setOnClickListener(this);
		join=(Button)this.findViewById(R.id.join);
		join.setOnClickListener(this);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		return true;
	}

	@Override
	public void onClick(View v) {
		if(v==signin){
			Intent intent = new Intent(MainActivity.this, RegesterAs.class);
		    startActivity(intent);
		}
		else if(v==join){
			
			Intent intent = new Intent(MainActivity.this, RegesterAs.class);
		    startActivity(intent);
			
		}
		
	}

}

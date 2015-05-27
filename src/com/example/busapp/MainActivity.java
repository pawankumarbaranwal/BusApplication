package com.example.busapp;


import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.LinearLayout;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements OnLongClickListener {
	LinearLayout datePicker;
	final Context context=this;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d("heloo", "h");
		ActionBar ab =getSupportActionBar(); 
		ab.setDisplayShowHomeEnabled(true);
		ab.setIcon(R.drawable.ic_launcher);
		setContentView(R.layout.activity_main);
		datePicker = (LinearLayout)findViewById(R.id.datePickerLayout);
		datePicker.setOnLongClickListener(this);
		//setOnLongClickListener(new View.OnLongClickListener() {
		/*   @Override
		    public boolean onLongClick(View arg0) {
		        // TODO Auto-generated method stub  
		    	return true;
		    }
		});*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
		//		MenuInflater inflater = getMenuInflater();
		//        inflater.inflate(R.menu.activity_main_actions, menu);
		// 
		//        return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	@Override
	public boolean onLongClick(View v) {
	/*	if (v==datePicker) {
			Toast.makeText(context, "pp", Toast.LENGTH_SHORT).show();
			return true;
		}else{
			return false;				
		}*/
		Toast.makeText(context, "pp", Toast.LENGTH_LONG).show();
		return true;
	}

}

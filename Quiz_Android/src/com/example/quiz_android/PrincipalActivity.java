package com.example.quiz_android;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PrincipalActivity extends Activity {
	
	private Button Jogar;

	private OnClickListener onclick = new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			
			Intent intent = new Intent(PrincipalActivity.this, PerguntaUmActivity.class);
			
		
			startActivity(intent);
		
		}
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_principal);
	
		Jogar=(Button) findViewById(R.id.btnJogar);
		Jogar.setOnClickListener(onclick);
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.principal, menu);
		return true;
	}

}

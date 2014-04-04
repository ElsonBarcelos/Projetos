package com.example.quiz;

import com.example.test.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PrincipalActivity extends Activity {

	Button jogar;

	private OnClickListener onclick = new OnClickListener() {

		@Override
		public void onClick(View v) {
			Intent intent = new Intent(PrincipalActivity.this,
					JogarActivity.class);

			startActivity(intent);

		}
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_principal);

		jogar = (Button) findViewById(R.id.btnJogar);
		jogar.setOnClickListener(onclick);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.principal, menu);
		return true;

	}

}

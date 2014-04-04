package com.example.quiz;

import com.example.test.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class TelaCincoActivity extends Activity {

	private Button fim;
	int score;

	private OnClickListener onclick = new OnClickListener() {

		@Override
		public void onClick(View v) {
			//teste().show();
			Intent intent = new Intent(TelaCincoActivity.this,
					FimActivity.class);

			int radioselecionado = ((RadioGroup) findViewById(R.id.radioGroupQ5))
					.getCheckedRadioButtonId();

			switch (radioselecionado) {
			case (R.id.radio1QuestaoCinco):
				respostaErrada().show();
				break;

			case (R.id.radio2QuestaoCinco):
				score++;
				respostaCerta().show();
				break;

			case (R.id.radio3QuestaoCinco):
				respostaErrada().show();
				break;

			case (R.id.radio4QuestaoCinco):
				respostaErrada().show();
				break;

			}
			intent.putExtra("Score", score);
			startActivity(intent);

		}
	};

	public Toast respostaErrada() {
		Context context = getApplicationContext();
		CharSequence text = "Errado";
		int duration = Toast.LENGTH_SHORT;
		Toast toast = Toast.makeText(context, text, duration);
		
		return toast;

	}

	public Toast respostaCerta() {
		Context context = getApplicationContext();
		CharSequence text = "Certo";
		int duration = Toast.LENGTH_SHORT;
		Toast toast = Toast.makeText(context, text, duration);
		
		return toast;
	}
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela_cinco);

		score = this.getIntent().getIntExtra("Score", score);
		fim = (Button) findViewById(R.id.btnFim);
		fim.setOnClickListener(onclick);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela_cinco, menu);
		return true;
	}

}

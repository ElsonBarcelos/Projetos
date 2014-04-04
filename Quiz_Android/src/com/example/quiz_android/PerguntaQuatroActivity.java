package com.example.quiz_android;

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

public class PerguntaQuatroActivity extends Activity {
	private Button proximo4;
	int score;

	private OnClickListener onclick = new OnClickListener() {

		@Override
		public void onClick(View arg0) {
			Intent intent = new Intent(PerguntaQuatroActivity.this,
					PerguntaCincoActivity.class);

			int radioselecionado = ((RadioGroup) findViewById(R.id.radioGroupQ4))
					.getCheckedRadioButtonId();

			switch (radioselecionado) {
			case (R.id.radio1PerguntaQuatro):
				respostaErrada().show();
				break;
			case (R.id.radio2PerguntaQuatro):
				respostaErrada().show();
				break;
			case (R.id.radio3PerguntaQuatro):
				respostaErrada().show();
				break;

			case (R.id.radio4PerguntaQuatro):
				score++;
				respostaCerta().show();
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
		setContentView(R.layout.activity_pergunta_quatro);

		score = this.getIntent().getIntExtra("Score", score);
		proximo4 = (Button) findViewById(R.id.btnProximo4);
		proximo4.setOnClickListener(onclick);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pergunta_quatro, menu);
		return true;
	}

}

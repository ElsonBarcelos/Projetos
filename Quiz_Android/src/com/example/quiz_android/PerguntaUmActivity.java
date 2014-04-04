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

public class PerguntaUmActivity extends Activity {
	
	private Button proximo;
	int score;
	
	private OnClickListener onclick= new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			 
			Intent intent = new Intent(PerguntaUmActivity.this, PerguntaDoisActivity.class);
			
			int radioselecionado= ((RadioGroup) findViewById(R.id.radioGroupQ1)).getCheckedRadioButtonId();
			
			switch(radioselecionado){
			
			case(R.id.radio1PerguntaUm):
				respostaErrada().show(); 
				break;
			
			case(R.id.radio2PerguntaUm):
				respostaErrada().show();
				break;
				
			case(R.id.radio3PerguntaUm):	
				score++;
				respostaCerta().show();
				break;
			case(R.id.radio4PerguntaUm):
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
		setContentView(R.layout.activity_pergunta_um);
	
	proximo=(Button)findViewById(R.id.btnProximo);
	proximo.setOnClickListener(onclick);
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pergunta_um, menu);
		return true;
	}

}

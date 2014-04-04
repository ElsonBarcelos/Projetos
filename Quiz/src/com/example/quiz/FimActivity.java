package com.example.quiz;

import com.example.test.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class FimActivity extends Activity {
	 Button sair;
	int score;
	TextView resultado;
	String result;

	
	private OnClickListener onclick = new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		
		Intent intent = new Intent(Intent.ACTION_MAIN);

        intent.addCategory(Intent.CATEGORY_HOME);

        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        startActivity(intent);
	}
};
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fim);

		score = this.getIntent().getIntExtra("Score", score);
		result="Você acertou "+ Integer.toString(score);
		resultado= (TextView) findViewById(R.id.Resultado);
		resultado.setText(result);
		sair=(Button)findViewById(R.id.BtnSair);
		sair.setOnClickListener(onclick);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fim, menu);
		return true;
	}

}

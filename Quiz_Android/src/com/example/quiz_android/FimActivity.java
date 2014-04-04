package com.example.quiz_android;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class FimActivity extends Activity {
private Button sair;
int score;
TextView resultado;
String result;
private Button jogarnovamente;


private OnClickListener onclick= new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		
		Intent intent = new Intent(Intent.ACTION_MAIN);

        intent.addCategory(Intent.CATEGORY_HOME);

        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        startActivity(intent);
        	
        
        
		
	}
};

private OnClickListener onclick2= new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {

        Intent intent2=new Intent(FimActivity.this,PrincipalActivity.class);
        	startActivity(intent2);
        
		
	}
};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fim);
	
		score = this.getIntent().getIntExtra("Score", score);
		result= "Você Acertou " + Integer.toString(score);
		resultado=(TextView) findViewById(R.id.Resultado);
		resultado.setText(result);
		sair=(Button)findViewById(R.id.btnSair);
		sair.setOnClickListener(onclick);
		jogarnovamente=(Button)findViewById(R.id.btnJogarNovamente);
		jogarnovamente.setOnClickListener(onclick2);
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fim, menu);
		return true;
	}

}

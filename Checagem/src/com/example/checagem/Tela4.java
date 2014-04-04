package com.example.checagem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Tela4 extends Activity {
	
	OnClickListener trocar2= new OnClickListener(){
		public void onClick(View v){
			
			int cont3=0;
			
			final CheckBox checkBox = (CheckBox) findViewById(R.id.cel);
			final CheckBox checkBox2= (CheckBox) findViewById(R.id.not);
			final CheckBox checkBox3 = (CheckBox) findViewById(R.id.tablet);
			final CheckBox checkBox4 = (CheckBox) findViewById(R.id.game);
			
			
			if(checkBox.isChecked()){  
				  cont3++;
				}
			if(checkBox2.isChecked()){  
				   cont3++;
				   }
			if(checkBox3.isChecked()){   
				cont3++;
				}
			if(checkBox4.isChecked()){  
					cont3++;
			}
			
			if(cont3==4){
				 Toast.makeText(Tela4.this, "todos foram marcados", Toast.LENGTH_SHORT).show();
			}
			
			
			
			
		}};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela4);
		CheckBox a= (CheckBox) findViewById(R.id.cel);
		CheckBox b= (CheckBox) findViewById(R.id.not);
		CheckBox c= (CheckBox) findViewById(R.id.tablet);
		CheckBox d= (CheckBox) findViewById(R.id.game);
		
		a.setOnClickListener(trocar2);
		b.setOnClickListener(trocar2);
		c.setOnClickListener(trocar2);
		d.setOnClickListener(trocar2);
		

		
		

		
		
	
	}

}

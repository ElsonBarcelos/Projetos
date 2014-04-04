package com.example.checagem;











import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TabHost;
import android.widget.Toast;

public class Tela2 extends Activity{

	
	
	
	
	OnClickListener contar2= new OnClickListener(){
		
		private View view;
	public void onClick(View v){
		int cont=0;
		
		final CheckBox checkBox = (CheckBox) findViewById(R.id.camisa);
		final CheckBox checkBox2= (CheckBox) findViewById(R.id.bermuda);
		final CheckBox checkBox3 = (CheckBox) findViewById(R.id.cueca);
		final CheckBox checkBox4 = (CheckBox) findViewById(R.id.sapato);
		final CheckBox checkBox5 = (CheckBox) findViewById(R.id.meia);
		final CheckBox checkBox6 = (CheckBox) findViewById(R.id.livro);
		final CheckBox checkBox7 = (CheckBox) findViewById(R.id.bone);
		final CheckBox checkBox8 = (CheckBox) findViewById(R.id.sandalia);
		
		if(checkBox.isChecked()){  
			
			  cont++;
			}
		if(checkBox2.isChecked()){  
			   cont++;
			   }
		if(checkBox3.isChecked()){   
			cont++;
			}
		if(checkBox4.isChecked()){  
				cont++;
		}
		if(checkBox5.isChecked()){  
			  cont++;
			}
		if(checkBox6.isChecked()){  
			   cont++;
			}
		if(checkBox7.isChecked()){  
			 cont++;
	}
		if(checkBox8.isChecked()){  
			  cont++;
			}
		if(cont==8){
			 Toast.makeText(Tela2.this, "todos foram marcados", Toast.LENGTH_SHORT).show();
			 
		}
		 		
			
		
	}
	};
		
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela2);
		
		CheckBox a= (CheckBox) findViewById(R.id.camisa);
		CheckBox b= (CheckBox) findViewById(R.id.bermuda);
		CheckBox c= (CheckBox) findViewById(R.id.cueca);
		CheckBox d= (CheckBox) findViewById(R.id.sapato);
		CheckBox e= (CheckBox) findViewById(R.id.meia);
		CheckBox f= (CheckBox) findViewById(R.id.bone);
		CheckBox h= (CheckBox) findViewById(R.id.sandalia);
		CheckBox g= (CheckBox) findViewById(R.id.livro);
		
		
		a.setOnClickListener(contar2);
		b.setOnClickListener(contar2);
		c.setOnClickListener(contar2);
		d.setOnClickListener(contar2);
		e.setOnClickListener(contar2);
		f.setOnClickListener(contar2);
		g.setOnClickListener(contar2);
		h.setOnClickListener(contar2);
		
	}
	

	protected int getCheckedCheckBoxId() {
		// TODO Auto-generated method stub
		return 0;
	}
	}

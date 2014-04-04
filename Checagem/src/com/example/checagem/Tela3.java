package com.example.checagem;




import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Tela3 extends Activity{

OnClickListener checa= new OnClickListener(){
		
		private View view;
	public void onClick(View v){
		int cont=0;
		
		final CheckBox checkBox = (CheckBox) findViewById(R.id.escova);
		final CheckBox checkBox2= (CheckBox) findViewById(R.id.escova2);
		final CheckBox checkBox3 = (CheckBox) findViewById(R.id.pasta);
		final CheckBox checkBox4 = (CheckBox) findViewById(R.id.shampoo);
		final CheckBox checkBox5 = (CheckBox) findViewById(R.id.condicionador);
		final CheckBox checkBox6 = (CheckBox) findViewById(R.id.sabonete);
		final CheckBox checkBox7 = (CheckBox) findViewById(R.id.desodorante);
		final CheckBox checkBox8 = (CheckBox) findViewById(R.id.creme);
		final CheckBox checkBox9 = (CheckBox) findViewById(R.id.contonete);
		final CheckBox checkBox10 = (CheckBox) findViewById(R.id.perfume);
		final CheckBox checkBox11 = (CheckBox) findViewById(R.id.barba);
		final CheckBox checkBox12 = (CheckBox) findViewById(R.id.prestobarba);
		final CheckBox checkBox13 = (CheckBox) findViewById(R.id.papel);
		final CheckBox checkBox14 = (CheckBox) findViewById(R.id.protetor);
		final CheckBox checkBox15 = (CheckBox) findViewById(R.id.listerine);
		final CheckBox checkBox16 = (CheckBox) findViewById(R.id.bronze);
			
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
		if(checkBox9.isChecked()){  
			  cont++;
			}
		if(checkBox10.isChecked()){  
			   cont++;
			   }
		if(checkBox11.isChecked()){   
			cont++;
			}
		if(checkBox12.isChecked()){  
				cont++;
		}
		if(checkBox13.isChecked()){  
			  cont++;
			}
		if(checkBox14.isChecked()){  
			   cont++;
			}
		if(checkBox15.isChecked()){  
			 cont++;
	}
		if(checkBox16.isChecked()){  
			  cont++;
			}
		if(cont==16){
			 Toast.makeText(Tela3.this, "todos foram marcados", Toast.LENGTH_SHORT).show();
		}
		
			
		
			
			
	
	
	}
	private void putExtras(Bundle param) {
		// TODO Auto-generated method stub
		
	}};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela3);
		CheckBox a= (CheckBox) findViewById(R.id.escova);
		CheckBox b= (CheckBox) findViewById(R.id.escova2);
		CheckBox c= (CheckBox) findViewById(R.id.pasta);
		CheckBox d= (CheckBox) findViewById(R.id.shampoo);
		CheckBox e= (CheckBox) findViewById(R.id.condicionador);
		CheckBox f= (CheckBox) findViewById(R.id.sabonete);
		CheckBox g= (CheckBox) findViewById(R.id.desodorante);
		CheckBox h= (CheckBox) findViewById(R.id.creme);
		CheckBox i= (CheckBox) findViewById(R.id.contonete);
		CheckBox j= (CheckBox) findViewById(R.id.perfume);
		CheckBox k= (CheckBox) findViewById(R.id.barba);
		CheckBox l= (CheckBox) findViewById(R.id.prestobarba);
		CheckBox m= (CheckBox) findViewById(R.id.papel);
		CheckBox n= (CheckBox) findViewById(R.id.protetor);
		CheckBox o= (CheckBox) findViewById(R.id.listerine);
		CheckBox p= (CheckBox) findViewById(R.id.bronze);
		
		a.setOnClickListener(checa);
		b.setOnClickListener(checa);
		c.setOnClickListener(checa);
		d.setOnClickListener(checa);
		e.setOnClickListener(checa);
		f.setOnClickListener(checa);
		g.setOnClickListener(checa);
		h.setOnClickListener(checa);
		i.setOnClickListener(checa);
		j.setOnClickListener(checa);
		k.setOnClickListener(checa);
		l.setOnClickListener(checa);
		m.setOnClickListener(checa);
		n.setOnClickListener(checa);
		o.setOnClickListener(checa);
		p.setOnClickListener(checa);
		
		
	
	
	}



}

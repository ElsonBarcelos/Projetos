package com.example.checagem;

import com.example.checagem.R.id;

import android.os.Bundle;
import android.app.Activity;
import android.app.TabActivity;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.Toast;
import android.widget.TabHost.TabSpec;
import android.widget.TabWidget;
import android.widget.TextView;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {
	/** Called when the activity is first created. */
	public static TabHost tabHost;
	public TabSpec tabSpec1;
	public TabSpec tabSpec2;
	public TabSpec tabSpec3;
	public Intent intent1, intent2, intent3;
	
	public void onCreate1(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela2);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		boolean result = super.onCreateOptionsMenu(menu);
		super.onCreateOptionsMenu(menu);
		
		menu.add(0, 1, 0, "Marcar todos!");
		menu.add(0, 2, 0, "Desmarcar todos!");

		return result;

	}
	
	
	
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
			CheckBox checkBox = (CheckBox) findViewById(R.id.camisa);
			checkBox.setChecked(false);
			Toast.makeText(MainActivity.this, "todos foram marcados",
			Toast.LENGTH_SHORT).show();
	
			return super.onOptionsItemSelected(item);

	}

	
	
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		try {
			setContentView(R.layout.activity_main);

			tabHost = getTabHost();
			tabSpec1 = tabHost.newTabSpec("tid1");
			tabSpec2 = tabHost.newTabSpec("tid2");
			tabSpec3 = tabHost.newTabSpec("tid3");

			intent1 = new Intent().setClass(this, Tela2.class);
			tabSpec1.setIndicator("Acessórios").setContent(intent1);
			tabHost.addTab(tabSpec1);

			intent2 = new Intent().setClass(this, Tela3.class);
			tabSpec2.setIndicator("Higiene Pessoal").setContent(intent2);
			tabHost.addTab(tabSpec2);

			intent3 = new Intent().setClass(this, Tela4.class);
			tabSpec3.setIndicator("eletrônicos").setContent(intent3);
			tabHost.addTab(tabSpec3);

		} catch (Exception ex) {

		}

	}

}

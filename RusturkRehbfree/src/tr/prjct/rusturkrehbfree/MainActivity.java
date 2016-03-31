package tr.prjct.rusturkrehbfree;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import ru.prjct.rusturkrehbfree.R;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		final Button karsilasma = (Button) findViewById(R.id.karsilasma);
		final Button sayilar = (Button) findViewById(R.id.sayilar);
		final Button gunler = (Button) findViewById(R.id.gunler);
		final Button aylar = (Button) findViewById(R.id.aylar);
		final Button kelime = (Button) findViewById(R.id.kelime);
		final Button tanisma = (Button) findViewById(R.id.tanisma);
		final Button ozurler = (Button) findViewById(R.id.ozurler);
		final Button varista = (Button) findViewById(R.id.varista);
		final Button sehirde = (Button) findViewById(R.id.sehirde);
		final Button otelde = (Button) findViewById(R.id.otelde);
		final Button restoran = (Button) findViewById(R.id.restoran);
		final Button taksi = (Button) findViewById(R.id.taksi);
		final Button gezi = (Button) findViewById(R.id.gezi);
		final Button alis = (Button) findViewById(R.id.alis);
		final Button doktor = (Button) findViewById(R.id.doktor);
		final Button seyahat = (Button) findViewById(R.id.seyahat);
		final Button arkadas = (Button) findViewById(R.id.arkadas);
		final Button prilgtln = (Button) findViewById(R.id.prilgtln);
		final Button tsveta = (Button) findViewById(R.id.tsveta);
		final Button telo = (Button) findViewById(R.id.telo);


OnClickListener kelime_click = new OnClickListener()
		
		{


			@Override
			public void onClick(View v) {
			
			Intent i = new Intent();
			 i.setClass(getApplicationContext(),Kelemlr.class);
			 startActivity(i);	
			}
		
		};
OnClickListener doktor_click = new OnClickListener()
		
		{


			@Override
			public void onClick(View v) {
			
			Intent i = new Intent();
			 i.setClass(getApplicationContext(),Doktor.class);
			 startActivity(i);	
			}
		
		};
OnClickListener aylar_click = new OnClickListener()
		
		{


			@Override
			public void onClick(View v) {
			
			Intent i = new Intent();
			 i.setClass(getApplicationContext(),Meseats.class);
			 startActivity(i);	
			}
		
		};
OnClickListener ozurler_click = new OnClickListener()
		
		{


			@Override
			public void onClick(View v) {
			
			Intent i = new Intent();
			 i.setClass(getApplicationContext(),Izvin.class);
			 startActivity(i);	
			}
		
		};
OnClickListener taksi_click = new OnClickListener()
		
		{


			@Override
			public void onClick(View v) {
			
			Intent i = new Intent();
			 i.setClass(getApplicationContext(),Taksi.class);
			 startActivity(i);	
			}
		
		};
OnClickListener alis_click = new OnClickListener()
		
		{


			@Override
			public void onClick(View v) {
			
			Intent i = new Intent();
			 i.setClass(getApplicationContext(),Pokupki.class);
			 startActivity(i);	
			}
		
		};
OnClickListener seyahat_click = new OnClickListener()
		
		{


			@Override
			public void onClick(View v) {
			
			Intent i = new Intent();
			 i.setClass(getApplicationContext(),Put.class);
			 startActivity(i);	
			}
		
		};
		
		OnClickListener restoran_click = new OnClickListener()
		
		{


			@Override
			public void onClick(View v) {
			
			Intent i = new Intent();
			 i.setClass(getApplicationContext(),Restoran.class);
			 startActivity(i);	
			}
		
		};
OnClickListener arkadas_click = new OnClickListener()
		
		{


			@Override
			public void onClick(View v) {
			
			Intent i = new Intent();
			 i.setClass(getApplicationContext(),Drug.class);
			 startActivity(i);	
			}
		
		};
		OnClickListener gezi_click = new OnClickListener()
		
		{


			@Override
			public void onClick(View v) {
			
			Intent i = new Intent();
			 i.setClass(getApplicationContext(),Putesh.class);
			 startActivity(i);	
			}
		
		};
OnClickListener otel_click = new OnClickListener()
		
		{


			@Override
			public void onClick(View v) {
			
			Intent i = new Intent();
			 i.setClass(getApplicationContext(),Otel.class);
			 startActivity(i);	
			}
		
		};
		OnClickListener button_click = new OnClickListener()
		
		{


			@Override
			public void onClick(View v) {
			
			Intent i = new Intent();
			 i.setClass(getApplicationContext(),Cisla.class);
			 startActivity(i);	
			}
		
		};
		OnClickListener gunler_click = new OnClickListener()
		{


			@Override
			public void onClick(View v) {
			
			Intent i = new Intent();
			 i.setClass(getApplicationContext(),Vremea.class);
			 startActivity(i);	
			}
		
		};
		
		
					

					OnClickListener tanisma_click = new OnClickListener()
					
					{


						@Override
						public void onClick(View v) {
						
						Intent i = new Intent();
						 i.setClass(getApplicationContext(),Znakomstv.class);
						 startActivity(i);	
						}
					
					};

					
					OnClickListener varista_click = new OnClickListener()
					
					{


						@Override
						public void onClick(View v) {
						
						Intent i = new Intent();
						 i.setClass(getApplicationContext(),Tamojn.class);
						 startActivity(i);	
						}
					
					};
					OnClickListener sehirde_click = new OnClickListener()
					
					{


						@Override
						public void onClick(View v) {
						
						Intent i = new Intent();
						 i.setClass(getApplicationContext(),Gorod.class);
						 startActivity(i);	
						}
					
					};
					
					
					
          
					
					
					
					
					
					
					OnClickListener karsilasma_click = new OnClickListener()
					
					{


						@Override
						public void onClick(View v) {
						
						Intent i = new Intent();
						 i.setClass(getApplicationContext(),Privetstv.class);
						 startActivity(i);	
						}
					
					};
					
					OnClickListener prilagatln_click = new OnClickListener()
					
					{


						@Override
						public void onClick(View v) {
						
						Intent i = new Intent();
						 i.setClass(getApplicationContext(),Prilagateln.class);
						 startActivity(i);	
						}
					
					};
OnClickListener tsveta_click = new OnClickListener()
					
					{


						@Override
						public void onClick(View v) {
						
						Intent i = new Intent();
						 i.setClass(getApplicationContext(),Tsveta.class);
						 startActivity(i);	
						}
					
					};
OnClickListener telo_click = new OnClickListener()
					
					{


						@Override
						public void onClick(View v) {
						
						Intent i = new Intent();
						 i.setClass(getApplicationContext(),Telo.class);
						 startActivity(i);	
						}
					
					};
		telo.setOnClickListener(telo_click);			
		tsveta.setOnClickListener(tsveta_click);			
		prilgtln.setOnClickListener(prilagatln_click);			
		kelime.setOnClickListener(kelime_click);			
		doktor.setOnClickListener(doktor_click);			
		aylar.setOnClickListener(aylar_click);			
		ozurler.setOnClickListener(ozurler_click);			
		taksi.setOnClickListener(taksi_click);			
		alis.setOnClickListener(alis_click);			
		seyahat.setOnClickListener(seyahat_click);			
		restoran.setOnClickListener(restoran_click);			
		arkadas.setOnClickListener(arkadas_click);			
		gezi.setOnClickListener(gezi_click);			
		otelde.setOnClickListener(otel_click);
		karsilasma.setOnClickListener(karsilasma_click);
		gunler.setOnClickListener(gunler_click);
		sayilar.setOnClickListener(button_click);	
		tanisma.setOnClickListener(tanisma_click);
		varista.setOnClickListener(varista_click);
		sehirde.setOnClickListener(sehirde_click);	
	}

	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
		
		  public boolean onOptionsItemSelected(MenuItem item){
		        switch(item.getItemId()){
		        
		        
		        case R.id.pause:
		       
		        	Intent f = new Intent();
					 f.setClass(getApplicationContext(),About.class);
					 startActivity(f);
		        	
		                	       	
		           break;
		        case R.id.action_settings:
		               
		        	Intent i = new Intent();
					 i.setClass(getApplicationContext(),Support.class);
					 startActivity(i);
		             break;
		             
		        
		        }
		        	
		       
		       
		  
		   
		return true;
	}

}



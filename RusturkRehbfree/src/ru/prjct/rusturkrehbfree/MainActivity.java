package ru.prjct.rusturkrehbfree;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.appbrain.AppBrain;


public class MainActivity extends Activity {
	ListView list;
	String[] web = {
		"Приветствие" + '\n' + "и встреча",
			"Знакомствa",
			"На границе",
			"В городе",
			"Числа",
			"Цвета",
			"В отеле",
			"Путешествие",
			"Развлечения," + '\n' + "отдых",
			"В ресторане",
			"В пути",
			"Покупки",
			"Такси",
			"Извинения и" + '\n' + "благодарность",
			"Месяцы и" + '\n' + "времена года",
			"У врача, аптека",
			"Повседневные" + '\n' + "слова и фразы",
			"Прилагательные",
			"Дни недели" + '\n' + "и время",
			"Тело",
			"Парикмахерская",
			"Деловые контакты",
			"Полиция",
			"Комплименты",
			"Праздники",
			"Вопросы"
	} ;
	Integer[] imageId = {
			R.drawable.image1,
			R.drawable.image2,
			R.drawable.image3,
			R.drawable.image4,
			R.drawable.image5,
			R.drawable.image19,
			
			R.drawable.image7,
			R.drawable.image8,
			R.drawable.image9,
			R.drawable.image10,
			R.drawable.image11,
			R.drawable.image12,
			R.drawable.image13,
			R.drawable.image14,
			R.drawable.image15,
			R.drawable.image16,
			R.drawable.image17,
			R.drawable.image18,
			R.drawable.image6,
			R.drawable.image20,
			R.drawable.image21,
			R.drawable.image22,
			R.drawable.image23,
			R.drawable.image24,		
			R.drawable.image25,	
			R.drawable.image26,

	};
	public void onBackPressed() {
	    super.onBackPressed();
	    if (isFinishing()) {
	    	 Intent intent = new Intent(Intent.ACTION_MAIN);
	    	    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	    	    intent.addCategory(Intent.CATEGORY_HOME);
	    	    startActivity(intent);
	    	AppBrain.getAds().showInterstitial(this);
	    	
	    }
	}

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		CustomList adapter = new
				CustomList(MainActivity.this, web, imageId);
		list=(ListView)findViewById(R.id.list);
				list.setAdapter(adapter);
				list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

		            @Override
		            public void onItemClick(AdapterView<?> parent, View view,
		                                    int position, long id) {
		                if((int) id == 0){
		                	Intent i = new Intent();
		       			 i.setClass(getApplicationContext(),Unite1.class);
		       			 startActivity(i);	
		                	
		                	
		                }
		                if((int) id == 1){
		                	Intent i = new Intent();
		       			 i.setClass(getApplicationContext(),Unite2.class);
		       			 startActivity(i);	
		                	
		                	
		                }
		                if((int) id == 2){
		                	Intent i = new Intent();
		       			 i.setClass(getApplicationContext(),Unite3.class);
		       			 startActivity(i);	
		                	
		                	
		                }
		                if((int) id == 3){
		                	Intent i = new Intent();
		       			 i.setClass(getApplicationContext(),Unite4.class);
		       			 startActivity(i);	
		                	
		                	
		                }
		                if((int) id == 4){
		                	Intent i = new Intent();
		       			 i.setClass(getApplicationContext(),Unite5.class);
		       			 startActivity(i);	
		                	
		                	
		                }
		                if((int) id == 5){
		                	Intent i = new Intent();
		       			 i.setClass(getApplicationContext(),Unite6.class);
		       			 startActivity(i);	
		                	
		                	
		                }
		                if((int) id == 6){
		                	Intent i = new Intent();
		       			 i.setClass(getApplicationContext(),Otel.class);
		       			 startActivity(i);	
		                	
		                 }
		                if((int) id == 7){
		                	Intent i = new Intent();
		       			 i.setClass(getApplicationContext(),Putesh.class);
		       			 startActivity(i);	
		                	
		                	
		                }
		                if((int) id == 8){
		                	Intent i = new Intent();
		       			 i.setClass(getApplicationContext(),Drug.class);
		       			 startActivity(i);	
		                	
		                	
		                }
		                if((int) id == 9){
		                	Intent i = new Intent();
		       			 i.setClass(getApplicationContext(),Restoran.class);
		       			 startActivity(i);	
		                	
		                	
		                }
		                if((int) id == 10){
		                	Intent i = new Intent();
		       			 i.setClass(getApplicationContext(),Put.class);
		       			 startActivity(i);	
		                	
		                	
		                }
		                if((int) id == 11){
		                	Intent i = new Intent();
		       			 i.setClass(getApplicationContext(),Pokupki.class);
		       			 startActivity(i);	
		                	
		                	
		                }
		                if((int) id == 12){
		                	Intent i = new Intent();
		       			 i.setClass(getApplicationContext(),Taksi.class);
		       			 startActivity(i);	
		                	
		                	
		                }
		                if((int) id == 13){
		                	Intent i = new Intent();
		       			 i.setClass(getApplicationContext(),Izvin.class);
		       			 startActivity(i);	
		                	
		                	
		                }
		                if((int) id == 14){
		                	Intent i = new Intent();
		       			 i.setClass(getApplicationContext(),Meseats.class);
		       			 startActivity(i);	
		                	
		                	
		                }
		                if((int) id == 15){
		                	Intent i = new Intent();
		       			 i.setClass(getApplicationContext(),Doktor.class);
		       			 startActivity(i);	
		                	
		                	
		                }
		                if((int) id == 16){
		                	Intent i = new Intent();
		       			 i.setClass(getApplicationContext(),Kelemlr.class);
		       			 startActivity(i);	
		                	
		                	
		                }
		                if((int) id == 17){
		                	Intent i = new Intent();
		       			 i.setClass(getApplicationContext(),Prilagateln.class);
		       			 startActivity(i);	
		                	
		                	
		                }
		                if((int) id == 18){
		                	Intent i = new Intent();
		       			 i.setClass(getApplicationContext(),Vremea.class);
		       			 startActivity(i);	
		                	
		                	
		                }
		                if((int) id == 19){
		                	Intent i = new Intent();
		       			 i.setClass(getApplicationContext(),Telo.class);
		       			 startActivity(i);	
		                	
		                	
		                }
		                if((int) id == 20){
		                	Intent i = new Intent();
		       			 i.setClass(getApplicationContext(),Parik.class);
		       			 startActivity(i);	
		                	
		                	
		                }
		                if((int) id == 21){
		                	Intent i = new Intent();
		       			 i.setClass(getApplicationContext(),Biznes.class);
		       			 startActivity(i);	
		                	
		                	
		                }
		                if((int) id == 22){
		                	Intent i = new Intent();
		       			 i.setClass(getApplicationContext(),Polis.class);
		       			 startActivity(i);	
		                	
		                	
		                }
		                if((int) id == 23){
		                	Intent i = new Intent();
		       			 i.setClass(getApplicationContext(),Komplimenti.class);
		       			 startActivity(i);	
		                	
		                	
		                }
		                if((int) id == 24){
		                	Intent i = new Intent();
		       			 i.setClass(getApplicationContext(),Prazdniki.class);
		       			 startActivity(i);	
		       			 
		                			            }
		                if((int) id == 25){
		                	Intent i = new Intent();
		       			 i.setClass(getApplicationContext(),Voprosi.class);
		       			 startActivity(i);	
		                	
		            }
		            }
		        });

				
				
				
	}
			



	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
		
		  public boolean onOptionsItemSelected(MenuItem item){
		        switch(item.getItemId()){
		        
case R.id.share_menu:
			        
		        	Intent sharingIntent = new Intent(Intent.ACTION_SEND);
		        	sharingIntent.setType("text/plain");
		        	sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=ru.prjct.rusturkrehbfree");
		        	sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject");

		        	startActivity(Intent.createChooser(sharingIntent, getString(R.string.app_link)));
		        break;
		        case R.id.rate_menu:
		        	startActivity( new Intent( Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=ru.prjct.rusturkrehbfree") ) );
				    
		        
		        break;
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



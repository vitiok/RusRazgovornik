package ru.applct.trforallfree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import android.app.Activity;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;


public class Ders2slov extends Activity implements OnClickListener {


	final int[]  myMusic ={R.raw.anladinizmi,
			R.raw.anladinmi,
			R.raw.anlamadim,
			R.raw.anlamiyorum,
			R.raw.anliyorum,
			R.raw.anne,
			R.raw.aralik,
			R.raw.arkadas,
			R.raw.arkadasim,
			R.raw.arkadasmlyolc,
			R.raw.arkdnbirz,
			R.raw.asagi,
			R.raw.asansnerd,
			R.raw.asiltuketcn,
			R.raw.askhersusg,
			R.raw.askmsng,
			R.raw.asknaslsn,
			R.raw.asprnalblrm,
			R.raw.atsmvar,
			R.raw.austos,
			R.raw.ayak,
			R.raw.ayirmduzolj,
			R.raw.ayirmolc,
			R.raw.ayirmsagd,
			R.raw.ayirmsagdolsn,
			R.raw.ayirmsold,
			R.raw.ayirmyeml,
			R.raw.aylem,
			R.raw.aynnerd,
			R.raw.ayrmnsold,
			R.raw.baba,
			R.raw.bacak,
			R.raw.bagajlrmtsm,
			R.raw.bagajmasaygtrmltf,
			R.raw.bagjmasgtrmltf,
			R.raw.bakblrmz,
			R.raw.balik,
			R.raw.banabngstrb,
			R.raw.banagosrblrms,
			R.raw.banakiziyrm,
			R.raw.banasenlzm,
			R.raw.banasolbrmsn,
};
	final String rus[]= {"Хабер","Иште","Фена","Хош","Анне","Кыз","Кызым","Баба","Бабам","Ооул","Оолум","Куту","Лютфен","Кеди","Эвет","Ким?","Не?","Бен","Сен","О","Биз","Сиз","Онлар","Не абер?","Иилик, сенден не абер?","Эе иште, фена деилим","Хошча кал","Гюле гюле","Мераба анне, насылсын, ии мисин?","Иим кызым, сен насылсын?","Бен дэ чок иим аннеджим","Бабам насыл?","Бабам да чок ии кызым","Герющюрюз анне, хошча кал","Герющюрюз кызым, ии гюнлер",
			"Мераба оолум! Хош гельдин!","Хош булдук, аннеджим","Чок иим, я сен?","Бу бир куту","Мелих, лютфен, бу куту му?","Бу бир кеди!","Бу бир сюрприз!"};
	String namesr[] = {"Новость,весть","Вот","Плохо, дурной","Добро,приятно","Мать","Дочь","Моя дочь","Отец","Мой отец","Сын","Мой сын","Коробка","Пожалуйста","Кошка","Да","Кто?","Что?","Я","Ты","Он, она, оно","Мы","Вы","Они","Какие новости?","Хорошо а у тебя какие новости?","Да так не плохо","Счастливо оставаться","Пока-пока","Здравствуй мама как дела? Все хорошо?","Все хорошо дочка ты как?","И у меня все хорошо мамочка","Отец как?","И у отца хорошо дочка","Увидимся мама всего доброго","Увидимся дочка доброго тебе дня",
			"Здравствуй сын! добро пожаловать","Взаимно мама","Я здорово а ты как?","Это коробка","Мелих пожалуйста, это коробка?","Это кошка!","Это сюрприз!"};
	String names[] = {"Haber","İşte","Fena","Hoş","Anne","Kız","Kızım","Baba","Babam","Oğul","Oğlum","Kutu","Lütfen","Kedi","Evet","Kim?","Ne?","Ben","Sen","O","Biz","Siz","Onlar","Ne haber ?","İyilik, senden ne haber?","Eh işte, fena değilim","Hoşça kal","Güle güle","Merhaba anne, nasılsın, iyi misin?","İyim kızım, sen nasılsın?","Ben de çok iyiyim anneciğim","Babam nasıl ?","Babam da çok iyi kızım","Görüşürüz anne, hoşça kal","Görüşürüz kızım, iyi günler",
			"Merhaba, oğlum! Hoş geldin!","Hoş bulduk, anneciğim","Çok iyiyim, ya sen?","Bu bir kutu","Melih lütfen, bu kutu mu?","Bu bir kedi!","Bu bir sürpriz!"};
	
	  final String ATTRIBUTE_NAME_TEXT = "text";
	  final String ATTRIBUTE_NAME_TEXT1 = "checked";
	  final String ATTRIBUTE_NAME_TEXT2 = "checkefd";
	  
	  
		int tmp = 0,mNext=0,f=1,b=0,razmer;
		MediaPlayer mp;
	  ListView lvMain;
	  public boolean onKeyDown(int keyCode, KeyEvent event) {
		    if (keyCode == KeyEvent.KEYCODE_BACK) {
		    tmp=1;
	        f=0;	 
		    }
		    return super.onKeyDown(keyCode, event);

		}
	  OnCompletionListener mListener = new OnCompletionListener() {
		    @Override
		    public void onCompletion(MediaPlayer mp) {
		       
		    	mp.release();
		    	
		        startNextFile();
		    }

		};
		OnCompletionListener gListener = new OnCompletionListener() {
		    @Override
		    public void onCompletion(MediaPlayer mp) {
		    	
		    	mp.release();
		    	tmp=0;
		    	f=1;
		    }

		};
		
		

	  
	  
	  /** Called when the activity is first created. */
	  public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.main1);
	    FloatingActionButton actionButton = new FloatingActionButton.Builder(this) 	       
	      .withDrawable(getResources().getDrawable(R.drawable.pause))
	      .withButtonColor(Color.WHITE)
	      .withGravity(Gravity.BOTTOM | Gravity.RIGHT)
	      .withMargins(0, 0, 16, 16)
	      .create();
		   
	    // массивы данных
		   razmer=myMusic.length;
	    // упаковываем данные в понятную для адаптера структуру
	    ArrayList<Map<String, Object>> data = new ArrayList<Map<String, Object>>(
	        rus.length);
	    Map<String, Object> m;
	    for (int i = 0; i < rus.length; i++) {
	      m = new HashMap<String, Object>();
	      m.put(ATTRIBUTE_NAME_TEXT, names[i]);
	      m.put(ATTRIBUTE_NAME_TEXT1, namesr[i]);
	      m.put(ATTRIBUTE_NAME_TEXT2, rus[i]);

	      data.add(m);
	    }

	    // массив имен атрибутов, из которых будут читаться данные
	    String[] from = { ATTRIBUTE_NAME_TEXT, ATTRIBUTE_NAME_TEXT1,ATTRIBUTE_NAME_TEXT2 };
	    // массив ID View-компонентов, в которые будут вставлять данные
	    int[] to = { R.id.tvText, R.id.tvText1, R.id.tvText2, };

	    // создаем адаптер
	    SimpleAdapter sAdapter = new SimpleAdapter(this, data, R.layout.item,
	        from, to);

	    // определяем список и присваиваем ему адаптер
	    lvMain = (ListView) findViewById(R.id.lvMain);
	    lvMain.setAdapter(sAdapter);
	    
	    lvMain.setOnItemClickListener(new OnItemClickListener() {
		       public void onItemClick(AdapterView<?> parent  , View view,
		           int position, long id) {
		    	   
		    	   b=1;
			       	f=0;
			       	MediaPlayer mp = MediaPlayer.create(Ders2slov.this, myMusic[(int) id]);  
			       	mp.setOnCompletionListener(gListener);
			           mp.start();
			          b=0;
			          
			          tmp=0;
			          try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		       }
		       
		     });
	    
	    mp = MediaPlayer.create(Ders2slov.this, R.raw.merhab);
	 
	    actionButton.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	        	 f=1;
	        	
	        	 if (mp == null) {
	                 
	                 mp.setOnCompletionListener(mListener);
	                 
	             }

	             if(tmp==1){
	                 mp.pause();
	                 
	             tmp=0;    
	             }
	             else{
	             	
	             	startNextFile();
	            
	             }
	            
	           
	        		 
	        }
	        
	        });
	    
	     
	  
	  }

	  private void startNextFile() {
			if (mNext <= razmer-1 && f==1) {

				mp = MediaPlayer.create(Ders2slov.this, myMusic[mNext++]);
		       
		       mp.start();
		       mp.setOnCompletionListener(mListener);
		       tmp=1;
			if(mNext>razmer-1){
				f=0;
				mNext=0;
				tmp=0;
				
			}
			 if(b>1){
			    	
			    	mp.pause(); 
			    	 
			    	
			    }    
		}
	  }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}

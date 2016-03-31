package ru.prjct.rusturkrehbfree;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;


public class Privetstv extends Activity implements OnClickListener {

	final int[]  myMusic ={R.raw.meraba,R.raw.gunaydin,R.raw.iyigunlr,R.raw.iyiaksamlr,R.raw.iyigecelr,R.raw.tebrkedr,R.raw.iyitatlr,R.raw.iyisanslr,R.raw.iyiyolclkl,R.raw.iyidileklrml,R.raw.iyiiyilr,R.raw.mutlyilr,R.raw.nasilsin,R.raw.iyimtesekrl,R.raw.soylebol,R.raw.anne,R.raw.baba,R.raw.eskari,
			R.raw.eskoca,R.raw.erkekcocuk,R.raw.kzcocuk,R.raw.arkadas,R.raw.kariniznasil,R.raw.esiniznasil,R.raw.olunznsl,R.raw.kznnsl,R.raw.sonragorusurz,R.raw.yaringorusurz,R.raw.selamlar,R.raw.kocaniza,R.raw.kariniza,R.raw.oglunuza,R.raw.kiziniza,R.raw.hoscakaln,R.raw.gulegule,R.raw.ruscabiliyorms,R.raw.buradabirsruscb,R.raw.turkcebilimr,
			R.raw.anladinizmi,R.raw.anladinmi,R.raw.anliyorum,R.raw.anlamiyorum,R.raw.anladim,R.raw.anlamadim,R.raw.lutfendahayvsk,R.raw.dahayvaskonursanlab,R.raw.tekrarsoylmltf,R.raw.tekraredinltf,R.raw.ltfnonuyazrm,R.raw.bunubanatercedeb,R.raw.ben,R.raw.biz,R.raw.sen,R.raw.siz,R.raw.onlar,
			R.raw.istiyorum,R.raw.ricaediyrm,R.raw.buoneml,R.raw.bununacelvar};
	final String rus[]= {"Мераба","Гюн айдын","Ии гюнлэр","Ии акшамлар","Ии геджелер","Тебрик эдерим","Ии таатилер","Ии шанслар","Ии ёлджулуклар","Ии деликлеримле","Ии илар","Мутлу илар","Насыл сын?","Иим тешекюрлер.Сиз насылсыныз?","Шёйле бёйле","Ане","Баба","Ещ кары",
			"Ещ коджа","Еркек чоджук","Кыз чоджук","Аркадаш","Карыныз насыл?","Эщиниз насыл?","Оолунуз насыл?","Кызыныз насыл?","Сонра гёрюшюрюз","Ярын гёрюшюрюз","Селямлар","Коджаныза","Карыныза","Оолунуза","Кызыныза","Хошча калын","Гюле гюле","Русча билиёр мусунуз?","Бурада бириси русча билиёр му?","Тюркче билмиёрум",
			"Анладыныз мы?","Анладын мы?","Анлыёрум","Анламыёрум","Анладым","Анламадым","Лютфен даа яваш конушун","Даа яваш конушурсаныз анлаябилирим","Текрар сёйлермисиниз лютфен","Текрар эдин лютфен","Лютфен ону язармысыныз?","Буну бана терджюме едебилирмисиниз?","Бен","Биз","Сен","Сиз","Онлар",
			"Истиёрум..","Риджа эдиёрум","Бу ёнемли","Бунун аджелеси вар"};
	String names[] = {"Здравствуйте","Доброе утро","Добрый день","Добрый вечер","Спокойной ночи","Поздравляю","Хорошо провести выходные","Удачи","Счастливого пути","С наилучшими пожеланиями","С новым годом","Счастливых лет","Как поживаете?","Хорошо спасибо а вы?","Так себе","Мать","Отец","Жена",
			"Муж","Сын","Дочь","Друг","Как поживает ваша жена?","Как поживает ваш муж?","Как поживает ваш сын?","Как поживает ваша дочь?","Увидимся потом","Увидимся завтра","Передайте привет..","Мужу","Жене","Сыну","Дочери","До свидания","Пока","Вы говорите по-pусски?","Здесь кто нибудь говорит по-русски?","Я не говорю по-турецки",
			"Понимаете?","Понимаешь?","Понимаю","Я не понимаю","Я понял(a)","Я не понял(a)","Вы не могли бы говорить помедленнее?","Если вы говорите медленнее я понимаю","Не могли бы вы повторить пожалуйста","Повторите пожалуйста","Не могли бы вы написать это?","Не могли бы вы мне это перевести?","Я","Мы","Ты","Вы","Они",
			"Я хочу..","Мне бы хотелось","Это важно","Это срочно"};
	String namesr[] = {"Merhaba","Gün aydın","İyi günler","İyi akşamlar","İyi geceler","Tebrik ederim","İyi tatiler","İyi şanslar","İyi yolculuklar",
			"İyi dileklerimle","İyi yıllar","Mutlu yıllar","Nasılsın?","İyiyim teşekkürler,Siz nasılsınız?","Şöyle böyle","Anne","Baba","Eş karı","Eş koca","Erkek çocuk","Kız çocuk","Arkadaş","Karınız nasıl?","Eşiniz nasıl?","Oğlunuz nasıl?","Kızınız nasıl?","Sonra görüşürüz","Yarın görüşürüz",
			"...selamlar","Kocanıza", "Karınıza", "Oğlunuza", "Kızınıza","Hoşça kalın","Güle güle","Rusça biliyor musunuz?","Burada birisi rusça biliyor mu?","Turkçe bilmiyorum","Anladınız mı?","Anladın mı?",
			"Anlıyorum","Anlamıyorum","Anlаdım","Anlamadım","Lütfen, daha yavaş konuşun","Daha yavaş konuşursanız,anlayabilirim","Tekrar söyler misiniz, lütfen","Tekrar edin, lütfen","Lütfen, onu yazar mısınız?",
			"Bunu bana tercüme edebilir misiniz?","Ben","Biz","Sen","Siz","Onlar","… istiyorum","… rica ediyorum","Bu önemli","Bunun acelesi var"};
	final String ATTRIBUTE_NAME_TEXT = "text";
	  final String ATTRIBUTE_NAME_TEXT1 = "checked";
	  final String ATTRIBUTE_NAME_TEXT2 = "checkefd";

		int tmp = 0,mNext=0,f=1,b=0,razmer;
		MediaPlayer mp;
	  ListView lvMain;
	  public boolean onKeyDown(int keyCode, KeyEvent event) {
		    if (keyCode == KeyEvent.KEYCODE_BACK) {
		    	b=b+2;
	        	 Intent i = new Intent();
	  			 i.setClass(getApplicationContext(),MainActivity.class);
	  			 startActivity(i);
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
	    setContentView(R.layout.main);
	    
	    final  ImageButton next = (ImageButton)findViewById(R.id.next);
		   final  ImageButton play = (ImageButton)findViewById(R.id.play);
		   final  ImageButton back = (ImageButton)findViewById(R.id.back);
		   final TextView text = (TextView) findViewById(R.id.textView2);
		   text.setBackgroundResource(R.drawable.blue);
		   text.setText("Русско-турецкий разговорник");
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
		    	   text.setText("Русско-турецкий разговорник");

		    	   b=1;
			       	f=0;
			       	MediaPlayer mp = MediaPlayer.create(Privetstv.this, myMusic[(int) id]);  
			       	mp.setOnCompletionListener(gListener);
			           mp.start();
			          b=0;
			          play.setImageResource(R.drawable.play);
			          tmp=0;
			          try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		       }
		       
		     });
	    next.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
			    	b=b+2;		
	     	   Intent i = new Intent();
	 			 i.setClass(getApplicationContext(),Privetstv2.class);
	 			 startActivity(i);	
	        }
	    });   
	    mp = MediaPlayer.create(Privetstv.this, R.raw.iyiaksamlr);
	 
	    play.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	        	 f=1;
	        	
	        	 if (mp == null) {
	                 
	                 mp.setOnCompletionListener(mListener);
	                 
	             }

	             if(tmp==1){
	                 mp.pause();
	                 play.setImageResource(R.drawable.play);
	             tmp=0;    
	             }
	             else{
	             	
	             	startNextFile();
	            
	             }
	            
	           
	        		 
	        }
	        
	        });
	    
	    back.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
			    	b=b+2;		
	       	 Intent i = new Intent();
	 			 i.setClass(getApplicationContext(),Unite1.class);
	 			 startActivity(i);
	                   		 
	        }
	        
	        });
	  
	  
	  }

	  private void startNextFile() {
			if (mNext <= razmer-1 && f==1) {
		       final TextView text = (TextView) findViewById(R.id.textView2);
		       final  ImageButton play = (ImageButton)findViewById(R.id.play);

				
				text.setText(names[mNext]+ '\n' + namesr[mNext]+ '\n' + rus[mNext]);
				
				mp = MediaPlayer.create(Privetstv.this, myMusic[mNext++]);
		       
		       mp.start();
		       play.setImageResource(R.drawable.pause);
		       mp.setOnCompletionListener(mListener);
		       tmp=1;
			if(mNext>razmer-1){
				f=0;
				mNext=0;
				play.setImageResource(R.drawable.play);
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

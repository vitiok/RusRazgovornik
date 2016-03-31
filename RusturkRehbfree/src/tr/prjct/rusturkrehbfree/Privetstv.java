package tr.prjct.rusturkrehbfree;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActionBar.LayoutParams;
import android.content.Intent;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;

import ru.prjct.rusturkrehbfree.R;

public class Privetstv extends Activity {
	ScrollView scroll;
	private Button btn1;
	
	MediaPlayer mp;

	private int b=0;
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	    if (keyCode == KeyEvent.KEYCODE_BACK) {
	    	
	    	b=b+1;
	    }
	    return super.onKeyDown(keyCode, event);

	}
	
	
	
	OnCompletionListener gListener = new OnCompletionListener() {
  	    @Override
  	    public void onCompletion(MediaPlayer mp) {
  	       
  	    	mp.release();
  	   
  	        
  	    }

  	};
	OnCompletionListener mListener = new OnCompletionListener() {
	    @Override
	    public void onCompletion(MediaPlayer mp) {
	       
	    	mp.release();
	    	System.out.println(b);
	        startNextFile();
	    }

	};
	
	
	
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
private int i=0;

 int mNext=0,temp=0;
 



	/** Called when the activity is first created. 
	 * @return */
    @SuppressLint("NewApi")
    
    

    
	
public	boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
  }
  public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
        
        
        case R.id.play_all:
       
        
        	if(b==0){
        	    	b=b+1;
            	startNextFile();
        	     }
        	     
                	       	
           break;
        case R.id.pause_all:
               
        	if(b==1){
        		b=b+1;
        		startNextFile();
        		
        	}
        	 b=0;
             break;
             
        case R.id.Bilgileri_kontrol_et:
        	b=b+1;
        	Intent i = new Intent();
			 i.setClass(getApplicationContext(),Privetstv1.class);
			 startActivity(i);	
        	b=0;
             break;
        case R.id.kontrol:
        	b=b+1;
          	Intent f = new Intent();
        		 f.setClass(getApplicationContext(),Privetstv2.class);
        		 startActivity(f);	
          	b=0;
               break;
        }
        	
       
        return true;
  }
               
  
  
private void startNextFile() {
	
		if (mNext <= 58 && b==1) {
			btn1 = ((Button) findViewById(temp));
			btn1.setText(names[temp]);
	  		  btn1.setBackgroundResource(R.drawable.custom_btn_beige);
				
			btn1 = ((Button) findViewById(mNext));
		  btn1.setBackgroundResource(R.drawable.gri);
		  btn1.setText(names[mNext]+ '\n' + namesr[mNext]+ '\n' + rus[mNext]);
			
      	    temp=mNext;
	        MediaPlayer mp = MediaPlayer.create(this, myMusic[mNext++]);
	        mp.setOnCompletionListener(mListener);
	        mp.start();
		if(mNext>58){
			b=0;
			mNext=0;
		}
	       
	    if(b>1){
	    	
	    	mp.pause(); 
	    	 
	    	
	    }    
	 
		}
		   
	    	        }
					

		
  
    @SuppressLint("NewApi")
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        

        System.out.println(names.length);              
        
        
        
        ScrollView scroll = new ScrollView(this);
        scroll.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,
        	      LayoutParams.WRAP_CONTENT));
        
        
        
        TableLayout linLayout = new TableLayout(getApplicationContext());
       
       
        linLayout.setOrientation(TableLayout.VERTICAL);
        linLayout.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,
        	      LayoutParams.WRAP_CONTENT));  
        scroll.addView(linLayout,
        	      new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));

       scroll.setBackgroundResource(R.drawable.turk);
        	setContentView(scroll);
        
        	linLayout.setBackgroundResource(R.drawable.greyzz);
        	
        	
        
        
        for ( i = 0; i <= 58; i++) {
        	
            
           
            final Button btn = new Button(this,null,R.style.ButtonText);
           
            final TableRow row= new TableRow(this);
            TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT);
            row.setLayoutParams(lp);
            
           
            btn.setId(i);
            btn.setTextSize(25);
            btn.setGravity(Gravity.CENTER);
            btn.setBackgroundResource(R.drawable.custom_btn_beige); 
            
            row.addView(btn);
            
            linLayout.addView(row,i);
            final int id_ = btn.getId();
            btn.setText(names[i]);
            
           
            
            
            btn1 = ((Button) findViewById(id_));
           
            btn1.setOnClickListener(new View.OnClickListener() {
            
            	public void onClick(View view) {
            		b=b+1;
            		btn1 = ((Button) findViewById(temp));
            		btn1.setText(names[temp]);
            		btn1.setBackgroundResource(R.drawable.custom_btn_beige);
            		btn.setText(names[id_] + '\n' + namesr[id_]+ '\n' + rus[id_]);
                  		btn.setId(id_);
                	
          		  btn.setBackgroundResource(R.drawable.gri); 
          		temp=id_;
                    MediaPlayer mp = MediaPlayer.create(Privetstv.this, myMusic[id_]);  
                    mp.setOnCompletionListener(gListener);
                    mp.start();
               
          		          	  b=0;
            	}
            });
            
        }
        
       
    }
   

              
      

		
}

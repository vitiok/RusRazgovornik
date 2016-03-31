package ru.prjct.rusturkrehbfree;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;

public class Privetstv1 extends Activity {


	float otvet=0,score=0,total=0;
	int razmer,dogru=0,yanlis=0,flag=0;
	OnClickListener checkBoxListener;	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	    if (keyCode == KeyEvent.KEYCODE_BACK) {
	    	
        	 Intent i = new Intent();
  			 i.setClass(getApplicationContext(),MainActivity.class);
  			 startActivity(i);
	    }
	    return super.onKeyDown(keyCode, event);

	}
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bilgi);

		final int[]  myMusic ={R.raw.meraba,R.raw.gunaydin,R.raw.iyigunlr,R.raw.iyiaksamlr,R.raw.iyigecelr,R.raw.tebrkedr,R.raw.iyitatlr,R.raw.iyisanslr,R.raw.iyiyolclkl,R.raw.iyidileklrml,R.raw.iyiiyilr,R.raw.mutlyilr,R.raw.nasilsin,R.raw.iyimtesekrl,R.raw.soylebol,R.raw.anne,R.raw.baba,R.raw.eskari,
				R.raw.eskoca,R.raw.erkekcocuk,R.raw.kzcocuk,R.raw.arkadas,R.raw.kariniznasil,R.raw.esiniznasil,R.raw.olunznsl,R.raw.kznnsl,R.raw.sonragorusurz,R.raw.yaringorusurz,R.raw.selamlar,R.raw.kocaniza,R.raw.kariniza,R.raw.oglunuza,R.raw.kiziniza,R.raw.hoscakaln,R.raw.gulegule,R.raw.ruscabiliyorms,R.raw.buradabirsruscb,R.raw.turkcebilimr,
				R.raw.anladinizmi,R.raw.anladinmi,R.raw.anliyorum,R.raw.anlamiyorum,R.raw.anladim,R.raw.anlamadim,R.raw.lutfendahayvsk,R.raw.dahayvaskonursanlab,R.raw.tekrarsoylmltf,R.raw.tekraredinltf,R.raw.ltfnonuyazrm,R.raw.bunubanatercedeb,R.raw.ben,R.raw.biz,R.raw.sen,R.raw.siz,R.raw.onlar,
				R.raw.istiyorum,R.raw.ricaediyrm,R.raw.buoneml,R.raw.bununacelvar};
		final String rus[]= {"Мераба","Гюн айдын","Ии гюнлэр","Ии акшамлар","Ии геджелер","Тебрик эдерим","Ии таатилер","Ии шанслар","Ии ёлджулуклар","Ии деликлеримле","Ии илар","Мутлу илар","Насыл сын?","Иим тешекюрлер.Сиз насылсыныз?","Шёйле бёйле","Ане","Баба","Ещ кары",
				"Ещ коджа","Еркек чоджук","Кыз чоджук","Аркадаш","Карыныз насыл?","Эщиниз насыл?","Оолунуз насыл?","Кызыныз насыл?","Сонра гёрюшюрюз","Ярын гёрюшюрюз","Селямлар","Коджаныза","Карыныза","Оолунуза","Кызыныза","Хошча калын","Гюле гюле","Русча билиёр мусунуз?","Бурада бириси русча билиёр му?","Тюркче билмиёрум",
				"Анладыныз мы?","Анладын мы?","Анлыёрум","Анламыёрум","Анладым","Анламадым","Лютфен даа яваш конушун","Даа яваш конушурсаныз анлаябилирим","Текрар сёйлермисиниз лютфен","Текрар эдин лютфен","Лютфен ону язармысыныз?","Буну бана терджюме едебилирмисиниз?","Бен","Биз","Сен","Сиз","Онлар",
				"Истиёрум..","Риджа эдиёрум","Бу ёнемли","Бунун аджелеси вар"};
	final	String names[] = {"Здравствуйте","Доброе утро","Добрый день","Добрый вечер","Спокойной ночи","Поздравляю","Хорошо провести выходные","Удачи","Счастливого пути","С наилучшими пожеланиями","С новым годом","Счастливых лет","Как поживаете?","Хорошо спасибо а вы?","Так себе","Мать","Отец","Жена",
			"Муж","Сын","Дочь","Друг","Как поживает ваша жена?","Как поживает ваш муж?","Как поживает ваш сын?","Как поживает ваша дочь?","Увидимся потом","Увидимся завтра","Передайте привет..","Мужу","Жене","Сыну","Дочери","До свидания","Пока","Вы говорите по Русски?","Здесь кто нибудь говорит по русски?","Я не говорю по Турецки",
			"Понимаете?","Понимаешь?","Понимаю","Я не понимаю","Я понял(a)","Я не понял(a)","Вы не могли бы говорить помедленнее?","Если вы говорите медленнее я понимаю","Не могли бы вы повторить пожалуйста","Повторите пожалуйста","Не могли бы вы написать это?","Не могли бы вы мне это перевести?","Я","Мы","Ты","Вы","Они",
			"Я хочу..","Мне бы хотелось","Это важно","Это срочно"};

final String namesr[] = {"Merhaba","Gün aydın","İyi günler","İyi akşamlar","İyi geceler","Tebrik ederim","İyi tatiler","İyi şanslar","İyi yolculuklar",
		"İyi dileklerimle","İyi yıllar","Mutlu yıllar","Nasılsın?","İyiyim teşekkürler,Siz nasılsınız?","Şöyle böyle","Anne","Baba","Eş karı","Eş koca","Erkek çocuk","Kız çocuk","Arkadaş","Karınız nasıl?","Eşiniz nasıl?","Oğlunuz nasıl?","Kızınız nasıl?","Sonra görüşürüz","Yarın görüşürüz",
		"...selamlar","Kocanıza", "Karınıza", "Oğlunuza", "Kızınıza","Hoşça kalın","Güle güle","Rusça biliyor musunuz?","Burada birisi rusça biliyor mu?","Turkçe bilmiyorum","Anladınız mı?","Anladın mı?",
		"Anlıyorum","Anlamıyorum","Anlаdım","Anlamadım","Lütfen, daha yavaş konuşun","Daha yavaş konuşursanız,anlayabilirim","Tekrar söyler misiniz, lütfen","Tekrar edin, lütfen","Lütfen, onu yazar mısınız?",
		"Bunu bana tercüme edebilir misiniz?","Ben","Biz","Sen","Siz","Onlar","… istiyorum","… rica ediyorum","Bu önemli","Bunun acelesi var"};

final int[] temp = new int[4];
final  ImageButton next = (ImageButton)findViewById(R.id.play);
final  ImageButton right = (ImageButton)findViewById(R.id.next);
final  ImageButton back = (ImageButton)findViewById(R.id.back);
final Button btn1 = (Button) findViewById(R.id.button1);
final Button btn2 = (Button) findViewById(R.id.button2);
final Button btn3 = (Button) findViewById(R.id.button3);
final TextView text = (TextView) findViewById(R.id.textView1);
final CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
final TextView toplm = (TextView) findViewById(R.id.textView2);	    

razmer=namesr.length;
btn1.getBackground().setAlpha(5);
btn2.getBackground().setAlpha(5);
btn3.getBackground().setAlpha(5);
 next.getBackground().setAlpha(25);
 right.getBackground().setAlpha(25);
 back.getBackground().setAlpha(25);

checkBox1.setText("tr");
int rNumber,g;

 final OnCompletionListener gListener = new OnCompletionListener() {
		    @Override
		    public void onCompletion(MediaPlayer mp) {
		       
		    	mp.release();
		    	
		    }

		};

right.setOnClickListener(new View.OnClickListener() {
    public void onClick(View v) {
 	   
    	Intent i = new Intent();
			 i.setClass(getApplicationContext(),Privetstv3.class);
			 startActivity(i);	
    
    }
});   

back.setOnClickListener(new View.OnClickListener() {
    public void onClick(View v) {
 	   
    	Intent i = new Intent();
			 i.setClass(getApplicationContext(),Privetstv2.class);
			 startActivity(i);	
    
    }
});   





 checkBoxListener = new OnClickListener(){


			public void onClick(View v)
		{
				if(checkBox1.isChecked()== true){
				 
					checkBox1.setText("ru");
				
				}	
				else if(checkBox1.isChecked()== false){
				checkBox1.setText("tr");
		}
				}
		};
	Random numGen = new Random();
    rNumber = numGen.nextInt(razmer);
	btn1.setText(names[rNumber]);						
	temp[0]=rNumber;
	System.out.println(temp[0]);
	
	Random numGen1 = new Random();
    rNumber = numGen1.nextInt(razmer);
	btn2.setText(names[rNumber]);					
	temp[1]=rNumber;
	System.out.println(temp[1]);
	Random numGen2 = new Random();
    rNumber = numGen2.nextInt(razmer);
	btn3.setText(names[rNumber]);
	temp[2]=rNumber;
	
	Random numGen3 = new Random();
    g = numGen3.nextInt(3);
    
	temp[3]=temp[g];
	
	text.setText(namesr[temp[g]] + "\n" + rus[temp[g]]);


	OnClickListener next_click = new OnClickListener()

{


	
	
	@Override
	public void onClick(View v) {
		int rNumber,g;
		flag=0;
		if(checkBox1.isChecked()==true)
		{
			btn1.setBackgroundDrawable(getResources().getDrawable(android.R.drawable.btn_default));
			btn2.setBackgroundDrawable(getResources().getDrawable(android.R.drawable.btn_default));
		    btn3.setBackgroundDrawable(getResources().getDrawable(android.R.drawable.btn_default));
			    btn1.getBackground().setAlpha(5);
				btn2.getBackground().setAlpha(5);
				btn3.getBackground().setAlpha(5);
			Random numGen = new Random();
            rNumber = numGen.nextInt(razmer);
			btn1.setText(namesr[rNumber]);						
			temp[0]=rNumber;
			System.out.println(temp[0]);
			
			Random numGen1 = new Random();
            rNumber = numGen1.nextInt(razmer);
			btn2.setText(namesr[rNumber]);					
			temp[1]=rNumber;
			System.out.println(temp[1]);
			Random numGen2 = new Random();
            rNumber = numGen2.nextInt(razmer);
			btn3.setText(namesr[rNumber]);
			temp[2]=rNumber;
			
			Random numGen3 = new Random();
            g = numGen3.nextInt(3);
            
			temp[3]=temp[g];
			
			text.setText(names[temp[g]]);
			
		
		}
		 else if(checkBox1.isChecked()==false){
			 flag=0;
			 btn1.setBackgroundDrawable(getResources().getDrawable(android.R.drawable.btn_default));
				btn2.setBackgroundDrawable(getResources().getDrawable(android.R.drawable.btn_default));
			    btn3.setBackgroundDrawable(getResources().getDrawable(android.R.drawable.btn_default));
				    btn1.getBackground().setAlpha(5);
					btn2.getBackground().setAlpha(5);
					btn3.getBackground().setAlpha(5);
			 
			Random numGen = new Random();
            rNumber = numGen.nextInt(razmer);
			btn1.setText(names[rNumber]);						
			temp[0]=rNumber;
			System.out.println(temp[0]);
			
			Random numGen1 = new Random();
            rNumber = numGen1.nextInt(razmer);
			btn2.setText(names[rNumber]);					
			temp[1]=rNumber;
			System.out.println(temp[1]);
			Random numGen2 = new Random();
            rNumber = numGen2.nextInt(razmer);
			btn3.setText(names[rNumber]);
			temp[2]=rNumber;
			
			Random numGen3 = new Random();
            g = numGen3.nextInt(3);
            
			temp[3]=temp[g];
			
			text.setText(namesr[temp[g]] + "\n" + rus[temp[g]]);
			}
	}

};

OnClickListener btn1_click = new OnClickListener()

{
	@Override
	public void onClick(View v) {
	if(temp[0]==temp[3] && flag==0){
		btn1.setBackgroundResource(R.drawable.lightgreen);	
		
		dogru=dogru+1;
		total=total+1;
		flag=flag+1;
		toplm.setText("  Всего: " + total);
		otvet=(dogru/total)*100;
						
		if(otvet<20){
                 text.setText(names[temp[3]] + '\n'+ namesr[temp[3]]+ '\n'+"Результат: " + String.format("%.1f", otvet) + "% верно." + "Плохой");
           }
       if(otvet >= 20 && otvet <= 40){
    	   text.setText(names[temp[3]] + '\n'+ namesr[temp[3]]+ '\n'+"Результат: " + String.format("%.1f", otvet) + "% верно."+ "Слабый");
   }
       if(otvet >= 40 && otvet <= 60){
    	   text.setText(names[temp[3]] + '\n'+ namesr[temp[3]]+ '\n'+"Результат: " + String.format("%.1f", otvet) + "% верно."+ "Средний");
           }
       if(otvet >= 60 && otvet <= 85){
    	   text.setText(names[temp[3]] + '\n'+ namesr[temp[3]]+ '\n'+"Результат: " + String.format("%.1f", otvet) + "% верно." + "Хороший");
            }
       if(otvet >= 85 && otvet <= 100){
    	   text.setText(names[temp[3]] + '\n'+ namesr[temp[3]]+ '\n'+"Результат: " + String.format("%.1f", otvet) + "% верно." + "Отличный");
                   }
	
	MediaPlayer mp = MediaPlayer.create(Privetstv1.this, myMusic[temp[0]]); 
	mp.setOnCompletionListener(gListener);
	mp.start();
	}
	else
	{
		 if(flag==0){
		    btn1.setBackgroundResource(R.drawable.lightred);	
			
			yanlis=yanlis+1;
			total=total+1;
			toplm.setText("  Всего: " + total);
			otvet=(dogru/total)*100;
			if(otvet<20){
                text.setText(names[temp[3]] + '\n'+ namesr[temp[3]]+ '\n'+"Результат: " + String.format("%.1f", otvet) + "% верно." + "Плохой");
          }
      if(otvet >= 20 && otvet <= 40){
   	   text.setText(names[temp[3]] + '\n'+ namesr[temp[3]]+ '\n'+"Результат: " + String.format("%.1f", otvet) + "% верно."+ "Слабый");
  }
      if(otvet >= 40 && otvet <= 60){
   	   text.setText(names[temp[3]] + '\n'+ namesr[temp[3]]+ '\n'+"Результат: " + String.format("%.1f", otvet) + "% верно."+ "Средний");
          }
      if(otvet >= 60 && otvet <= 85){
   	   text.setText(names[temp[3]] + '\n'+ namesr[temp[3]]+ '\n'+"Результат: " + String.format("%.1f", otvet) + "% верно." + "Хороший");
           }
      if(otvet >= 85 && otvet <= 100){
   	   text.setText(names[temp[3]] + '\n'+ namesr[temp[3]]+ '\n'+"Результат: " + String.format("%.1f", otvet) + "% верно." + "Отличный");
                  }
      flag=flag+1;
	}	
	}
		
		
	}

};
OnClickListener btn2_click = new OnClickListener()

{


	@Override
	public void onClick(View v) {
		if(temp[1]==temp[3] && flag==0){
			btn2.setBackgroundResource(R.drawable.lightgreen);	
			dogru=dogru+1;
			total=total+1;
			flag=flag+1;
			toplm.setText("  Всего: " + total);
			otvet=(dogru/total)*100;
							
			if(otvet<20){
                text.setText(names[temp[3]] + '\n'+ namesr[temp[3]]+ '\n'+"Результат: " + String.format("%.1f", otvet) + "% верно." + "Плохой");
          }
      if(otvet >= 20 && otvet <= 40){
   	   text.setText(names[temp[3]] + '\n'+ namesr[temp[3]]+ '\n'+"Результат: " + String.format("%.1f", otvet) + "% верно."+ "Слабый");
  }
      if(otvet >= 40 && otvet <= 60){
   	   text.setText(names[temp[3]] + '\n'+ namesr[temp[3]]+ '\n'+"Результат: " + String.format("%.1f", otvet) + "% верно."+ "Средний");
          }
      if(otvet >= 60 && otvet <= 85){
   	   text.setText(names[temp[3]] + '\n'+ namesr[temp[3]]+ '\n'+"Результат: " + String.format("%.1f", otvet) + "% верно." + "Хороший");
           }
      if(otvet >= 85 && otvet <= 100){
   	   text.setText(names[temp[3]] + '\n'+ namesr[temp[3]]+ '\n'+"Результат: " + String.format("%.1f", otvet) + "% верно." + "Отличный");
                  }
			MediaPlayer mp = MediaPlayer.create(Privetstv1.this, myMusic[temp[1]]); 
        	mp.setOnCompletionListener(gListener);
        	mp.start();
			}
			else
			{
			 if(flag==0){
				btn2.setBackgroundResource(R.drawable.lightred);							
				
				yanlis=yanlis+1;
				total=total+1;
				toplm.setText("  Всего: " + total);
				otvet=(dogru/total)*100;
				if(otvet<20){
	                 text.setText(names[temp[3]] + '\n'+ namesr[temp[3]]+ '\n'+"Результат: " + String.format("%.1f", otvet) + "% верно." + "Плохой");
	           }
	       if(otvet >= 20 && otvet <= 40){
	    	   text.setText(names[temp[3]] + '\n'+ namesr[temp[3]]+ '\n'+"Результат: " + String.format("%.1f", otvet) + "% верно."+ "Слабый");
	   }
	       if(otvet >= 40 && otvet <= 60){
	    	   text.setText(names[temp[3]] + '\n'+ namesr[temp[3]]+ '\n'+"Результат: " + String.format("%.1f", otvet) + "% верно."+ "Средний");
	           }
	       if(otvet >= 60 && otvet <= 85){
	    	   text.setText(names[temp[3]] + '\n'+ namesr[temp[3]]+ '\n'+"Результат: " + String.format("%.1f", otvet) + "% верно." + "Хороший");
	            }
	       if(otvet >= 85 && otvet <= 100){
	    	   text.setText(names[temp[3]] + '\n'+ namesr[temp[3]]+ '\n'+"Результат: " + String.format("%.1f", otvet) + "% верно." + "Отличный");
	                   }
		
			
			}	
			}
	}

};
OnClickListener btn3_click = new OnClickListener()

{


	@Override
	public void onClick(View v) {
		if(temp[2]==temp[3] && flag==0){
			btn3.setBackgroundResource(R.drawable.lightgreen);							
			
			dogru=dogru+1;
			total=total+1;
			flag=flag+1;
			toplm.setText("  Всего: " + total);
			otvet=(dogru/total)*100;
							
			if(otvet<20){
                text.setText(names[temp[3]] + '\n'+ namesr[temp[3]]+ '\n'+"Результат: " + String.format("%.1f", otvet) + "% верно." + "Плохой");
          }
      if(otvet >= 20 && otvet <= 40){
   	   text.setText(names[temp[3]] + '\n'+ namesr[temp[3]]+ '\n'+"Результат: " + String.format("%.1f", otvet) + "% верно."+ "Слабый");
  }
      if(otvet >= 40 && otvet <= 60){
   	   text.setText(names[temp[3]] + '\n'+ namesr[temp[3]]+ '\n'+"Результат: " + String.format("%.1f", otvet) + "% верно."+ "Средний");
          }
      if(otvet >= 60 && otvet <= 85){
   	   text.setText(names[temp[3]] + '\n'+ namesr[temp[3]]+ '\n'+"Результат: " + String.format("%.1f", otvet) + "% верно." + "Хороший");
           }
      if(otvet >= 85 && otvet <= 100){
   	   text.setText(names[temp[3]] + '\n'+ namesr[temp[3]]+ '\n'+"Результат: " + String.format("%.1f", otvet) + "% верно." + "Отличный");
                  }
			MediaPlayer mp = MediaPlayer.create(Privetstv1.this, myMusic[temp[2]]); 
        	mp.setOnCompletionListener(gListener);
        	mp.start();
		}
			else
			{
				 if(flag==0){
				yanlis=yanlis+1;
				total=total+1;
				toplm.setText("  Всего: " + total);
				otvet=(dogru/total)*100;
				if(otvet<20){
	                 text.setText(names[temp[3]] + '\n'+ namesr[temp[3]]+ '\n'+"Результат: " + String.format("%.1f", otvet) + "% верно." + "Плохой");
	           }
	       if(otvet >= 20 && otvet <= 40){
	    	   text.setText(names[temp[3]] + '\n'+ namesr[temp[3]]+ '\n'+"Результат: " + String.format("%.1f", otvet) + "% верно."+ "Слабый");
	   }
	       if(otvet >= 40 && otvet <= 60){
	    	   text.setText(names[temp[3]] + '\n'+ namesr[temp[3]]+ '\n'+"Результат: " + String.format("%.1f", otvet) + "% верно."+ "Средний");
	           }
	       if(otvet >= 60 && otvet <= 85){
	    	   text.setText(names[temp[3]] + '\n'+ namesr[temp[3]]+ '\n'+"Результат: " + String.format("%.1f", otvet) + "% верно. " + "Хороший");
	            }
	       if(otvet >= 85 && otvet <= 100){
	    	   text.setText(names[temp[3]] + '\n'+ namesr[temp[3]]+ '\n'+"Результат: " + String.format("%.1f", otvet) + "% верно." + "Отличный");
	                   }
          flag=flag+1;
			
			
				btn3.setBackgroundResource(R.drawable.lightred);		
				
			}	
			}
	}
};
checkBox1.setOnClickListener(checkBoxListener);
btn1.setOnClickListener(btn1_click);			
btn2.setOnClickListener(btn2_click);			
btn3.setOnClickListener(btn3_click);			
next.setOnClickListener(next_click);			



}
}






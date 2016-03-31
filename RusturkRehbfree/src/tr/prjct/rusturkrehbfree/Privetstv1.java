package tr.prjct.rusturkrehbfree;

import java.util.Random;
import ru.prjct.rusturkrehbfree.R;

import android.app.Activity;

import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Privetstv1 extends Activity {

	float sonuc,score=0,total=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bilgi);
		final String rus[]= {"������","��� �����","�� ������","�� ��������","�� ��������","������ ������","�� ��������","�� �������","�� �����������","�� ������������","�� ����","����� ����","����� ���?","��� ����������.��� ����������?","ظ��� ����","���","����","�� ����",
				"�� �����","����� ������","��� ������","�������","������� �����?","������ �����?","������� �����?","������� �����?","����� ��������","���� ��������","��������","���������","��������","��������","��������","����� �����","���� ����","����� ����� �������?","������ ������ ����� ����� ��?","������ ��������",
				"��������� ��?","������� ��?","��������","����������","�������","���������","������ ��� ���� �������","��� ���� ������������ ������������","������ ������������ ������","������ ���� ������","������ ��� �����������?","���� ���� �������� ���������������?","���","���","���","���","�����",
				"�������..","����� ������","�� ������","����� �������� ���"};
	final	String names[] = {"������������","������ ����","������ ����","������ �����","��������� ����","����������","������ �������� ��������","�����","����������� ����","� ���������� �����������","� ����� �����","���������� ���","��� ���������?","������ ������� � ��?","��� ����","����","����","����",
			"���","���","����","����","��� �������� ���� ����?","��� �������� ��� ���?","��� �������� ��� ���?","��� �������� ���� ����?","�������� �����","�������� ������","��������� ������..","����","����","����","������","�� ��������","����","�� �������� �� ������?","����� ��� ������ ������� �� ������?","� �� ������ �� �������",
			"���������?","���������?","�������","� �� �������","� �����(a)","� �� �����(a)","�� �� ����� �� �������� �����������?","���� �� �������� ��������� � �������","�� ����� �� �� ��������� ����������","��������� ����������","�� ����� �� �� �������� ���?","�� ����� �� �� ��� ��� ���������?","�","��","��","��","���",
			"� ����..","��� �� ��������","��� �����","��� ������"};
		final int[] temp = new int[4];
		
		final TextView cevap = (TextView) findViewById(R.id.textView1);
		final TextView esit = (TextView) findViewById(R.id.esit);
		final Button next = (Button) findViewById(R.id.next);
		final Button result = (Button) findViewById(R.id.result);
		final Button btn1 = (Button) findViewById(R.id.btn1);
		final Button btn2 = (Button) findViewById(R.id.btn2);
		final Button btn3 = (Button) findViewById(R.id.btn3);
		final TextView text = (TextView) findViewById(R.id.textView1);
		
		
		
		
OnClickListener next_click = new OnClickListener()
		
		{


			
			
			@Override
			public void onClick(View v) {
				int rNumber,g;
				
				cevap.setText("");	
					Random numGen = new Random();
		            rNumber = numGen.nextInt(59);
					btn1.setText(names[rNumber]);						
					temp[0]=rNumber;
					System.out.println(temp[0]);
					
					Random numGen1 = new Random();
		            rNumber = numGen1.nextInt(59);
					btn2.setText(names[rNumber]);					
					temp[1]=rNumber;
					System.out.println(temp[1]);
					Random numGen2 = new Random();
		            rNumber = numGen2.nextInt(59);
					btn3.setText(names[rNumber]);
					temp[2]=rNumber;
					
					Random numGen3 = new Random();
		            g = numGen3.nextInt(3);
		            
					temp[3]=temp[g];
					text.setText(rus[temp[g]]);
					
					esit.setText("�����: "+total + " �����: " + score );
					
			}
		
		};
		
		OnClickListener btn1_click = new OnClickListener()
		
		{
			@Override
			public void onClick(View v) {
			if(temp[0]==temp[3]){
			cevap.setText("���������");
			total=total+1;
			score=score+1;
			}
			else
			{
			cevap.setText("�����������");	
			total=total+1;	
			}	
				
				
				
			}
		
		};
OnClickListener btn2_click = new OnClickListener()
		
		{


			@Override
			public void onClick(View v) {
				if(temp[1]==temp[3]){
					cevap.setText("���������");	
					total=total+1;
					score=score+1;
					}
					else
					{
					cevap.setText("�����������");	
					total=total+1;
					}	
				
			}
		
		};
OnClickListener btn3_click = new OnClickListener()
		
		{


			@Override
			public void onClick(View v) {
				if(temp[2]==temp[3]){
					cevap.setText("���������");	
					total=total+1;
					score=score+1;	
				}
					else
					{
					cevap.setText("�����������");	
					total=total+1;
					}	
			
				
			}
		
		};
OnClickListener result_click = new OnClickListener()
		
		{


			@Override
			public void onClick(View v) {
				
				sonuc= (score/total)*100;
				
				esit.setText("�����: "+total + " �����: " + score );
				if(sonuc<20){
				cevap.setText(sonuc + "%  �����." + "  ������");
				}
				if(sonuc > 20 && sonuc < 40){
					cevap.setText(sonuc + "%  �����." + "   ������");
					}
				if(sonuc > 40 && sonuc < 60){
					cevap.setText(sonuc + "%  �����." + "  �������");
					}
				if(sonuc > 60 && sonuc < 85){
					cevap.setText(sonuc + "%  �����." + "  �������");
					}
				if(sonuc > 85 && sonuc <=100){
					cevap.setText(sonuc + "%  �����." + "  ��������");
					}
			}
		
		};
		result.setOnClickListener(result_click);	
		btn1.setOnClickListener(btn1_click);			
		btn2.setOnClickListener(btn2_click);			
		btn3.setOnClickListener(btn3_click);			
		next.setOnClickListener(next_click);			
		
		
		
	}

	
	}










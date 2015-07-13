package com.example.nana;


import android.support.v7.app.ActionBarActivity;

import android.os.Bundle;

import android.view.View;

import android.view.View.OnClickListener;

import android.widget.Button;

import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends ActionBarActivity {
     
private EditText height =null;
    
 private EditText weight =null;
     
private Button button = null;
     
private TextView show =null;

   
 protected void onCreate(Bundle savedInstanceState) {
        
super.onCreate(savedInstanceState);
       
 setContentView(R.layout.activity_main);
       
 Button button=(Button)findViewById(R.id.BMIbutton);
      
  height=(EditText)findViewById(R.id.height);
       
 weight=(EditText)findViewById(R.id.weight);
        
show=(TextView)findViewById(R.id.show);
    
       
 button.setOnClickListener(new OnClickListener(){
        	
double bmi=0;
        	
public void onClick(View v){
        		
double h=new Double(height.getText().toString());
        		
double w=new Double(weight.getText().toString());
        		
bmi=w/(h*h);

        		
double final_resault=exchangeResault(bmi);
        		
if(bmi<18.5){
        			
show.setText("您的身高体重指数为："+final_resault+""+"体重有点轻哦，注意增加饮食，让自己变成一个小吃货吧~");
 
       		}
    else if(bmi>=18.5||bmi<24){
        			
show.setText("您的身高体重指数为："+final_resault+""+"体重正常，继续保持哈~");
 
       		}
     else if(bmi>=24||bmi<27){
        			
show.setText("您的身高体重指数为："+final_resault+""+"体重稍重，记得多多锻炼吆~");
 
       		}
     else if(bmi>=27||bmi<30){
        			
show.setText("您的身高体重指数为："+final_resault+""+"轻度肥胖，注意饮食，多多锻炼~"); 

        		}
   else if(bmi>=30||bmi<35){
        			
show.setText("您的身高体重指数为："+final_resault+""+"中度肥胖，为了拥有好身体，适当节制，适当减肥~");
 
       		}
    else if(bmi>=35){
        			
show.setText("您的身高体重指数为："+final_resault+""+"重度肥胖，为避免患多种肥胖引起的疾病，您必须要减肥喽~");
 
       		}
        
}
       
 });
   
 }


        
public double exchangeResault(double resault){
        	
double first=resault*100;
        	
double second=(int)first;
        	
double second_first=first-second;

        	
if (second_first>0.5){
        		
second++;
        	
}
        	
double jirguo=(double)second/100;
        	
return jirguo;
        
    }
   

 }
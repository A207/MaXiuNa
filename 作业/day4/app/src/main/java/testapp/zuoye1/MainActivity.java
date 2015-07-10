package testapp.zuoye1;

import android.os.Bundle;
import android.app.Activity;

import android.view.View;
import android.view.View.OnClickListener;

import android.widget.ImageView;

import android.widget.LinearLayout;


public class MainActivity extends Activity {


//�������������ŵ��������棬��Ҫ����final�ġ�

    int currentImage = 0;
    int[] images = new int[]
            {R.drawable.ajax, R.drawable.classic, R.drawable.ee, R.drawable.java, R.drawable.xml};


    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


//���� id�õ�layout��ע��ҪΪlayout���һ��id��������ʹ��R.layout.activity_main��Ϊ id�����ҡ�

        LinearLayout layout = (LinearLayout) this.findViewById(R.id.root);


/*����һ��ImageView������֮�����layout�С�

final ImageView iv = new ImageView(this);

  layout.addView(iv);*/

//������Ҫ�½�һ��ImageView�����ǻ�ȡxml�е�IamgeView

        final ImageView iv = (ImageView) this.findViewById(R.id.iv_books);


//ָ����Ҫ��ʾ��ͼƬ

        iv.setImageResource(images[0]);


//setOnClickListener��View�ķ������༴���е�view���ɵ���ġ�

        iv.setOnClickListener(new OnClickListener(){

            public void onClick(View v){

                iv.setImageResource(images[++currentImage%images.length]);

            }

        });

    }
}

package testapp.zuoye1;

import android.os.Bundle;
import android.app.Activity;

import android.view.View;
import android.view.View.OnClickListener;

import android.widget.ImageView;

import android.widget.LinearLayout;


public class MainActivity extends Activity {


//若这两个变量放到方法里面，则要求是final的。

    int currentImage = 0;
    int[] images = new int[]
            {R.drawable.ajax, R.drawable.classic, R.drawable.ee, R.drawable.java, R.drawable.xml};


    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


//根据 id得到layout，注意要为layout添加一个id，而不是使用R.layout.activity_main作为 id来查找。

        LinearLayout layout = (LinearLayout) this.findViewById(R.id.root);


/*定义一个ImageView，并将之添加至layout中。

final ImageView iv = new ImageView(this);

  layout.addView(iv);*/

//不再需要新建一个ImageView，而是获取xml中的IamgeView

        final ImageView iv = (ImageView) this.findViewById(R.id.iv_books);


//指定所要显示的图片

        iv.setImageResource(images[0]);


//setOnClickListener是View的方法，亦即所有的view都可点击的。

        iv.setOnClickListener(new OnClickListener(){

            public void onClick(View v){

                iv.setImageResource(images[++currentImage%images.length]);

            }

        });

    }
}

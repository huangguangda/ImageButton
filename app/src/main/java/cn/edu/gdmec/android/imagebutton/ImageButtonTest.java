package cn.edu.gdmec.android.imagebutton;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageButtonTest extends AppCompatActivity {
    TextView textview;
    ImageButton imgbtn1;
    ImageButton imgbtn2;
    ImageButton imgbtn3;
    ImageButton imgbtn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_image_button_test );

        textview=(TextView)findViewById ( R.id.textview );
        imgbtn1=(ImageButton)findViewById ( R.id.imagebutton1 );
        imgbtn2=(ImageButton)findViewById ( R.id.imagebutton2 );
        imgbtn3=(ImageButton)findViewById ( R.id.imagebutton3 );
        imgbtn4=(ImageButton)findViewById ( R.id.imagebutton4 );

        imgbtn2.setImageDrawable ( getResources ().getDrawable ( R.drawable.icon ) );
        imgbtn3.setImageDrawable ( getResources ().getDrawable ( R.drawable.icon2 ) );
        imgbtn4.setImageDrawable ( getResources ().getDrawable ( R.drawable.sym_call_incoming ) );

        imgbtn1.setOnClickListener ( new Button.OnClickListener ()
        {
            @Override
            public void onClick(View v){
                Dialog dialog=new AlertDialog.Builder ( ImageButtonTest.this ).setTitle ( "提示" ).setMessage ( "我是ImageButton1" ).setPositiveButton ( "确定",new DialogInterface.OnClickListener (){
                    @Override
                    public void onClick(DialogInterface dialog, int which){

                    }
                } ).create ();
                dialog.show ();
            }
        });
        imgbtn2.setOnClickListener ( new Button.OnClickListener ()
        {
            @Override
            public void onClick(View v){
                Dialog dialog=new AlertDialog.Builder ( ImageButtonTest.this).setTitle ( "提示" ).setMessage ( "我是ImageButton2,我要使用ImageButton3的图标" ).setPositiveButton ( "确定",new DialogInterface.OnClickListener (){
                    @Override
                    public void onClick(DialogInterface dialog,int which){
                        imgbtn2.setImageDrawable ( getResources ().getDrawable ( R.drawable.icon2 ) );
                    }
                } ).create ();
                dialog.show ();
            }
        });
        imgbtn3.setOnClickListener ( new Button.OnClickListener ()
        {
            @Override
            public void onClick(View v){
                Dialog dialog=new AlertDialog.Builder ( ImageButtonTest.this ).setTitle ( "提示" ).setMessage ( "我是ImageButton3,我想使用系统打电话的图标" ).setPositiveButton ( "确定",new DialogInterface.OnClickListener (){
                    @Override
                    public void onClick(DialogInterface dialog, int which){
                        imgbtn3.setImageDrawable ( getResources ().getDrawable ( R.drawable.sym_action_call ) );
                    }
                } ).create ();
                dialog.show ();
            }
        });
        imgbtn4.setOnClickListener ( new Button.OnClickListener ()
        {
            @Override
            public void onClick(View v){
                Dialog dialog=new AlertDialog.Builder ( ImageButtonTest.this ).setTitle ( "提示" ).setMessage ( "我是使用的系统图标" ).setPositiveButton ( "确定",new DialogInterface.OnClickListener (){
                    @Override
                    public void onClick(DialogInterface dialog, int which){

                    }
                } ).create ();
                dialog.show ();
            }
        });
    }
}

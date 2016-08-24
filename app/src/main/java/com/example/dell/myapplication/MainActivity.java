package com.example.dell.myapplication;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doClick(View view){
        switch (view.getId()){
            //跳转到新记录页面
            case R.id.bt_newNote:
                Intent intent1=new Intent(this, NewNoteActivity.class);
                startActivity(intent1);
                break;
            //跳转到记录列表界面
            case R.id.bt_list:
                Intent intent2=new Intent(MainActivity.this, NoteListActivity.class);
                startActivity(intent2);
                break;
            //跳转到成就界面
            case R.id.bt_reward:
                Intent intent3=new Intent(MainActivity.this, RewardActivity.class);
                startActivity(intent3);
                break;
            //跳转到教程界面
            case R.id.bt_learning:
                Intent intent4=new Intent(MainActivity.this, LearningActivity.class);
                startActivity(intent4);
                break;
            //
            case R.id.iv_login:
                Toast.makeText(MainActivity.this, "点我登录", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}

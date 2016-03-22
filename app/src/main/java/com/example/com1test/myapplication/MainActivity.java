package com.example.com1test.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Explicit ประกาศตัวแปร
    private EditText userEditText;
    private EditText passwordEditText;
    private Button loginButton;
    private String userString, passwordString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();


        //Button Controller
        buttonController();


    }//main methed

    private void buttonController() {
      loginButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              //Receive Value  Form Ddit Text
              userString=userEditText.getText().toString().trim();//แก้ไขการมีพื้นที่ว่ายในuser
              passwordString = passwordEditText.getText().toString().trim();
              // Check space
              if (userString.equals("") || passwordString.equals("") ) {
                  //Have Space
                  MyAlertDialog myAlertDialog = new MyAlertDialog();
                  myAlertDialog.myDialog(MainActivity.this,
                          "มีช่องว่าง","กรุณากรอกทุกช่องค่ะ");
              } else {
                  //No Space
              }


          }//onclick
      });
    }//buttoncontroller

    private void bindWidget() {

        userEditText = (EditText) findViewById(R.id.editText);
        passwordEditText = (EditText) findViewById(R.id.editText2);
        loginButton = (Button) findViewById(R.id.button);


    }
}//main class หรือคลาสหลัก

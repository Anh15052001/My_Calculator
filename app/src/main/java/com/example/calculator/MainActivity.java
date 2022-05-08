package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView workingstv;
    TextView resultstv;
    Button bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9;
    Button bang, cong, tru, nhan, chia, c, ce, bs;
    Button dot;
    String tinhtoan;  //biến lưu các giá trị với các toán hạng và các phép tính toán
    String pheptoan;
    boolean checkdot = false;
    boolean checkbang = false;
    int so1, so2, ketqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhXa();
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                workingstv.setText("");
                resultstv.setText("");
                tinhtoan = "";
                pheptoan = "";
                checkbang = false;
                checkdot = false;
            }
        });
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkbang)
                {
                    tinhtoan = resultstv.getText().toString();
                    resultstv.setText(tinhtoan+ "0");
                }
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkbang)
                {
                    tinhtoan = resultstv.getText().toString();
                    resultstv.setText(tinhtoan+"1");
                }
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkbang)
                {
                    tinhtoan = resultstv.getText().toString();
                    resultstv.setText(tinhtoan+"2");
                }
            }

        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkbang)
                {
                    tinhtoan = resultstv.getText().toString();
                    resultstv.setText(tinhtoan+"3");
                }
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkbang)
                {
                    tinhtoan = resultstv.getText().toString();
                    resultstv.setText(tinhtoan+"4");
                }
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkbang)
                {
                    tinhtoan = resultstv.getText().toString();
                    resultstv.setText(tinhtoan+"5");
                }
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkbang)
                {
                    tinhtoan = resultstv.getText().toString();
                    resultstv.setText(tinhtoan+"6");
                }
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkbang)
                {
                    tinhtoan = resultstv.getText().toString();
                    resultstv.setText(tinhtoan+"7");
                }
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkbang)
                {
                    tinhtoan = resultstv.getText().toString();
                    resultstv.setText(tinhtoan+"8");
                }
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkbang)
                {
                    tinhtoan = resultstv.getText().toString();
                    resultstv.setText(tinhtoan+"9");
                }
            }
        });
        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultstv.getText()=="")
                {
                    so1 = 0;
                    workingstv.setText("0 + ");
                }
                else {
                    so1 = Integer.parseInt(resultstv.getText()+"");
                    workingstv.setText(resultstv.getText().toString()+" + ");
                    resultstv.setText("");
                    tinhtoan = "";
                    pheptoan = "+";
                    checkdot = false;
                    checkbang = false;
                }
            }
        });
        tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resultstv.getText()=="")
                {
                    so1 = 0;
                    workingstv.setText("0 - ");
                }
                else {
                    so1 = Integer.parseInt(resultstv.getText()+"");
                    workingstv.setText(resultstv.getText().toString()+ " - ");
                    resultstv.setText("");
                    tinhtoan = "";
                    pheptoan = "-";
                    checkdot = false;
                    checkbang = false;
                }
            }
        });
        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resultstv.getText()=="")
                {
                    so1 = 0;
                    workingstv.setText("0 x ");
                }
                else {
                    so1 = Integer.parseInt(resultstv.getText()+"");
                    workingstv.setText(resultstv.getText().toString()+" x ");
                    resultstv.setText("");
                    tinhtoan = "";
                    pheptoan = "x";
                    checkbang = false;
                    checkdot = false;
                }
            }
        });
        chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resultstv.getText()=="")
                {
                    so1 = 0;
                    workingstv.setText("0 / ");
                }
                else {
                    so1 = Integer.parseInt(resultstv.getText()+"");
                    workingstv.setText(resultstv.getText().toString()+" / ");
                    resultstv.setText("");
                    tinhtoan = "";
                    pheptoan = "/";
                    checkdot = false;
                    checkbang = false;
                }
            }
        });
        //sự kiện bằng
        bang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //khi chưa bấm nút bằng
                //nghĩa là khi đó phải nhập số thứ 2
                if(!checkbang)
                {
                    checkdot = false;
                    tinhtoan = resultstv.getText().toString();
                    so2 = Integer.parseInt(resultstv.getText()+"");
                    workingstv.setText(workingstv.getText().toString()+resultstv.getText().toString()+"");
                    resultstv.setText("");
                    if (pheptoan=="")
                    {
                        ketqua = Integer.parseInt(tinhtoan);
                    }
                    if(pheptoan=="+")
                    {
                        ketqua = so1+so2;
                    }
                    if(pheptoan=="-")
                    {
                        ketqua = so1-so2;
                    }
                    if (pheptoan=="x")
                    {
                        ketqua=so1*so2;
                    }
                    if (pheptoan=="/")
                    {
                        ketqua=so1/so2;
                    }
                    checkbang = true;
                    resultstv.setText(ketqua+"");

                }
                else {

                }
                pheptoan = "";

            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkbang)
                {
                    if(!checkdot)
                    {
                        tinhtoan = resultstv.getText().toString();
                        resultstv.setText(tinhtoan+".");
                        checkdot=true;
                    }
                }
            }
        });
        //bs xóa từng kí tự
        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkbang)
                {
                    String val = resultstv.getText().toString();
                    if(!val.isEmpty())
                    {
                        val = val.substring(0, val.length()-1);
                        resultstv.setText(val);
                    }
                }
            }
        });
        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultstv.setText("");
            }
        });

    }
    private void anhXa()
    {
        workingstv = (TextView) findViewById(R.id.workingsTextView);
        resultstv = (TextView) findViewById(R.id.resultTextView);
        bt0 = (Button) findViewById(R.id.btn0);
        bt1 = (Button) findViewById(R.id.btn1);
        bt2 = (Button) findViewById(R.id.btn2);
        bt3 = (Button) findViewById(R.id.btn3);
        bt4 = (Button) findViewById(R.id.btn4);
        bt5 = (Button) findViewById(R.id.btn5);
        bt6 = (Button) findViewById(R.id.btn6);
        bt7 = (Button) findViewById(R.id.btn7);
        bt8 = (Button) findViewById(R.id.btn8);
        bt9 = (Button) findViewById(R.id.btn9);
        bang = (Button) findViewById(R.id.btnequal);
        cong = (Button) findViewById(R.id.btnAdd);
        tru = (Button) findViewById(R.id.btnSub);
        nhan = (Button) findViewById(R.id.btnmul);
        chia = (Button) findViewById(R.id.btndiv);
        c = (Button) findViewById(R.id.btnC);
        ce = (Button) findViewById(R.id.btnCe);
        bs = (Button) findViewById(R.id.btnBS);
        dot = (Button) findViewById(R.id.btndot);
    }

  }
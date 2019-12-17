package com.example.butterknifetrial;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_click)
    Button mButtonClick;

    @BindView(R.id.tv_header)
    TextView mTextViewHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }
    
    @OnClick(R.id.btn_click)
    public void submit(){
        Toast.makeText(this, "Button Clicked ..... ButterKnife", Toast.LENGTH_SHORT).show();
    }
}

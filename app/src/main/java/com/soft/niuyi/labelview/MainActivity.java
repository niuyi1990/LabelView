package com.soft.niuyi.labelview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.soft.niuyi.labelview.view.LabelsView;

import java.util.ArrayList;

import static com.soft.niuyi.labelview.R.id.labels;

public class MainActivity extends AppCompatActivity {

    private LabelsView mLabelsView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLabelsView = (LabelsView) findViewById(labels);

        init();
    }

    private void init() {
        final ArrayList<String> list = new ArrayList<>();
        list.add("科比");
        list.add("艾弗森");
        list.add("姚明");
        list.add("奥尼尔");
        list.add("库里");
        list.add("诺维斯基");
        list.add("詹姆斯");
        list.add("欧文");
        list.add("乐福");
        list.add("杜兰特");
        mLabelsView.setLabels(list);

        mLabelsView.setOnLabelClickListener(new LabelsView.OnLabelClickListener() {
            @Override
            public void onLabelClick(TextView label, int position) {
                //label就是被点击的标签，position就是标签的位置。
                Toast.makeText(MainActivity.this, list.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}

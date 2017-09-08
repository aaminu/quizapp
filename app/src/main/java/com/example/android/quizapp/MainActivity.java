package com.example.android.quizapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TextView electrical = (TextView) findViewById(R.id.electQuiz);
//        electrical.setOnClickListener(new OnClickListener() {
//            @Override
//
//            public void onClick(View view) {
//                // Create a new intent to open the {@link ElectricalActivity}
//                Intent electricalIntent = new Intent(MainActivity.this, Electrical.class);
//
//                // Start the new activity
//                startActivity(electricalIntent);
//            }
//        });
//
//
//        TextView civil = (TextView)findViewById(R.id.civilQuiz);
//        civil.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent civilIntent = new Intent(MainActivity.this, Civil.class);
//                startActivity(civilIntent);
//            }
//        });
//
//
//        TextView mech = (TextView) findViewById(R.id.mechQuiz);
//        mech.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent mechIntent = new Intent(MainActivity.this, Mechanical.class);
//                startActivity(mechIntent);
//            }
//        });


        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);


        myFragmentPageAdapter adapter = new myFragmentPageAdapter(this, getSupportFragmentManager());


        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        tabLayout.setupWithViewPager(viewPager);
    }


//    public void electQuiz (View view){
//
//        Intent intent = new Intent(this, Electrical.class );
//        startActivity(intent);
//    }
//
//    public void civilQuiz (View view){
//
//        Intent intent = new Intent(this, Civil.class );
//        startActivity(intent);
//    }
//
//    public void mechQuiz (View view){
//
//        Intent intent = new Intent(this, Mechanical.class );
//        startActivity(intent);
//    }
}

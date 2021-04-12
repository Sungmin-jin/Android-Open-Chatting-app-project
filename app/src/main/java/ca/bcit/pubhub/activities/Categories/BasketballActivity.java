package ca.bcit.pubhub.activities.Categories;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import ca.bcit.pubhub.R;

public class BasketballActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_basketball);
        ListView basketball_list = findViewById(R.id.basketball_listview);
        basketball_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(BasketballActivity.this, BasketballListActivity.class);
                intent.putExtra("categories", (int) position);
                startActivity(intent);
            }
        });
    }
}

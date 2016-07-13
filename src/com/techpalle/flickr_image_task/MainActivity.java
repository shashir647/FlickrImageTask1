package com.techpalle.flickr_image_task;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		GridView gridView=(GridView) findViewById(R.id.image_grid);
		gridView.setAdapter(new ImageAdapter(getApplicationContext()));
		gridView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parentView, View iv, int position,
					long id) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), ""+position, Toast.LENGTH_SHORT).show();
				Intent i=new Intent(getApplicationContext(),ImageDetail.class);
				i.putExtra("id", position);
				startActivity(i);
			}
		});
	}
}

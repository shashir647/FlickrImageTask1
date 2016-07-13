package com.techpalle.flickr_image_task;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageDetail extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		setContentView(R.layout.imagedetails);
		super.onCreate(savedInstanceState);
		Intent i=getIntent();
		int position= (Integer) i.getExtras().get("id");
		ImageView iv=(ImageView) findViewById(R.id.imageView1);
		iv.setImageResource(ImageAdapter.images[position]);
	}

}

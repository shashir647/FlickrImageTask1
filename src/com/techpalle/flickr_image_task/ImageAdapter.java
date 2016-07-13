package com.techpalle.flickr_image_task;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.ListAdapter;

public class ImageAdapter extends BaseAdapter {
	public static int[] images={R.drawable.b,R.drawable.c,R.drawable.d,
			R.drawable.e,R.drawable.c,R.drawable.tree1,R.drawable.tree2,
			R.drawable.nature2,R.drawable.d,R.drawable.nature3};
	private Context context;

	public ImageAdapter(Context applicationContext) {
		context=applicationContext;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return images.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return images[position];
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ImageView iv;
		if(convertView!=null){
			iv= (ImageView) convertView;
		
		}
		else
		{
			iv=new ImageView(context);
			LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT,LinearLayout.LayoutParams.FILL_PARENT);
			iv.setLayoutParams(new GridView.LayoutParams(params));
			iv.setScaleType(ScaleType.FIT_XY);
			
			
			
		}
		iv.setImageResource(images[position]);
		return iv;
	}

}

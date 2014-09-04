package com.anugool.listeview_554105960;

import java.util.ArrayList;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends Activity {
	private ListView ListView1;
	private ArrayList<list_ss> itemlist;
	private ListAdapter adapter;
	private int[] drawable = { 
			 R.drawable.facebook
			,R.drawable.google_plush
			,R.drawable.twitter
			,R.drawable.youtube};
	private String[] title = {
			 "Facebook"
			,"Google+"
			,"Twitter"
			,"Youtube"};
@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.fragment_main);
	ListView1 = (ListView) findViewById(R.id.listView1);
	//Data
   itemlist = new ArrayList<list_ss>();
   //Add Data
   for (int i = 0; i<drawable.length; i++){
	   list_ss list_items = new list_ss();
      	list_items.setTitle(title[i]);
      	list_items.setDrawable(getResources().getDrawable(drawable[i]));
      	itemlist.add(list_items);
      }
      adapter = new Myadapter();
      ListView1.setAdapter(adapter);
	}// End OnCreate

	private class Myadapter extends BaseAdapter {
		private Holder holder;

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return itemlist.size();
		}
@Override
		public Object getItem(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int arg0) {
			// TODO Auto-generated method stub
			return 0;
		}
			@Override
			public View getView(int position, View view, ViewGroup parent) {
				
				view =LayoutInflater.from(getApplicationContext()).inflate(R.layout.list_tt, null);
				
				holder = new Holder();
				holder.imageView = (ImageView) view.findViewById(R.id.imageView1);
				holder.txt1 = (TextView) view.findViewById(R.id.textView1);
				
				if (itemlist.get(position).getTitle() != null){
					holder.txt1.setText(itemlist.get(position).getTitle());
				}
				if (itemlist.get(position).getDrawable() != null){
					holder.imageView.setImageDrawable(itemlist.get(position).getDrawable());
				}
				return view;
			}
			
			public class Holder {
				public TextView txt1;
				public ImageView imageView;
				
			}
		}
	
}// End Class


	






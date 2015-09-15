package com.candroidsample;

import java.util.ArrayList;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.arabmobilechanllenge.entreprenear.R;

public class ListAdapterLunch extends BaseAdapter{

	ArrayList<Lunch> listLunch;
	LayoutInflater layoutInflater;
	
	public ListAdapterLunch(Context context,ArrayList<Lunch> listLunch) {
		this.listLunch = listLunch;
		layoutInflater = LayoutInflater.from(context);
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return listLunch.size();
	}

	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return listLunch.get(arg0);
	}

	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	public View getView(int arg0, View arg1, ViewGroup arg2) {
	
		ViewHolder holder;
		
		if (arg1==null)
		{
			arg1= layoutInflater.inflate(R.layout.liste_meeting_items, null);
			holder = new ViewHolder();
			// NomView correspondant à la textView associé au nom
			holder.time = (TextView) arg1.findViewById(R.id.time);
			// SiteView correspondant à la textView associé au site
			holder.with = (TextView) arg1.findViewById(R.id.lunchwith);
		
			//tagguer notre objet pour pouvoir le récupérer à la prochaine mise à jour graphique.
			arg1.setTag(holder);
		}
		else 
		{
			holder = (ViewHolder) arg1.getTag();
		}
		// mettre les données dans chaque composante associée
		// listEcoles.get(arg0).getNom() : extraire le nom de la listEcoles etc.
		holder.time.setText(listLunch.get(arg0).time);
		holder.with.setText(listLunch.get(arg0).withHo);
		
		return arg1;
		
	}
	
	static class ViewHolder {
		TextView time;
		TextView with;
	}

}

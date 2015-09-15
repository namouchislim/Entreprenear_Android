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

public class ListAdapterLeftMenu extends BaseAdapter{

	ArrayList<Menu> listMenu;
	LayoutInflater layoutInflater;
	
	public ListAdapterLeftMenu(Context context,ArrayList<Menu> listMenu) {
		this.listMenu = listMenu;
		layoutInflater = LayoutInflater.from(context);
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return listMenu.size();
	}

	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return listMenu.get(arg0);
	}

	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	public View getView(int arg0, View arg1, ViewGroup arg2) {
	
		ViewHolder holder;
		
		if (arg1==null)
		{
			arg1= layoutInflater.inflate(R.layout.row_list, null);
			holder = new ViewHolder();
			// NomView correspondant à la textView associé au nom
			holder.NomView = (TextView) arg1.findViewById(R.id.nom);
			// SiteView correspondant à la textView associé au site
			// LogoView correspondant à la textView associé au logo
			holder.LogoView = (ImageView) arg1.findViewById(R.id.logo);
			//tagguer notre objet pour pouvoir le récupérer à la prochaine mise à jour graphique.
			arg1.setTag(holder);
		}
		else 
		{
			holder = (ViewHolder) arg1.getTag();
		}
		// mettre les données dans chaque composante associée
		// listMenu.get(arg0).getNom() : extraire le nom de la listMenu etc.
		holder.NomView.setText(listMenu.get(arg0).getNom());
		holder.LogoView.setImageDrawable(listMenu.get(arg0).getLogo());
		
		return arg1;
		
	}
	
	static class ViewHolder {
		TextView NomView;
		ImageView LogoView;
	}

}

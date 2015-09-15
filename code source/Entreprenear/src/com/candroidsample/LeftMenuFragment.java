/* Created by Srikanth gr.
 */

package com.candroidsample;



import java.util.ArrayList;





import android.annotation.TargetApi;
import android.app.Fragment;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.arabmobilechanllenge.entreprenear.R;
//Left Menu 
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class LeftMenuFragment extends Fragment implements OnClickListener, OnItemClickListener {
	ListView lv;
	// slide menu items
	private String[] navMenuTitles;
	private TypedArray navMenuIcons;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View v= inflater.inflate(R.layout.leftmenu, container, false);
		lv = (ListView) v.findViewById(R.id.listMenu);
		// ecoles_details est un ArayList qui contient les données récupérées par la méthode getListData
		ArrayList<Menu> menu=new ArrayList<Menu>();
		navMenuTitles = getResources().getStringArray(R.array.nav_drawer_items);
		
	
		
		
		
		menu.add(new Menu(navMenuTitles[0], getResources().getDrawable(R.drawable.meeting_icon)));
		menu.add(new Menu(navMenuTitles[1], getResources().getDrawable(R.drawable.place_icon)));
		menu.add(new Menu(navMenuTitles[2], getResources().getDrawable(R.drawable.plus_icon)));
		menu.add(new Menu(navMenuTitles[3], getResources().getDrawable(R.drawable.history_icon)));
		menu.add(new Menu(navMenuTitles[4], getResources().getDrawable(R.drawable.meeting_icon)));
		
		lv.setAdapter(new ListAdapterLeftMenu(getActivity(), menu));
		lv.setOnItemClickListener(this);
		
		return v;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		
		
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		if(arg2==0){
			Intent intent = new Intent(getActivity(), BusinessLunch.class);
		    startActivity(intent);
			
		}
		
	}

}

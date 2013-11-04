package com.example.classlab7c.adapters;

import java.util.List;

import com.example.classlab7c.R;
import com.example.classlab7c.model.Event;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class EventAdapter extends ArrayAdapter<Event> {
	private Context mContext;
	private List<Event> mEntries;
	
	public EventAdapter(Context context,int textViewResourceId, List<Event> entries) { 
		super(context, textViewResourceId, entries);
	    mContext=context;
	    mEntries=entries; 
	}

	public View getView(int position, View view, ViewGroup parent) {
		if(view==null){
			 LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		     view = inflater.inflate(R.layout.listview_for_each_event, parent, false);
		}
		Event event = mEntries.get(position);
		
		TextView textViewTitle = (TextView)view.findViewById(R.id.textViewEventName);
		textViewTitle.setText(event.getEventName());
		
		TextView textViewDescription = (TextView)view.findViewById(R.id.textViewEventDate);
		textViewDescription.setText("Date: " + event.getDate());
		
		TextView textViewPublished= (TextView)view.findViewById(R.id.textViewEventList);
		textViewPublished.setText("Location: " + event.getLocation());
		
		return view;
	}
}

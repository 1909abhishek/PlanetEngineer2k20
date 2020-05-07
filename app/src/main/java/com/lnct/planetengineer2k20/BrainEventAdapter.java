package com.lnct.planetengineer2k20;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BrainEventAdapter extends RecyclerView.Adapter<BrainEventAdapter.ViewHolder> {
    private ArrayList<BrainEventList> arrayList;
    private Context context;
    public BrainEventAdapter(ArrayList arrayList,Context context){
        this.arrayList=arrayList;
        this.context=context;
    }
    @NonNull
    @Override
    public BrainEventAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View list = layoutInflater.inflate(R.layout.brainevent_list,parent,false);
        ViewHolder viewHolder=new ViewHolder(list);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BrainEventAdapter.ViewHolder holder, int position) {
        final BrainEventList danceList=arrayList.get(position);
        holder.title.setText(danceList.getTitle());
        holder.icon.setImageResource(danceList.getIcon());
        holder.organiser.setText(danceList.getOrginization());
        holder.fees.setText(danceList.getFees());
        holder.venue.setText(danceList.getVenue());
        holder.date.setText(danceList.getDate());
        holder.cname1.setText(danceList.getCname1());
        holder.cno1.setText(danceList.getCno1());
        holder.cname2.setText(danceList.getCname2());
        holder.cno2.setText(danceList.getCno2());
        holder.scname1.setText(danceList.getScname1());
        holder.scno1.setText(danceList.getSno1());
        holder.scname2.setText(danceList.getScname2());
        holder.scno2.setText(danceList.getSno2());

    }

    @Override
    public int getItemCount() {
        return arrayList.size() ;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout layout;
        TextView title,organiser,fees,venue,date,cname1,cname2,cno1,cno2,scname1,scname2,scno1,scno2;
        ImageView icon;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            layout=itemView.findViewById(R.id.layout);
            title=itemView.findViewById(R.id.title);
            icon =itemView.findViewById(R.id.icon);
            organiser=itemView.findViewById(R.id.organiser);
            fees=itemView.findViewById(R.id.fees);
            venue=itemView.findViewById(R.id.venue);
            date=itemView.findViewById(R.id.date);
            cname1=itemView.findViewById(R.id.cname1);
            cname2=itemView.findViewById(R.id.cname2);
            cno1=itemView.findViewById(R.id.cmobile1);
            cno2=itemView.findViewById(R.id.cmobile2);
            scname1=itemView.findViewById(R.id.scname1);
            scname2=itemView.findViewById(R.id.scname2);
            scno1=itemView.findViewById(R.id.scmobile1);
            scno2=itemView.findViewById(R.id.scmobile2);

        }
    }
}


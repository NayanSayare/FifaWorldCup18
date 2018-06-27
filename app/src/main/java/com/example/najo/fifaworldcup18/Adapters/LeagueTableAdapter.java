package com.example.najo.fifaworldcup18.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.najo.fifaworldcup18.Classes.LeagueTable;
import com.example.najo.fifaworldcup18.R;
import com.squareup.picasso.Picasso;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LeagueTableAdapter extends RecyclerView.Adapter<LeagueTableAdapter.UserViewHolder> {

    Context context;
    ArrayList<LeagueTable.standings.A> aArrayList;

    public LeagueTableAdapter(Context context, ArrayList<LeagueTable.standings.A> aArrayList) {
        this.context = context;
        this.aArrayList = aArrayList;
    }

    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        LayoutInflater inflater= (LayoutInflater)context. getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.leaguetablecardview,null);

        UserViewHolder holder = new UserViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {


        LeagueTable.standings.A  listA= aArrayList.get(position);

        holder.points.setText(listA.getPoints()+"");
        holder.match_played.setText(listA.getPlayedGames()+"");
        holder.countryName.setText(listA.getTeam());
        holder.rank.setText(listA.getRank()+"");
        String image=listA.getCrestURI();

        Picasso.get().load(image).into(holder.countryImage);

    }

    @Override
    public int getItemCount() {
        return aArrayList.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {

        View view;

        TextView countryName;
        TextView rank;
        TextView match_played;
        TextView points;
        ImageView countryImage;

        public UserViewHolder(View view) {
            super(view);

            this.view=view;
            countryImage=view.findViewById(R.id.crestUrl);
            countryName=view.findViewById(R.id.country_name);
            rank = view.findViewById(R.id.rank);
            match_played = view.findViewById(R.id.match_played);
            points = view.findViewById(R.id.points);
        }
    }
}

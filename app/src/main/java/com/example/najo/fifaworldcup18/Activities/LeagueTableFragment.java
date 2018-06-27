package com.example.najo.fifaworldcup18.Activities;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.najo.fifaworldcup18.Adapters.LeagueTableAdapter;
import com.example.najo.fifaworldcup18.ApiClient;
import com.example.najo.fifaworldcup18.Classes.LeagueTable;
import com.example.najo.fifaworldcup18.Constant;
import com.example.najo.fifaworldcup18.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * A simple {@link Fragment} subclass.
 */
public class LeagueTableFragment extends Fragment {


    public LeagueTableFragment() {

    }


    RecyclerView AleagueTableRecyclerView , BleagueTableRecyclerView , CleagueTableRecyclerView , DleagueTableRecyclerView , EleagueTableRecyclerView , FleagueTableRecyclerView , GleagueTableRecyclerView , HleagueTableRecyclerView ;

    LeagueTableAdapter AleagueTableAdapter;
    ArrayList<LeagueTable.standings.A> aArrayList1= new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_league_table, container, false);

        AleagueTableRecyclerView = view.findViewById(R.id.Arecyclerview);
        BleagueTableRecyclerView = view.findViewById(R.id.Brecyclerview);
        CleagueTableRecyclerView = view.findViewById(R.id.Crecyclerview);
        DleagueTableRecyclerView = view.findViewById(R.id.Drecyclerview);
        EleagueTableRecyclerView = view.findViewById(R.id.Erecyclerview);
        FleagueTableRecyclerView = view.findViewById(R.id.Frecyclerview);
        GleagueTableRecyclerView = view.findViewById(R.id.Grecyclerview);
        HleagueTableRecyclerView = view.findViewById(R.id.Hrecyclerview);

        AleagueTableAdapter = new LeagueTableAdapter(getContext(),aArrayList1);

        AleagueTableRecyclerView.setAdapter(AleagueTableAdapter);
        AleagueTableRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        AleagueTableRecyclerView.setItemAnimator(new DefaultItemAnimator());
        AleagueTableRecyclerView.addItemDecoration(new DividerItemDecoration(getContext(),DividerItemDecoration.HORIZONTAL));
        AleagueTableAdapter.notifyDataSetChanged();

        fetchLeagueTableData();
        return view;
    }

    private void fetchLeagueTableData() {

        Retrofit retrofit = new Retrofit.Builder().baseUrl(Constant.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();

        ApiClient apiClient =  retrofit.create(ApiClient.class);

        Call<LeagueTable> call = apiClient.getLeagueTable();
        call.enqueue(new Callback<LeagueTable>() {
            @Override
            public void onResponse(Call<LeagueTable> call, Response<LeagueTable> response) {

                LeagueTable leagueTable =  response.body();
                if(leagueTable !=null){

                    ArrayList<LeagueTable.standings.A> list = leagueTable.getS().getaArrayList();
                       if(list!=null){

                           aArrayList1.clear();
                           aArrayList1.addAll(list);
                           AleagueTableAdapter.notifyDataSetChanged();
                           Toast.makeText(getContext(), "successfull", Toast.LENGTH_SHORT).show();

                       }else{
                           Toast.makeText(getContext(), "list null!!", Toast.LENGTH_SHORT).show();
                       }




                }else{
                    Toast.makeText(getContext(), "data null fetched", Toast.LENGTH_SHORT).show();
                }




            }

            @Override
            public void onFailure(Call<LeagueTable> call, Throwable t) {
                Toast.makeText(getContext(), "failed to llaod data", Toast.LENGTH_SHORT).show();

            }
        });


    }

    // ab retrofit ka kaam hoga krti  hu 2 min m OKAY LOL

}

package com.example.najo.fifaworldcup18;

import com.example.najo.fifaworldcup18.Classes.LeagueTable;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiClient {

    @GET("leagueTable")
    Call<LeagueTable> getLeagueTable();

    // bc net wali

}

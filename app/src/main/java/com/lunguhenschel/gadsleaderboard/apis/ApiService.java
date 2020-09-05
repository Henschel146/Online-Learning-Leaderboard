package com.lunguhenschel.gadsleaderboard.apis;




import com.lunguhenschel.gadsleaderboard.models.IqLeader;
import com.lunguhenschel.gadsleaderboard.models.TopLearner;

import java.util.List;

import retrofit2.Call;
;
import retrofit2.http.GET;

public interface ApiService {

    @GET("/api/hours")
    Call<List<TopLearner>> getTopLearnersList();


    @GET("/api/skilliq")
    Call<List<IqLeader>> getIqLeadersList();

}

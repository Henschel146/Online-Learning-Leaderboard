package com.lunguhenschel.gadsleaderboard.ui.main;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lunguhenschel.gadsleaderboard.R;

import com.lunguhenschel.gadsleaderboard.adapters.IqLeaderAdapter;

import com.lunguhenschel.gadsleaderboard.apis.ApiService;
import com.lunguhenschel.gadsleaderboard.models.IqLeader;
import com.lunguhenschel.gadsleaderboard.apis.RetrofitClientInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class IqLeadersFragment extends Fragment {
    private ApiService mApiService;
    private IqLeaderAdapter mIqLeaderAdapter;
    private View mRoot;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mRoot = inflater.inflate(R.layout.fragment_iq_leaders, container, false);
        mApiService = RetrofitClientInstance.getRetrofitInstance().create(ApiService.class);
        Call<List<IqLeader>> iqLeaderCall = mApiService.getIqLeadersList();
        iqLeaderCall.enqueue(new Callback<List<IqLeader>>() {
            @Override
            public void onResponse(Call<List<IqLeader>> call, Response<List<IqLeader>> response) {
                generateDataList(response.body());
            }

            @Override
            public void onFailure(Call<List<IqLeader>> call, Throwable t) {
                Log.d("Error", "No Response");

            }
        });


        return mRoot;

    }

    private void generateDataList(List<IqLeader> body) {
        RecyclerView recyclerView = mRoot.findViewById(R.id.rv_iq_leaders);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mIqLeaderAdapter = new IqLeaderAdapter(getContext(), body);
        recyclerView.setAdapter(mIqLeaderAdapter);


    }

}
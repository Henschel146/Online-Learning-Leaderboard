package com.lunguhenschel.gadsleaderboard.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lunguhenschel.gadsleaderboard.R;
import com.lunguhenschel.gadsleaderboard.models.IqLeader;

import java.util.List;

public class IqLeaderAdapter extends RecyclerView.Adapter<IqLeaderAdapter.IQLeaderViewHolder> {
    private List<IqLeader> mIqLearnersList;
    private Context mContext;

    public IqLeaderAdapter(Context context, List<IqLeader> leaderList) {
        mContext = context;
        mIqLearnersList = leaderList;
    }

    @NonNull
    @Override
    public IQLeaderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.iq_leaders_items, parent, false);


        return new IQLeaderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull IQLeaderViewHolder holder, int position) {
        IqLeader Learner = mIqLearnersList.get(position);
        holder.tvName.setText(Learner.getName());
        String hours = Learner.getScore().toString() + " skill IQ score,";
        holder.tvScore.setText(hours);
        holder.tvCountry.setText(Learner.getCountry());

    }

    @Override
    public int getItemCount() {
        return mIqLearnersList.size();
    }

    public class IQLeaderViewHolder extends RecyclerView.ViewHolder {

        private TextView tvName;
        private TextView tvScore;
        private TextView tvCountry;

        public IQLeaderViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_iq_leaders_name);
            tvScore = itemView.findViewById(R.id.tv_iq_leaders_score);
            tvCountry = itemView.findViewById(R.id.tv_iq_leaders_country);
        }
    }
}

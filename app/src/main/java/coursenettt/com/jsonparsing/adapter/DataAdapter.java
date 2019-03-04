package coursenettt.com.jsonparsing.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import coursenettt.com.jsonparsing.R;
import coursenettt.com.jsonparsing.model.AndroidVersion;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private ArrayList<AndroidVersion> android;

    public DataAdapter(ArrayList<AndroidVersion> android){
        this.android = android;
    }

    @NonNull
    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_row,viewGroup,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull DataAdapter.ViewHolder viewHolder, int i) {
        viewHolder.tv_name.setText(android.get(i).getName());
        viewHolder.tv_version.setText(android.get(i).getVer());
        viewHolder.tv_api_level.setText(android.get(i).getApi());
    }

    @Override
    public int getItemCount() {
        return android.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_name,tv_version,tv_api_level;

        public ViewHolder (View view){
            super(view);
            tv_name = (TextView)view.findViewById(R.id.tv_name);
            tv_version = (TextView)view.findViewById(R.id.tv_version);
            tv_api_level = (TextView)view.findViewById(R.id.tv_api_level);

        }
    }
}

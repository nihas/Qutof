package com.example.user.qutof.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.user.qutof.Pojos.RecyclerPojo;
import com.example.user.qutof.R;

import java.util.ArrayList;
import java.util.List;

public class HeaderRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
  private static final int ITEM_VIEW_TYPE_HEADER = 0;
  private static final int ITEM_VIEW_TYPE_ITEM = 1;

  private final View header;
//  private final List<String> labels;
  private List<RecyclerPojo> allItem;


  public HeaderRecyclerAdapter(View header, List<RecyclerPojo> allItemList) {
    this.allItem=allItemList;
    if (header == null) {
      throw new IllegalArgumentException("header may not be null");
    }
    this.header = header;
  }

  public boolean isHeader(int position) {
    return position == 0;
  }

  @Override
  public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    if (viewType == ITEM_VIEW_TYPE_HEADER) {
//      View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.featured_header, parent, false);
      return new ViewHolder(header);
    }
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.featured_grid, parent, false);
    return new ViewHolder(view);
  }

  @Override
  public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
    if (isHeader(position)) {
      return;
    }

  }

  public class ViewHolder extends RecyclerView.ViewHolder {

//    public TextView txtViewTitle;
//    public ImageView imgViewIcon;

    public ViewHolder(View v) {
      super(v);
//      txtViewTitle = (TextView) v.findViewById(R.id.item_title);
//      imgViewIcon = (ImageView) v.findViewById(R.id.item_icon);
    }
  }

  @Override
  public int getItemViewType(int position) {
    return isHeader(position) ? ITEM_VIEW_TYPE_HEADER : ITEM_VIEW_TYPE_ITEM;
  }

  @Override
  public int getItemCount() {
    return allItem.size() + 1;
  }
}
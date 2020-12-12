package com.huy.thecoffeehouse;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PhoBienFragment extends Fragment {
    private RecyclerView rcv;
    private Rcv_Adapter rcv_adapter;
    private Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.phobien_fragment, container, false);
        rcv = v.findViewById(R.id.rcv);
        rcv.setLayoutManager(new GridLayoutManager(getContext(), 2));
        rcv_adapter = new Rcv_Adapter();
        rcv_adapter.setData(getList());
        rcv.setAdapter(rcv_adapter);
        return v;
    }

    private List<Rcv_Item> getList() {
        List<Rcv_Item> list = new ArrayList<>();
        list.add(new Rcv_Item(R.drawable.socola, "Sôcôla Lúa Mạch nóng", "69.000đ"));
        list.add(new Rcv_Item(R.drawable.socola, "Sôcôla Lúa Mạch đá xoay", "69.000đ"));
        list.add(new Rcv_Item(R.drawable.caffe, "Cà phê lúa mạch nóng", "69.000đ"));
        list.add(new Rcv_Item(R.drawable.caffe, "Cà phê lúa mạch đá", "69.000đ"));
        list.add(new Rcv_Item(R.drawable.caffe, "Cà Phê Sữa Đá", "32.000đ"));
        list.add(new Rcv_Item(R.drawable.tradao, "Trà Đào Cam Sả - Đá", "45.000đ"));
        list.add(new Rcv_Item(R.drawable.oolong, "Oolong Hạt Sen - Đá", "45.000đ"));
        list.add(new Rcv_Item(R.drawable.chabong, "Chà Bông Phô Mai", "32.000đ"));
        return list;
    }
}

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

public class DoAnFragment extends Fragment {
    private RecyclerView rcv1, rcv2, rcv3;
    private com.huy.thecoffeehouse.Rcv_Adapter rcv_adapter1, rcv_adapter2, rcv_adapter3;
    private Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.doan_fragment, container, false);
        rcv1 = v.findViewById(R.id.rcv31);
        rcv2 = v.findViewById(R.id.rcv32);
        rcv3 = v.findViewById(R.id.rcv33);
        rcv1.setLayoutManager(new GridLayoutManager(getContext(), 2));
        rcv2.setLayoutManager(new GridLayoutManager(getContext(), 2));
        rcv3.setLayoutManager(new GridLayoutManager(getContext(), 2));
        rcv_adapter1 = new com.huy.thecoffeehouse.Rcv_Adapter();
        rcv_adapter2 = new com.huy.thecoffeehouse.Rcv_Adapter();
        rcv_adapter3 = new com.huy.thecoffeehouse.Rcv_Adapter();
        rcv_adapter1.setData(getList1());
        rcv_adapter2.setData(getList2());
        rcv_adapter3.setData(getList3());
        rcv1.setAdapter(rcv_adapter1);
        rcv2.setAdapter(rcv_adapter2);
        rcv3.setAdapter(rcv_adapter3);
        return v;
    }

    private List<com.huy.thecoffeehouse.Rcv_Item> getList1() {
        List<com.huy.thecoffeehouse.Rcv_Item> list = new ArrayList<>();
        list.add(new com.huy.thecoffeehouse.Rcv_Item(R.drawable.socola, "Sôcôla Lúa Mạch nóng", "69.000đ"));
        list.add(new com.huy.thecoffeehouse.Rcv_Item(R.drawable.socola, "Sôcôla Lúa Mạch đá xoay", "69.000đ"));
        list.add(new com.huy.thecoffeehouse.Rcv_Item(R.drawable.caffe, "Cà phê lúa mạch nóng", "69.000đ"));
        list.add(new com.huy.thecoffeehouse.Rcv_Item(R.drawable.caffe, "Cà phê lúa mạch đá", "69.000đ"));
        list.add(new com.huy.thecoffeehouse.Rcv_Item(R.drawable.caffe, "Cà Phê Sữa Đá", "32.000đ"));
        list.add(new com.huy.thecoffeehouse.Rcv_Item(R.drawable.tradao, "Trà Đào Cam Sả - Đá", "45.000đ"));
        list.add(new com.huy.thecoffeehouse.Rcv_Item(R.drawable.oolong, "Oolong Hạt Sen - Đá", "45.000đ"));
        list.add(new com.huy.thecoffeehouse.Rcv_Item(R.drawable.chabong, "Chà Bông Phô Mai", "32.000đ"));
        return list;
    }

    private List<com.huy.thecoffeehouse.Rcv_Item> getList2() {
        List<com.huy.thecoffeehouse.Rcv_Item> list = new ArrayList<>();
        list.add(new com.huy.thecoffeehouse.Rcv_Item(R.drawable.socola, "Sôcôla Lúa Mạch nóng", "69.000đ"));
        list.add(new com.huy.thecoffeehouse.Rcv_Item(R.drawable.socola, "Sôcôla Lúa Mạch đá xoay", "69.000đ"));
        list.add(new com.huy.thecoffeehouse.Rcv_Item(R.drawable.caffe, "Cà phê lúa mạch nóng", "69.000đ"));
        list.add(new com.huy.thecoffeehouse.Rcv_Item(R.drawable.caffe, "Cà phê lúa mạch đá", "69.000đ"));
        list.add(new com.huy.thecoffeehouse.Rcv_Item(R.drawable.caffe, "Cà Phê Sữa Đá", "32.000đ"));
        list.add(new com.huy.thecoffeehouse.Rcv_Item(R.drawable.tradao, "Trà Đào Cam Sả - Đá", "45.000đ"));
        list.add(new com.huy.thecoffeehouse.Rcv_Item(R.drawable.oolong, "Oolong Hạt Sen - Đá", "45.000đ"));
        list.add(new com.huy.thecoffeehouse.Rcv_Item(R.drawable.chabong, "Chà Bông Phô Mai", "32.000đ"));
        return list;
    }

    private List<com.huy.thecoffeehouse.Rcv_Item> getList3() {
        List<com.huy.thecoffeehouse.Rcv_Item> list = new ArrayList<>();
        list.add(new com.huy.thecoffeehouse.Rcv_Item(R.drawable.socola, "Sôcôla Lúa Mạch nóng", "69.000đ"));
        list.add(new com.huy.thecoffeehouse.Rcv_Item(R.drawable.socola, "Sôcôla Lúa Mạch đá xoay", "69.000đ"));
        list.add(new com.huy.thecoffeehouse.Rcv_Item(R.drawable.caffe, "Cà phê lúa mạch nóng", "69.000đ"));
        list.add(new com.huy.thecoffeehouse.Rcv_Item(R.drawable.caffe, "Cà phê lúa mạch đá", "69.000đ"));
        list.add(new com.huy.thecoffeehouse.Rcv_Item(R.drawable.caffe, "Cà Phê Sữa Đá", "32.000đ"));
        list.add(new com.huy.thecoffeehouse.Rcv_Item(R.drawable.tradao, "Trà Đào Cam Sả - Đá", "45.000đ"));
        list.add(new com.huy.thecoffeehouse.Rcv_Item(R.drawable.oolong, "Oolong Hạt Sen - Đá", "45.000đ"));
        list.add(new com.huy.thecoffeehouse.Rcv_Item(R.drawable.chabong, "Chà Bông Phô Mai", "32.000đ"));
        return list;
    }
}

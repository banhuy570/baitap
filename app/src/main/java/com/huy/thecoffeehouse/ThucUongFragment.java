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

public class ThucUongFragment extends Fragment {
    private RecyclerView rcv1, rcv2, rcv3;
    private Rcv_Adapter rcv_adapter1, rcv_adapter2, rcv_adapter3;
    private Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.thucuong_fragment, container, false);
        rcv1 = v.findViewById(R.id.rcv21);
        rcv2 = v.findViewById(R.id.rcv22);
        rcv3 = v.findViewById(R.id.rcv23);
        rcv1.setLayoutManager(new GridLayoutManager(getContext(), 2));
        rcv2.setLayoutManager(new GridLayoutManager(getContext(), 2));
        rcv3.setLayoutManager(new GridLayoutManager(getContext(), 2));
        rcv_adapter1 = new Rcv_Adapter();
        rcv_adapter2 = new Rcv_Adapter();
        rcv_adapter3 = new Rcv_Adapter();
        rcv_adapter1.setData(getList1());
        rcv_adapter2.setData(getList2());
        rcv_adapter3.setData(getList3());
        rcv1.setAdapter(rcv_adapter1);
        rcv2.setAdapter(rcv_adapter2);
        rcv3.setAdapter(rcv_adapter3);
        return v;
    }

    private List<Rcv_Item> getList1() {
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

    private List<Rcv_Item> getList2() {
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

    private List<Rcv_Item> getList3() {
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

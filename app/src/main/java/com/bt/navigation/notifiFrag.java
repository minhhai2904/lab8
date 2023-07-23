    package com.bt.navigation;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

    /**
 * A simple {@link Fragment} subclass.
 * Use the {@link notifiFrag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class notifiFrag extends Fragment {
        ArrayList<MsgItemRVClass> data = new ArrayList<>();
        MsgRvAdapter msgRvAdapter;
        RecyclerView messFragRV;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public notifiFrag() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment searchFrag.
     */
    // TODO: Rename and change types and number of parameters
    public static notifiFrag newInstance(String param1, String param2) {
        notifiFrag fragment = new notifiFrag();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false);
    }

        @Override
        public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);
            messFragRV = view.findViewById(R.id.mess_frag);
            MessInit();
            msgRvAdapter = new MsgRvAdapter(data);
            msgRvAdapter.notifyDataSetChanged();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 1);
            messFragRV.setAdapter(msgRvAdapter);
            messFragRV.setLayoutManager(gridLayoutManager);
        }

        private void  MessInit(){
            data.add( new MsgItemRVClass(R.drawable.vietnam,"hello !!!!","tester 1 ","16-2-2023"));
            data.add( new MsgItemRVClass(R.drawable.vietnam,"hello !!!!","tester 2 ","26-2-2023"));
            data.add( new MsgItemRVClass(R.drawable.vietnam,"hello !!!!","tester 3 ","26-4-2023"));
            data.add( new MsgItemRVClass(R.drawable.vietnam,"hello !!!!","tester 4 ","26-5-2023"));
        }
    }
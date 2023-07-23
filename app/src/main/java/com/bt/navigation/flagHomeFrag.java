package com.bt.navigation;

import java.util.ArrayList;

public class flagHomeFrag {
        int id;
        String name;
        public flagHomeFrag(int id, String name) {
            this.id = id;
            this.name = name;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public static ArrayList initFlag(){
            ArrayList<flagHomeFrag> arrayList = new ArrayList<flagHomeFrag>();
            arrayList.add(new flagHomeFrag(R.drawable.vietnam, "Viet Nam"));
            arrayList.add(new flagHomeFrag(R.drawable.ecuador, "Ecuador"));
            arrayList.add(new flagHomeFrag(R.drawable.estonia, "Estonia"));
            arrayList.add(new flagHomeFrag(R.drawable.france, "France"));
            arrayList.add(new flagHomeFrag(R.drawable.italy, "Italy"));
            arrayList.add(new flagHomeFrag(R.drawable.laos, "Laos"));
            arrayList.add(new flagHomeFrag(R.drawable.vietnam, "Viet Nam"));
            arrayList.add(new flagHomeFrag(R.drawable.ecuador, "Ecuador"));
            arrayList.add(new flagHomeFrag(R.drawable.estonia, "Estonia"));
            arrayList.add(new flagHomeFrag(R.drawable.france, "France"));
            arrayList.add(new flagHomeFrag(R.drawable.italy, "Italy"));
            arrayList.add(new flagHomeFrag(R.drawable.laos, "Laos"));
            arrayList.add(new flagHomeFrag(R.drawable.vietnam, "Viet Nam"));
            arrayList.add(new flagHomeFrag(R.drawable.ecuador, "Ecuador"));
            arrayList.add(new flagHomeFrag(R.drawable.estonia, "Estonia"));
            arrayList.add(new flagHomeFrag(R.drawable.france, "France"));
            arrayList.add(new flagHomeFrag(R.drawable.italy, "Italy"));
            arrayList.add(new flagHomeFrag(R.drawable.laos, "Laos"));
            return arrayList;
        }


}

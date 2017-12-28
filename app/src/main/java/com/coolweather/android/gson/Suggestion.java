package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chanchaoyue on 2017/12/28.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    @SerializedName("sport")
    public Sport sport;

    @SerializedName("uv")
    public UV uv;

    public class Comfort {

        @SerializedName("txt")
        public String info;

    }

    public class CarWash {

        @SerializedName("txt")
        public String info;

    }

    public class Sport {

        @SerializedName("txt")
        public String info;

    }

    public class UV{
        @SerializedName("txt")
        public String info;
    }

}

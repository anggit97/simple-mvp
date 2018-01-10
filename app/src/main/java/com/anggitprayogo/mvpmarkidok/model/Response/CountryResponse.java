package com.anggitprayogo.mvpmarkidok.model.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Anggit on 10/01/2018.
 */

public class CountryResponse {

    @SerializedName("RestResponse")
    public Restresponse restresponse;

    public static class Result {
        @SerializedName("name")
        public String name;
        @SerializedName("alpha2_code")
        public String alpha2Code;
        @SerializedName("alpha3_code")
        public String alpha3Code;

        public String getName() {
            return name;
        }

        public String getAlpha2Code() {
            return alpha2Code;
        }

        public String getAlpha3Code() {
            return alpha3Code;
        }
    }

    public static class Restresponse {
        @SerializedName("messages")
        public List<String> messages;
        @SerializedName("result")
        public List<Result> result;

        public List<String> getMessages() {
            return messages;
        }

        public List<Result> getResult() {
            return result;
        }
    }

    public Restresponse getRestresponse() {
        return restresponse;
    }
}

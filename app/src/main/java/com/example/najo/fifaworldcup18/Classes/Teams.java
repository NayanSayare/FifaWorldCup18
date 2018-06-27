package com.example.najo.fifaworldcup18.Classes;

import java.util.ArrayList;

public class Teams {

    int count;
    ArrayList<teams> teamsArrayList;

    public Teams(int count, ArrayList<teams> teamsArrayList) {
        this.count = count;
        this.teamsArrayList = teamsArrayList;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public ArrayList<teams> getTeamsArrayList() {
        return teamsArrayList;
    }

    public void setTeamsArrayList(ArrayList<teams> teamsArrayList) {
        this.teamsArrayList = teamsArrayList;
    }

    public class teams{
        public class links{
            public class fixtures{
                String href;

                public fixtures(String href) {
                    this.href = href;
                }

                public String getHref() {
                    return href;
                }

                public void setHref(String href) {
                    this.href = href;
                }
            }
            public class players{
                String href;

                public players(String href) {
                    this.href = href;
                }

                public String getHref() {
                    return href;
                }

                public void setHref(String href) {
                    this.href = href;
                }
            }
        }
        String name;
        String code;
        String crestUrl;

        public teams(String name, String code, String crestUrl) {
            this.name = name;
            this.code = code;
            this.crestUrl = crestUrl;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getCrestUrl() {
            return crestUrl;
        }

        public void setCrestUrl(String crestUrl) {
            this.crestUrl = crestUrl;
        }
    }
}

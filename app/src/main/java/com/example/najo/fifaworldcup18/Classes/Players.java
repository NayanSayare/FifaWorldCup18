package com.example.najo.fifaworldcup18.Classes;

import java.util.ArrayList;

public class Players {

    public class links{
        public class team{
            String href;

            public team(String href) {
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

    int count ;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public ArrayList<players> getPlayersArrayList() {
        return playersArrayList;
    }

    public void setPlayersArrayList(ArrayList<players> playersArrayList) {
        this.playersArrayList = playersArrayList;
    }

    ArrayList<players> playersArrayList ;

    public class players{
        String name;
        String position;
        int jerseyNumber;
        String nationality;
        String dateOfBirth;

        public players(String name, String position, int jerseyNumber, String nationality, String dateOfBirth) {
            this.name = name;
            this.position = position;
            this.jerseyNumber = jerseyNumber;
            this.nationality = nationality;
            this.dateOfBirth = dateOfBirth;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public int getJerseyNumber() {
            return jerseyNumber;
        }

        public void setJerseyNumber(int jerseyNumber) {
            this.jerseyNumber = jerseyNumber;
        }

        public String getNationality() {
            return nationality;
        }

        public void setNationality(String nationality) {
            this.nationality = nationality;
        }

        public String getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }
    }
}

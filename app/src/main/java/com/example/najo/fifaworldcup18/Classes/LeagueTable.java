package com.example.najo.fifaworldcup18.Classes;

import java.util.ArrayList;

public class LeagueTable {


    standings s;

    public standings getS() {
        return s;
    }

    public void setS(standings s) {
        this.s = s;
    }

    public class standings{
        ArrayList<A> aArrayList;
        ArrayList<B> bArrayList;
        ArrayList<C> cArrayList;
        ArrayList<D> dArrayList;
        ArrayList<E> eArrayList;
        ArrayList<F> fArrayList;
        ArrayList<G> gArrayList;
        ArrayList<H> hArrayList;

        public standings(ArrayList<A> aArrayList, ArrayList<B> bArrayList, ArrayList<C> cArrayList, ArrayList<D> dArrayList, ArrayList<E> eArrayList, ArrayList<F> fArrayList, ArrayList<G> gArrayList, ArrayList<H> hArrayList) {
            this.aArrayList = aArrayList;
            this.bArrayList = bArrayList;
            this.cArrayList = cArrayList;
            this.dArrayList = dArrayList;
            this.eArrayList = eArrayList;
            this.fArrayList = fArrayList;
            this.gArrayList = gArrayList;
            this.hArrayList = hArrayList;
        }

        public ArrayList<A> getaArrayList() {
            return aArrayList;
        }

        public void setaArrayList(ArrayList<A> aArrayList) {
            this.aArrayList = aArrayList;
        }

        public ArrayList<B> getbArrayList() {
            return bArrayList;
        }

        public void setbArrayList(ArrayList<B> bArrayList) {
            this.bArrayList = bArrayList;
        }

        public ArrayList<C> getcArrayList() {
            return cArrayList;
        }

        public void setcArrayList(ArrayList<C> cArrayList) {
            this.cArrayList = cArrayList;
        }

        public ArrayList<D> getdArrayList() {
            return dArrayList;
        }

        public void setdArrayList(ArrayList<D> dArrayList) {
            this.dArrayList = dArrayList;
        }

        public ArrayList<E> geteArrayList() {
            return eArrayList;
        }

        public void seteArrayList(ArrayList<E> eArrayList) {
            this.eArrayList = eArrayList;
        }

        public ArrayList<F> getfArrayList() {
            return fArrayList;
        }

        public void setfArrayList(ArrayList<F> fArrayList) {
            this.fArrayList = fArrayList;
        }

        public ArrayList<G> getgArrayList() {
            return gArrayList;
        }

        public void setgArrayList(ArrayList<G> gArrayList) {
            this.gArrayList = gArrayList;
        }

        public ArrayList<H> gethArrayList() {
            return hArrayList;
        }

        public void sethArrayList(ArrayList<H> hArrayList) {
            this.hArrayList = hArrayList;
        }


        ArrayList<LeagueTable.standings.A> A_arrayList;

        public ArrayList<LeagueTable.standings.A> getA_arrayList() {
            return A_arrayList;
        }

        public void setA_arrayList(ArrayList<A> a_arrayList) {
            A_arrayList = a_arrayList;
        }

        public class A{//
            String group;
            int rank;
            String team;
            int playedGames;
            String crestURI;
            int points;

            public A(String group, int rank, String team, int playedGames, String crestURI, int points) {
                this.group = group;
                this.rank = rank;
                this.team = team;
                this.playedGames = playedGames;
                this.crestURI = crestURI;
                this.points = points;
            }

            public String getGroup() {
                return group;
            }

            public void setGroup(String group) {
                this.group = group;
            }

            public int getRank() {
                return rank;
            }

            public void setRank(int rank) {
                this.rank = rank;
            }

            public String getTeam() {
                return team;
            }

            public void setTeam(String team) {
                this.team = team;
            }

            public int getPlayedGames() {
                return playedGames;
            }

            public void setPlayedGames(int playedGames) {
                this.playedGames = playedGames;
            }

            public String getCrestURI() {
                return crestURI;
            }

            public void setCrestURI(String crestURI) {
                this.crestURI = crestURI;
            }

            public int getPoints() {
                return points;
            }

            public void setPoints(int points) {
                this.points = points;
            }
        }
        public class B{
            String group;
            String rank;
            String team;
            int playedGames;
            String crestURI;

            public B(String group, String rank, String team, int playedGames, String crestURI, int points) {
                this.group = group;
                this.rank = rank;
                this.team = team;
                this.playedGames = playedGames;
                this.crestURI = crestURI;
                this.points = points;
            }

            public String getGroup() {
                return group;
            }

            public void setGroup(String group) {
                this.group = group;
            }

            public String getRank() {
                return rank;
            }

            public void setRank(String rank) {
                this.rank = rank;
            }

            public String getTeam() {
                return team;
            }

            public void setTeam(String team) {
                this.team = team;
            }

            public int getPlayedGames() {
                return playedGames;
            }

            public void setPlayedGames(int playedGames) {
                this.playedGames = playedGames;
            }

            public String getCrestURI() {
                return crestURI;
            }

            public void setCrestURI(String crestURI) {
                this.crestURI = crestURI;
            }

            public int getPoints() {
                return points;
            }

            public void setPoints(int points) {
                this.points = points;
            }

            int points;
        }
        public class C{
            String group;
            String rank;
            String team;
            int playedGames;
            String crestURI;

            public C(String group, String rank, String team, int playedGames, String crestURI, int points) {
                this.group = group;
                this.rank = rank;
                this.team = team;
                this.playedGames = playedGames;
                this.crestURI = crestURI;
                this.points = points;
            }

            public String getGroup() {
                return group;
            }

            public void setGroup(String group) {
                this.group = group;
            }

            public String getRank() {
                return rank;
            }

            public void setRank(String rank) {
                this.rank = rank;
            }

            public String getTeam() {
                return team;
            }

            public void setTeam(String team) {
                this.team = team;
            }

            public int getPlayedGames() {
                return playedGames;
            }

            public void setPlayedGames(int playedGames) {
                this.playedGames = playedGames;
            }

            public String getCrestURI() {
                return crestURI;
            }

            public void setCrestURI(String crestURI) {
                this.crestURI = crestURI;
            }

            public int getPoints() {
                return points;
            }

            public void setPoints(int points) {
                this.points = points;
            }

            int points;
        }
        public class D{
            String group;
            String rank;
            String team;
            int playedGames;
            String crestURI;

            public D(String group, String rank, String team, int playedGames, String crestURI, int points) {
                this.group = group;
                this.rank = rank;
                this.team = team;
                this.playedGames = playedGames;
                this.crestURI = crestURI;
                this.points = points;
            }

            public String getGroup() {
                return group;
            }

            public void setGroup(String group) {
                this.group = group;
            }

            public String getRank() {
                return rank;
            }

            public void setRank(String rank) {
                this.rank = rank;
            }

            public String getTeam() {
                return team;
            }

            public void setTeam(String team) {
                this.team = team;
            }

            public int getPlayedGames() {
                return playedGames;
            }

            public void setPlayedGames(int playedGames) {
                this.playedGames = playedGames;
            }

            public String getCrestURI() {
                return crestURI;
            }

            public void setCrestURI(String crestURI) {
                this.crestURI = crestURI;
            }

            public int getPoints() {
                return points;
            }

            public void setPoints(int points) {
                this.points = points;
            }

            int points;
        }
        public class E{
            String group;
            String rank;
            String team;
            int playedGames;
            String crestURI;

            public E(String group, String rank, String team, int playedGames, String crestURI, int points) {
                this.group = group;
                this.rank = rank;
                this.team = team;
                this.playedGames = playedGames;
                this.crestURI = crestURI;
                this.points = points;
            }

            public String getGroup() {
                return group;
            }

            public void setGroup(String group) {
                this.group = group;
            }

            public String getRank() {
                return rank;
            }

            public void setRank(String rank) {
                this.rank = rank;
            }

            public String getTeam() {
                return team;
            }

            public void setTeam(String team) {
                this.team = team;
            }

            public int getPlayedGames() {
                return playedGames;
            }

            public void setPlayedGames(int playedGames) {
                this.playedGames = playedGames;
            }

            public String getCrestURI() {
                return crestURI;
            }

            public void setCrestURI(String crestURI) {
                this.crestURI = crestURI;
            }

            public int getPoints() {
                return points;
            }

            public void setPoints(int points) {
                this.points = points;
            }

            int points;
        }
        public class F{
            String group;
            String rank;
            String team;
            int playedGames;
            String crestURI;

            public F(String group, String rank, String team, int playedGames, String crestURI, int points) {
                this.group = group;
                this.rank = rank;
                this.team = team;
                this.playedGames = playedGames;
                this.crestURI = crestURI;
                this.points = points;
            }

            public String getGroup() {
                return group;
            }

            public void setGroup(String group) {
                this.group = group;
            }

            public String getRank() {
                return rank;
            }

            public void setRank(String rank) {
                this.rank = rank;
            }

            public String getTeam() {
                return team;
            }

            public void setTeam(String team) {
                this.team = team;
            }

            public int getPlayedGames() {
                return playedGames;
            }

            public void setPlayedGames(int playedGames) {
                this.playedGames = playedGames;
            }

            public String getCrestURI() {
                return crestURI;
            }

            public void setCrestURI(String crestURI) {
                this.crestURI = crestURI;
            }

            public int getPoints() {
                return points;
            }

            public void setPoints(int points) {
                this.points = points;
            }

            int points;
        }
        public class G{
            String group;
            String rank;
            String team;
            int playedGames;
            String crestURI;

            public G(String group, String rank, String team, int playedGames, String crestURI, int points) {
                this.group = group;
                this.rank = rank;
                this.team = team;
                this.playedGames = playedGames;
                this.crestURI = crestURI;
                this.points = points;
            }

            public String getGroup() {
                return group;
            }

            public void setGroup(String group) {
                this.group = group;
            }

            public String getRank() {
                return rank;
            }

            public void setRank(String rank) {
                this.rank = rank;
            }

            public String getTeam() {
                return team;
            }

            public void setTeam(String team) {
                this.team = team;
            }

            public int getPlayedGames() {
                return playedGames;
            }

            public void setPlayedGames(int playedGames) {
                this.playedGames = playedGames;
            }

            public String getCrestURI() {
                return crestURI;
            }

            public void setCrestURI(String crestURI) {
                this.crestURI = crestURI;
            }

            public int getPoints() {
                return points;
            }

            public void setPoints(int points) {
                this.points = points;
            }

            int points;
        }
        public class H{
            String group;
            String rank;
            String team;
            int playedGames;
            String crestURI;

            public H(String group, String rank, String team, int playedGames, String crestURI, int points) {
                this.group = group;
                this.rank = rank;
                this.team = team;
                this.playedGames = playedGames;
                this.crestURI = crestURI;
                this.points = points;
            }

            public String getGroup() {
                return group;
            }

            public void setGroup(String group) {
                this.group = group;
            }

            public String getRank() {
                return rank;
            }

            public void setRank(String rank) {
                this.rank = rank;
            }

            public String getTeam() {
                return team;
            }

            public void setTeam(String team) {
                this.team = team;
            }

            public int getPlayedGames() {
                return playedGames;
            }

            public void setPlayedGames(int playedGames) {
                this.playedGames = playedGames;
            }

            public String getCrestURI() {
                return crestURI;
            }

            public void setCrestURI(String crestURI) {
                this.crestURI = crestURI;
            }

            public int getPoints() {
                return points;
            }

            public void setPoints(int points) {
                this.points = points;
            }

            int points;
        }
    }
}

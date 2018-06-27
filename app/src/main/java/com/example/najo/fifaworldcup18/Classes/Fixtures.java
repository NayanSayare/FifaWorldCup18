package com.example.najo.fifaworldcup18.Classes;

import java.util.ArrayList;

public class Fixtures {

    public class fixtures{
        public class links{
            public class awayTeam{
                String href;

                public awayTeam(String href) {
                    this.href = href;
                }

                public String getHref() {
                    return href;
                }

                public void setHref(String href) {
                    this.href = href;
                }
            }
            public class homeTeam{
                String href;

                public homeTeam(String href) {
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
        String date;
        String status;
        String matchday;
        String homeTeamName;
        String awayTeamName;
        public class results{
            int goalsHomeTeam;
            int goalsAwayTeam;

            public results(int goalsHomeTeam, int goalsAwayTeam) {
                this.goalsHomeTeam = goalsHomeTeam;
                this.goalsAwayTeam = goalsAwayTeam;
            }

            public int getGoalsHomeTeam() {
                return goalsHomeTeam;
            }

            public void setGoalsHomeTeam(int goalsHomeTeam) {
                this.goalsHomeTeam = goalsHomeTeam;
            }

            public int getGoalsAwayTeam() {
                return goalsAwayTeam;
            }

            public void setGoalsAwayTeam(int goalsAwayTeam) {
                this.goalsAwayTeam = goalsAwayTeam;
            }
        }

        public fixtures(String date, String status, String matchday, String homeTeamName, String awayTeamName) {
            this.date = date;
            this.status = status;
            this.matchday = matchday;
            this.homeTeamName = homeTeamName;
            this.awayTeamName = awayTeamName;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getMatchday() {
            return matchday;
        }

        public void setMatchday(String matchday) {
            this.matchday = matchday;
        }

        public String getHomeTeamName() {
            return homeTeamName;
        }

        public void setHomeTeamName(String homeTeamName) {
            this.homeTeamName = homeTeamName;
        }

        public String getAwayTeamName() {
            return awayTeamName;
        }

        public void setAwayTeamName(String awayTeamName) {
            this.awayTeamName = awayTeamName;
        }


    }

    ArrayList<fixtures> fixturesArrayList;
    int count;

    public Fixtures(ArrayList<fixtures> fixturesArrayList, int count) {
        this.fixturesArrayList = fixturesArrayList;
        this.count = count;
    }

    public ArrayList<fixtures> getFixturesArrayList() {
        return fixturesArrayList;
    }

    public void setFixturesArrayList(ArrayList<fixtures> fixturesArrayList) {
        this.fixturesArrayList = fixturesArrayList;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

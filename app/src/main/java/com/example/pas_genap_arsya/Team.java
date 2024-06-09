package com.example.pas_genap_arsya;

import com.google.gson.annotations.SerializedName;

public class Team {
    private String idTeam;
    private String strTeam;

    @SerializedName("strTeamBadge")
    private String strTeamBadge;

    public String getStrStadium() {
        return strStadium;
    }

    public void setStrStadium(String strStadium) {
        this.strStadium = strStadium;
    }

    @SerializedName("strStadium")
    private String strStadium;

    public String getStrTeamBadge() {
        return strTeamBadge;
    }

    public void setStrTeamBadge(String strTeamBadge) {
        this.strTeamBadge = strTeamBadge;
    }

    public String getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(String idTeam) {
        this.idTeam = idTeam;
    }

    public String getStrTeam() {
        return strTeam;
    }

    public void setStrTeam(String strTeam) {
        this.strTeam = strTeam;
    }
}

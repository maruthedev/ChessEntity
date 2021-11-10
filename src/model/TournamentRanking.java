package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tbltournamentranking")
public class TournamentRanking implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "scope")
    private String scope;

    @ManyToOne
    @JoinColumn(name = "idRankingTable")
    private RankingTable rankingTable;

    @OneToOne
    @JoinColumn(name = "idTournament")
    private Tournament tournament;

    public TournamentRanking(){}

    public TournamentRanking(String scope){
        this.scope = scope;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public RankingTable getRankingTable() {
        return rankingTable;
    }

    public void setRankingTable(RankingTable rankingTable) {
        this.rankingTable = rankingTable;
    }

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }
}

package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tblplayerranking")
public class PlayerRanking implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "scope")
    private String scope;

    @OneToOne
    @JoinColumn(name = "idPlayer")
    private Player player;

    @ManyToOne
    @JoinColumn(name = "idRankingTable")
    private RankingTable rankingTable;

    public PlayerRanking(){}

    public PlayerRanking(String scope){
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

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public RankingTable getRankingTable() {
        return rankingTable;
    }

    public void setRankingTable(RankingTable rankingTable) {
        this.rankingTable = rankingTable;
    }
}

package model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tblrankingtable")
public class RankingTable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "scope")
    private String scope;

    @Column(name = "lastestUpdate")
    private LocalDateTime lastestUpdate;

    @OneToMany(mappedBy = "rankingTable", cascade = CascadeType.ALL)
    private List<PlayerRanking> listPlayerRanking;

    @OneToMany(mappedBy = "rankingTable",cascade = CascadeType.ALL)
    private List<TournamentRanking> listTournamentRanking;

    public RankingTable() {
    }

    public RankingTable(String scope, LocalDateTime lastestUpdate) {
        this.scope = scope;
        this.lastestUpdate = lastestUpdate;
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

    public LocalDateTime getLastestUpdate() {
        return lastestUpdate;
    }

    public void setLastestUpdate(LocalDateTime lastestUpdate) {
        this.lastestUpdate = lastestUpdate;
    }

    public List<PlayerRanking> getListPlayerRanking() {
        return listPlayerRanking;
    }

    public void setListPlayerRanking(List<PlayerRanking> listPlayerRanking) {
        this.listPlayerRanking = listPlayerRanking;
    }

    public List<TournamentRanking> getListTournamentRanking() {
        return listTournamentRanking;
    }

    public void setListTournamentRanking(List<TournamentRanking> listTournamentRanking) {
        this.listTournamentRanking = listTournamentRanking;
    }
}

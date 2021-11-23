package model;

import org.hibernate.Session;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tblbefriend")

public class BeFriend implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "intimacy")
    private int intimacy;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "idplayer")
    private Player player;

    @ManyToOne
    @JoinColumn(name = "idplayer1")
    public Player player1;

    public BeFriend() {
    }

    public BeFriend(int intimacy) {
        this.intimacy = intimacy;
    }

    public BeFriend(int inti, String stt, Player player, Player other) {
        this.intimacy = inti;
        this.status = stt;
        this.player = player;
        this.player1 = other;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIntimacy() {
        return intimacy;
    }

    public void setIntimacy(int intimacy) {
        this.intimacy = intimacy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer() {
        return player;
    }

    public Player getPlayer1() {
        return player1;
    }
}

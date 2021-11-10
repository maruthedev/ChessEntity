package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tblroom")
public class Room implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "status")
    private String status;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    private List<PlayerInRoom> listPlayerInRoom;

    @OneToOne(mappedBy = "room", cascade = CascadeType.ALL)
    private Match match;

    @ManyToOne
    @JoinColumn(name = "idTournament")
    private Tournament tournament;

    public Room() {
    }

    public Room(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<PlayerInRoom> getListPlayerInRoom() {
        return listPlayerInRoom;
    }

    public void setListPlayerInRoom(List<PlayerInRoom> listPlayerInRoom) {
        this.listPlayerInRoom = listPlayerInRoom;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }
}

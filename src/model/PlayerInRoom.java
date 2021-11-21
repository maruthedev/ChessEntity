package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tblplayerinroom")
public class PlayerInRoom implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name ="role")
    private String role;

    @OneToOne
    @JoinColumn(name = "idPlayer")
    private Player player;

    @ManyToOne
    @JoinColumn(name = "idRoom")
    private Room room;
    
    public PlayerInRoom() {
    }

    public PlayerInRoom(String role, Player player, Room room) {
        this.role = role;
        this.player = player;
        this.room = room;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tblplayer")
public class Player implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "status")
    private String status;

    @Column(name = "wins")
    private int wins;

    @Column(name = "loses")
    private int loses;

    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL)
    private List<BeFriend> listBeFriend;

    @OneToMany(mappedBy = "player1", cascade = CascadeType.ALL)
    private List<BeFriend> listBeFriend1;

    @ManyToOne
    @JoinColumn(name = "idMatch")
    private Match match;

    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL)
    private List<ParticipateATournament> listParticipateATournament;

    @ManyToOne
    @JoinColumn(name = "idGroup")
    private Group group;

    public Player() {
    }

    public Player(String username, String password) {
        this.username = username;
        this.password = password;
        this.status = "";
        this.wins = 0;
        this.loses = 0;
    }

    public Player(String username, String password, String status, int wins, int loses) {
        this.username = username;
        this.password = password;
        this.status = status;
        this.wins = wins;
        this.loses = loses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public List<BeFriend> getListBeFriend() {
        return listBeFriend;
    }

    public void setListBeFriend(List<BeFriend> listBeFriend) {
        this.listBeFriend = listBeFriend;
    }

    public List<BeFriend> getListBeFriend1() {
        return listBeFriend1;
    }

    public void setListBeFriend1(List<BeFriend> listBeFriend1) {
        this.listBeFriend1 = listBeFriend1;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public List<ParticipateATournament> getListParticipateATournament() {
        return listParticipateATournament;
    }

    public void setListParticipateATournament(List<ParticipateATournament> listParticipateATournament) {
        this.listParticipateATournament = listParticipateATournament;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}

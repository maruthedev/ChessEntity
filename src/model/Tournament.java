package model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tbltournament")
public class Tournament implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "registrationTimeTo")
    private LocalDateTime registrationTimeTo;

    @Column(name = "startTime")
    private LocalDateTime startTime;

    @Column(name = "endTime")
    private LocalDateTime endTime;

    @OneToMany(mappedBy = "tournament", cascade = CascadeType.ALL)
    private List<ParticipateATournament> listParticipateATournament;

    @OneToMany(mappedBy = "tournament", cascade = CascadeType.ALL)
    private List<Room> listRoom;

    @OneToOne(mappedBy = "tournament", cascade = CascadeType.ALL)
    private TournamentRanking tournamentRanking;

    public Tournament(){}

    public Tournament(String name, LocalDateTime registrationTimeTo, LocalDateTime startTime, LocalDateTime endTime){
        this.name = name;
        this.registrationTimeTo = registrationTimeTo;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getRegistrationTimeTo() {
        return registrationTimeTo;
    }

    public void setRegistrationTimeTo(LocalDateTime registrationTimeTo) {
        this.registrationTimeTo = registrationTimeTo;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public List<ParticipateATournament> getListParticipateATournament() {
        return listParticipateATournament;
    }

    public void setListParticipateATournament(List<ParticipateATournament> listParticipateATournament) {
        this.listParticipateATournament = listParticipateATournament;
    }

    public List<Room> getListRoom() {
        return listRoom;
    }

    public void setListRoom(List<Room> listRoom) {
        this.listRoom = listRoom;
    }

    public TournamentRanking getTournamentRanking() {
        return tournamentRanking;
    }

    public void setTournamentRanking(TournamentRanking tournamentRanking) {
        this.tournamentRanking = tournamentRanking;
    }
}

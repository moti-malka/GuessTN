package guessthenumbers.spring;

import javax.persistence.*;

@Entity
@Table(name = "games")
public class Games {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "idgeames")
    private Integer idgeames;

    @Column(name = "player")
    private String Player;

    @Column(name = "gusses")
    private Integer guesses;

    private String pass;


    private Integer currentGuess;

    public void setGuesses(Integer guesses) {
        this.guesses = guesses;
    }

    public Integer getCurrentGuess() {
        return currentGuess;
    }

    public void setCurrentGuess(Integer currentGuess) {
        this.currentGuess = currentGuess;
    }


    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Integer getGuesses() {
        return guesses;
    }

    public Integer getIdgeames() {
        return idgeames;
    }

    public void setIdgeames(Integer idgeames) {
        this.idgeames = idgeames;
    }



    public String  getPlayer() {
        return Player;
    }

    public void setPlayer(String player) {
        Player = player;
    }

    public void setGuesses(int guesses) {
        this.guesses = guesses;
    }

    @Override
    public String toString() {
        return "Games{" +
                "idgeames=" + idgeames +
                ", Player='" + Player + '\'' +
                ", guesses=" + guesses +
                ", pass='" + pass + '\'' +
                ", currentGuess=" + currentGuess +
                '}';
    }
}

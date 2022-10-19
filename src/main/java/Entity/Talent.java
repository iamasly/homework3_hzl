package Entity;

import javax.persistence.*;

@Entity
public class Talent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tlt_id;
    private String tlt_name;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="pp_id")
    private People tlt_pp;

    public People getTlt_pp() {
        return tlt_pp;
    }

    public void setTlt_pp(People tlt_pp) {
        this.tlt_pp = tlt_pp;
    }

    public Long getTlt_id() {
        return tlt_id;
    }

    public void setTlt_id(Long tlt_id) {
        this.tlt_id = tlt_id;
    }

    public String getTlt_name() {
        return tlt_name;
    }

    public void setTlt_name(String tlt_name) {
        this.tlt_name = tlt_name;
    }
}

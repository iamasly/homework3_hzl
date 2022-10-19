package Entity;

import javax.persistence.*;

@Entity
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long gds_id;
    private Integer gds_weight;
    private String gds_name;
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="pp_id")
    private People gds_pp;

    public People getGds_pp() {
        return gds_pp;
    }

    public void setGds_pp(People gds_pp) {
        this.gds_pp = gds_pp;
    }

    public Long getGds_id() {
        return gds_id;
    }

    public void setGds_id(Long gds_id) {
        this.gds_id = gds_id;
    }

    public Integer getGds_weight() {
        return gds_weight;
    }

    public void setGds_weight(Integer gds_weight) {
        this.gds_weight = gds_weight;
    }

    public String getGds_name() {
        return gds_name;
    }

    public void setGds_name(String gds_name) {
        this.gds_name = gds_name;
    }
}

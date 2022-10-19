package Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class People {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pp_id;
    private String pp_name;
    private Integer pp_height;
    private Integer pp_weight;
    private Boolean pp_sex;
    private String pp_password;
    @OneToMany(mappedBy = "tlt_pp",cascade = CascadeType.ALL,fetch =FetchType.LAZY )
    private List<Goods> pp_gdsList;
    @OneToMany(mappedBy = "tlt_pp",cascade = CascadeType.ALL,fetch =FetchType.LAZY )
    private List<Talent> pp_tltList;

    public List<Goods> getPp_gdsList() {
        return pp_gdsList;
    }

    public void setPp_gdsList(List<Goods> pp_gdsList) {
        this.pp_gdsList = pp_gdsList;
    }

    public List<Talent> getPp_tltList() {
        return pp_tltList;
    }

    public void setPp_tltList(List<Talent> pp_tltList) {
        this.pp_tltList = pp_tltList;
    }

    public Boolean getPp_sex() {
        return pp_sex;
    }

    public void setPp_sex(Boolean pp_sex) {
        this.pp_sex = pp_sex;
    }

    public Long getPp_id() {
        return pp_id;
    }

    public void setPp_id(Long pp_id) {
        this.pp_id = pp_id;
    }

    public String getPp_name() {
        return pp_name;
    }

    public void setPp_name(String pp_name) {
        this.pp_name = pp_name;
    }

    public Integer getPp_height() {
        return pp_height;
    }

    public void setPp_height(Integer pp_height) {
        this.pp_height = pp_height;
    }

    public Integer getPp_weight() {
        return pp_weight;
    }

    public void setPp_weight(Integer pp_weight) {
        this.pp_weight = pp_weight;
    }

    public String getPp_password() {
        return pp_password;
    }

    public void setPp_password(String pp_password) {
        this.pp_password = pp_password;
    }

}

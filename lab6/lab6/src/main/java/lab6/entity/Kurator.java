package lab6.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "kurator", schema = "public")
public class Kurator extends AbstractEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phone;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "kurator")
    private List<Group> groups;

    @Override
    public String toString() {
        return "kurator [name=" + name + ", phone=" + phone + ", groups=" + groups + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;

    }

}

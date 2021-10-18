package org.acme.messaging;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
public class Message extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @Lob
    private String value;

    public void setValue(String text) {
        this.value = text;
    }

    public String getValue() {
        return value;
    }
}

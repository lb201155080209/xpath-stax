package org.polyglotted.xpathstax.bind;

import java.util.List;
import java.util.Set;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "book")
public class Book {

    @XmlAttribute
    private String id;

    @XmlElement(name = "author")
    private String authorName;

    @XmlElement
    private String title;

    @XmlElement
    private double price;

    @XmlElement(name = "type")
    private Set<String> types;

    @XmlElement(name = "description")
    private Desc description;
    
    @XmlElement(name = "revision")
    private List<Revision> revisions;

    public String getAuthor() {
        return authorName;
    }

    public void setAuthor(String author) {
        this.authorName = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Revision> getRevisions() {
        return revisions;
    }

    public void setRevisions(List<Revision> revisions) {
        this.revisions = revisions;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setTypes(Set<String> types) {
        this.types = types;
    }

    public Set<String> getTypes() {
        return types;
    }

    public void setDescription(Desc description) {
        this.description = description;
    }

    public Desc getDescription() {
        return description;
    }
}

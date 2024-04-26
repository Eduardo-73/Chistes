/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
    "error",
    "category",
    "type",
    "setup",
    "delivery",
    "flags",
    "safe",
    "id",
    "lang"
})

public class Joke {

    @JsonProperty("error")
    private Boolean error;
    @JsonProperty("category")
    private String category;
    @JsonProperty("type")
    private String type;
    @JsonProperty("joke")
    private String setup;
    @JsonProperty("delivery")
    private String delivery;
    @JsonProperty("flags")
    private Flags flags;
    @JsonProperty("safe")
    private Boolean safe;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("lang")
    private String lang;

    /**
     * No args constructor for use in serialization
     *
     */
    public Joke() {
    }

    /**
     *
     * @param delivery
     * @param flags
     * @param safe
     * @param setup
     * @param id
     * @param error
     * @param category
     * @param type
     * @param lang
     */
    public Joke(Boolean error, String category, String type, String setup, String delivery, Flags flags, Boolean safe, Integer id, String lang) {
        super();
        this.error = error;
        this.category = category;
        this.type = type;
        this.setup = setup;
        this.delivery = delivery;
        this.flags = flags;
        this.safe = safe;
        this.id = id;
        this.lang = lang;
    }

    @JsonProperty("error")
    public Boolean getError() {
        return error;
    }

    @JsonProperty("error")
    public void setError(Boolean error) {
        this.error = error;
    }

    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("setup")
    public String getSetup() {
        return setup;
    }

    @JsonProperty("setup")
    public void setSetup(String setup) {
        this.setup = setup;
    }

    @JsonProperty("delivery")
    public String getDelivery() {
        return delivery;
    }

    @JsonProperty("delivery")
    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    @JsonProperty("flags")
    public Flags getFlags() {
        return flags;
    }

    @JsonProperty("flags")
    public void setFlags(Flags flags) {
        this.flags = flags;
    }

    @JsonProperty("safe")
    public Boolean getSafe() {
        return safe;
    }

    @JsonProperty("safe")
    public void setSafe(Boolean safe) {
        this.safe = safe;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    @Override
    public String toString() {
        return "Chiste{" + "error=" + error + ", category=" + category + ", type=" + type + ", setup=" + setup + ", delivery=" + delivery + ", flags=" + flags + ", safe=" + safe + ", id=" + id + ", lang=" + lang + '}';
    }
    
    

}

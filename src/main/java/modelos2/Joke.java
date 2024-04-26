
package modelos2;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonPropertyOrder({
    "category",
    "type",
    "setup",
    "delivery",
    "flags",
    "safe",
    "id",
    "lang",
    "joke"
})

public class Joke {

    @JsonProperty("category")
    private String category;
    @JsonProperty("type")
    private String type;
    @JsonProperty("setup")
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
    @JsonProperty("joke")
    private String joke;

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
     * @param category
     * @param type
     * @param lang
     * @param joke
     */
    public Joke(String category, String type, String setup, String delivery, Flags flags, Boolean safe, Integer id, String lang, String joke) {
        super();
        this.category = category;
        this.type = type;
        this.setup = setup;
        this.delivery = delivery;
        this.flags = flags;
        this.safe = safe;
        this.id = id;
        this.lang = lang;
        this.joke = joke;
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

    @JsonProperty("joke")
    public String getJoke() {
        return joke;
    }

    @JsonProperty("joke")
    public void setJoke(String joke) {
        this.joke = joke;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Joke{");
        sb.append("category=").append(category);
        sb.append(", type=").append(type);
        sb.append(", setup=").append(setup);
        sb.append(", delivery=").append(delivery);
        sb.append(", flags=").append(flags);
        sb.append(", safe=").append(safe);
        sb.append(", id=").append(id);
        sb.append(", lang=").append(lang);
        sb.append(", joke=").append(joke);
        sb.append('}');
        return sb.toString();
    }

}

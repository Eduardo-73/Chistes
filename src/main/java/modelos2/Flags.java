
package modelos2;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
    "nsfw",
    "religious",
    "political",
    "racist",
    "sexist",
    "explicit"
})

public class Flags {

    @JsonProperty("nsfw")
    private Boolean nsfw;
    @JsonProperty("religious")
    private Boolean religious;
    @JsonProperty("political")
    private Boolean political;
    @JsonProperty("racist")
    private Boolean racist;
    @JsonProperty("sexist")
    private Boolean sexist;
    @JsonProperty("explicit")
    private Boolean explicit;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Flags() {
    }

    /**
     * 
     * @param sexist
     * @param explicit
     * @param religious
     * @param nsfw
     * @param political
     * @param racist
     */
    public Flags(Boolean nsfw, Boolean religious, Boolean political, Boolean racist, Boolean sexist, Boolean explicit) {
        super();
        this.nsfw = nsfw;
        this.religious = religious;
        this.political = political;
        this.racist = racist;
        this.sexist = sexist;
        this.explicit = explicit;
    }

    @JsonProperty("nsfw")
    public Boolean getNsfw() {
        return nsfw;
    }

    @JsonProperty("nsfw")
    public void setNsfw(Boolean nsfw) {
        this.nsfw = nsfw;
    }

    @JsonProperty("religious")
    public Boolean getReligious() {
        return religious;
    }

    @JsonProperty("religious")
    public void setReligious(Boolean religious) {
        this.religious = religious;
    }

    @JsonProperty("political")
    public Boolean getPolitical() {
        return political;
    }

    @JsonProperty("political")
    public void setPolitical(Boolean political) {
        this.political = political;
    }

    @JsonProperty("racist")
    public Boolean getRacist() {
        return racist;
    }

    @JsonProperty("racist")
    public void setRacist(Boolean racist) {
        this.racist = racist;
    }

    @JsonProperty("sexist")
    public Boolean getSexist() {
        return sexist;
    }

    @JsonProperty("sexist")
    public void setSexist(Boolean sexist) {
        this.sexist = sexist;
    }

    @JsonProperty("explicit")
    public Boolean getExplicit() {
        return explicit;
    }

    @JsonProperty("explicit")
    public void setExplicit(Boolean explicit) {
        this.explicit = explicit;
    }

}

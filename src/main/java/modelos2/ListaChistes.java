
package modelos2;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonPropertyOrder({
    "error",
    "amount",
    "jokes"
})

public class ListaChistes {

    @JsonProperty("error")
    private Boolean error;
    @JsonProperty("amount")
    private Integer amount;
    @JsonProperty("jokes")
    private List<Joke> jokes = new ArrayList<Joke>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ListaChistes() {
    }

    /**
     * 
     * @param amount
     * @param error
     * @param jokes
     */
    public ListaChistes(Boolean error, Integer amount, List<Joke> jokes) {
        super();
        this.error = error;
        this.amount = amount;
        this.jokes = jokes;
    }

    @JsonProperty("error")
    public Boolean getError() {
        return error;
    }

    @JsonProperty("error")
    public void setError(Boolean error) {
        this.error = error;
    }

    @JsonProperty("amount")
    public Integer getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @JsonProperty("jokes")
    public List<Joke> getJokes() {
        return jokes;
    }

    @JsonProperty("jokes")
    public void setJokes(List<Joke> jokes) {
        this.jokes = jokes;
    }

}

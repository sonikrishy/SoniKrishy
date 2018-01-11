
package com.Soniya;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "whoa",
    "anarray",
    "more"
})
public class Anobject {

    @JsonProperty("whoa")
    private String whoa;
    @JsonProperty("anarray")
    private List<String> anarray = null;
    @JsonProperty("more")
    private String more;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("whoa")
    public String getWhoa() {
        return whoa;
    }

    @JsonProperty("whoa")
    public void setWhoa(String whoa) {
        this.whoa = whoa;
    }

    @JsonProperty("anarray")
    public List<String> getAnarray() {
        return anarray;
    }

    @JsonProperty("anarray")
    public void setAnarray(List<String> anarray) {
        this.anarray = anarray;
    }

    @JsonProperty("more")
    public String getMore() {
        return more;
    }

    @JsonProperty("more")
    public void setMore(String more) {
        this.more = more;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

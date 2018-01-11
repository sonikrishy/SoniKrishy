
package com.Soniya;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "hey",
    "anumber",
    "anobject",
    "awesome",
    "bogus",
    "meaning",
    "japanese",
    "link",
    "notLink"
})
public class JSONViewResponse3 {

    @JsonProperty("hey")
    private String hey;
    @JsonProperty("anumber")
    private int anumber;
    @JsonProperty("anobject")
    private Anobject anobject;
    @JsonProperty("awesome")
    private boolean awesome;
    @JsonProperty("bogus")
    private boolean bogus;
    @JsonProperty("meaning")
    private Object meaning;
    @JsonProperty("japanese")
    private String japanese;
    @JsonProperty("link")
    private String link;
    @JsonProperty("notLink")
    private String notLink;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("hey")
    public String getHey() {
        return hey;
    }

    @JsonProperty("hey")
    public void setHey(String hey) {
        this.hey = hey;
    }

    @JsonProperty("anumber")
    public int getAnumber() {
        return anumber;
    }

    @JsonProperty("anumber")
    public void setAnumber(int anumber) {
        this.anumber = anumber;
    }

    @JsonProperty("anobject")
    public Anobject getAnobject() {
        return anobject;
    }

    @JsonProperty("anobject")
    public void setAnobject(Anobject anobject) {
        this.anobject = anobject;
    }

    @JsonProperty("awesome")
    public boolean isAwesome() {
        return awesome;
    }

    @JsonProperty("awesome")
    public void setAwesome(boolean awesome) {
        this.awesome = awesome;
    }

    @JsonProperty("bogus")
    public boolean isBogus() {
        return bogus;
    }

    @JsonProperty("bogus")
    public void setBogus(boolean bogus) {
        this.bogus = bogus;
    }

    @JsonProperty("meaning")
    public Object getMeaning() {
        return meaning;
    }

    @JsonProperty("meaning")
    public void setMeaning(Object meaning) {
        this.meaning = meaning;
    }

    @JsonProperty("japanese")
    public String getJapanese() {
        return japanese;
    }

    @JsonProperty("japanese")
    public void setJapanese(String japanese) {
        this.japanese = japanese;
    }

    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }

    @JsonProperty("notLink")
    public String getNotLink() {
        return notLink;
    }

    @JsonProperty("notLink")
    public void setNotLink(String notLink) {
        this.notLink = notLink;
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

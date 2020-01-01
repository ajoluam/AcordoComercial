
package com.acordocomercial.api.entity;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "data"
})
public class AcordoComercialForm {

    @JsonProperty("data")
    private List<Input> data = new ArrayList<Input>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public AcordoComercialForm() {
    }

    /**
     * 
     * @param data
     */
    public AcordoComercialForm(List<Input> data) {
        super();
        this.data = data;
    }

    @JsonProperty("data")
    public List<Input> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<Input> data) {
        this.data = data;
    }

}

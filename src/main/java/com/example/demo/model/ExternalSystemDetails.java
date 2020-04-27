package com.example.demo.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ExternalSystemDetails {

  @JsonProperty("externalID")
  private String externalID;

  @JsonProperty("extSourceID")
  private String extSourceID;

  @JsonProperty("extSourceName")
  private String extSourceName;

  public ExternalSystemDetails() {
  }

  public ExternalSystemDetails(String externalID, String extSourceID, String extSourceName) {
    this.externalID = externalID;
    this.extSourceID = extSourceID;
    this.extSourceName = extSourceName;
  }

  public ExternalSystemDetails extSourceId(String sourceId) {
    this.extSourceID = sourceId;
    return this;
  }

  public ExternalSystemDetails extSourceName(String sourceName) {
    this.extSourceName = sourceName;
    return this;
  }  

  public String getExternalID() {
	  return externalID;
  }

  public void setExternalID(String externalID) {
	  this.externalID = externalID;
  }

  public String getExtSourceID() {
	  return extSourceID;
  }

  public void setExtSourceID(String extSourceID) {
	  this.extSourceID = extSourceID;
  }

  public String getExtSourceName() {
	  return extSourceName;
  }

  public void setExtSourceName(String extSourceName) {
	  this.extSourceName = extSourceName;
  }

@Override
  public int hashCode() {
    return Objects.hash(externalID, extSourceID, extSourceName);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof ExternalSystemDetails)) {
      return false;
    }

    ExternalSystemDetails other = (ExternalSystemDetails) obj;
    return Objects.equals(this.externalID, other.externalID)
        && Objects.equals(this.extSourceID, other.extSourceID) && Objects.equals(this.extSourceName, other.extSourceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalSystemDetails {\n");

    sb.append("    referenceId: ").append(toIndentedString(externalID)).append("\n");
    sb.append("    extSourceID: ").append(toIndentedString(extSourceID)).append("\n");
    sb.append("    extSourceName: ").append(toIndentedString(extSourceName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

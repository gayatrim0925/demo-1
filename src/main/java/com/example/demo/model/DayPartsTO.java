package com.example.demo.model;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DayPartsTO {

	@JsonProperty("id")	
	private String id = null;

	@JsonProperty("name")
	private String name = null;
	
	@JsonProperty("externalSourceSystems")
	private List<ExternalSystemDetails> externalSourceSystems = null;

	@JsonProperty("shortName")
	private String shortName = null;

	@JsonProperty("order")
	private Integer order = null;

	@JsonProperty("seqId")
	private Integer seqId = null;

	public DayPartsTO() {

	}

	public DayPartsTO id(String id) {
		this.id = id;
		return this;
	}

	public DayPartsTO seqId(int seqId) {
		this.seqId = seqId;
		return this;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public Integer getSeqId() {
		return seqId;
	}

	public void setSeqId(Integer seqId) {
		this.seqId = seqId;
	}	

	public List<ExternalSystemDetails> getExternalSourceSystems() {
		return externalSourceSystems;
	}

	public void setExternalSourceSystems(List<ExternalSystemDetails> externalSourceSystems) {
		this.externalSourceSystems = externalSourceSystems;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DayPartsTO dayPartsTO = (DayPartsTO) o;
		return Objects.equals(this.id, dayPartsTO.id) && Objects.equals(this.name, dayPartsTO.name)
				&& Objects.equals(this.shortName, dayPartsTO.shortName) && Objects.equals(this.order, dayPartsTO.order)
				&& Objects.equals(this.seqId, dayPartsTO.seqId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, shortName, order, seqId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DayPartsTO {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
		sb.append("    order: ").append(toIndentedString(order)).append("\n");
		sb.append("    seqId: ").append(toIndentedString(seqId)).append("\n");
		sb.append("    externalSourceSystems: ").append(toIndentedString(externalSourceSystems)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}

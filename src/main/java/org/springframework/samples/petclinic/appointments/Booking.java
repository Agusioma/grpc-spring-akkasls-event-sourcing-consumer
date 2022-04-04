package org.springframework.samples.petclinic.appointments;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"appointmentId",
	"appointmentTime",
	"appointmentDate",
	"appointmentDesc",
	"vetId"
})
@Generated("jsonschema2pojo")
public class Booking {

	@JsonProperty("appointmentId")
	private String appointmentId;
	@JsonProperty("appointmentTime")
	private String appointmentTime;
	@JsonProperty("appointmentDate")
	private String appointmentDate;
	@JsonProperty("appointmentDesc")
	private String appointmentDesc;
	@JsonProperty("vetId")
	private String vetId;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("appointmentId")
	public String getAppointmentId() {
		return appointmentId;
	}

	@JsonProperty("appointmentId")
	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}

	@JsonProperty("appointmentTime")
	public String getAppointmentTime() {
		return appointmentTime;
	}

	@JsonProperty("appointmentTime")
	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	@JsonProperty("appointmentDate")
	public String getAppointmentDate() {
		return appointmentDate;
	}

	@JsonProperty("appointmentDate")
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	@JsonProperty("appointmentDesc")
	public String getAppointmentDesc() {
		return appointmentDesc;
	}

	@JsonProperty("appointmentDesc")
	public void setAppointmentDesc(String appointmentDesc) {
		this.appointmentDesc = appointmentDesc;
	}

	@JsonProperty("vetId")
	public String getVetId() {
		return vetId;
	}

	@JsonProperty("vetId")
	public void setVetId(String vetId) {
		this.vetId = vetId;
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

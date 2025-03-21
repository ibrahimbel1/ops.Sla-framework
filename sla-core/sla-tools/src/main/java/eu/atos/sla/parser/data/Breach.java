package eu.atos.sla.parser.data;

import java.util.Date;

import javax.persistence.Column;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import eu.atos.sla.parser.DateTimeDeserializerJSON;
import eu.atos.sla.parser.DateTimeSerializerJSON;


/**
 * A POJO Object that stores all the information from a Breach
 * 
 * @author Pedro Rey - Atos
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "breach")
public class Breach {


	@XmlElement(name = "id")
	private Long id;
	@XmlElement(name = "contract-uuid")
	private String contractUUID;
	@XmlElement(name = "violation")
	private Violation violation;
	@JsonSerialize(using=DateTimeSerializerJSON.class)
	@JsonDeserialize(using=DateTimeDeserializerJSON.class)
	@XmlElement(name = "datetime")
	private Date datetime;
	@XmlElement(name = "metric-name")
	private String metricName;
	@XmlElement(name = "value")
	private String value;

	public Breach() {
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "contract_uuid")
	public String getContractUUID() {
		return contractUUID;
	}

	public void setContractUUID(String contractUUID) {
		this.contractUUID = contractUUID;
	}

	
	public Violation getViolation() {
		return violation;
	}

	public void setViolation(Violation violation) {
		this.violation = violation;
	}


	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public String getMetricName() {
		return metricName;
	}

	public void setMetricName(String metricName) {
		this.metricName = metricName;
	}


	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}

package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class MuseDevDAO {

	private Long version;

	private Boolean applicable;

	private List<EvaluatedStrings> evaluatedStrings;

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Boolean getApplicable() {
		return applicable;
	}

	public void setApplicable(Boolean applicable) {
		this.applicable = applicable;
	}

	public List<EvaluatedStrings> getEvaluatedStrings() {
		return evaluatedStrings;
	}

	public void setEvaluatedStrings(List<EvaluatedStrings> evaluatedStrings) {
		this.evaluatedStrings = evaluatedStrings;
	}

	@Override
	public String toString() {
		try {
			return new com.fasterxml.jackson.databind.ObjectMapper().writerWithDefaultPrettyPrinter()
					.writeValueAsString(this);
		} catch (com.fasterxml.jackson.core.JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}
}

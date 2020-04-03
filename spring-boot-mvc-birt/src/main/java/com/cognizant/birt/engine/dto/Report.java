package com.cognizant.birt.engine.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Report DTO class
 */
@Data
@NoArgsConstructor
public class Report {
	private String title;
    private String name;
    private List<Parameter> parameters;
    
    public Report(String title, String name) {
        this.title = title;
        this.name = name;
    }
    
    
    public String getTitle() {
		return title;
	}

	public String getName() {
		return name;
	}

	public List<Parameter> getParameters() {
		return parameters;
	}


	@Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Parameter {
        private String title;
        private String name;
        private ParameterType type;
		public String getTitle() {
			return title;
		}
		public String getName() {
			return name;
		}
		public ParameterType getType() {
			return type;
		}
		public Parameter(String title, String name, ParameterType type) {
			super();
			this.title = title;
			this.name = name;
			this.type = type;
		}
		
        
    }
    
    public enum ParameterType {
        INT, STRING
    }
    
}

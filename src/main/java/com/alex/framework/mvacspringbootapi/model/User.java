package com.alex.framework.mvacspringbootapi.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.AllArgsConstructor;
// Importing class
import lombok.Data;
import lombok.NoArgsConstructor;

// Annotation
@Data
@AllArgsConstructor
@NoArgsConstructor
// Class
public class User {

	String id;
	String name;
	String data;
}

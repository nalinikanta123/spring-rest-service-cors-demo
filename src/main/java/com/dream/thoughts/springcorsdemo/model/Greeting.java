package com.dream.thoughts.springcorsdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Greeting {

	private long id;
	private String content;

}

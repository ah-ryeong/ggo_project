package com.cos.ggo.model;

import lombok.Builder;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Board {
	private int id;
	private int memberId;
	private String title;
	private String content;
	private Timestamp createDate;
}

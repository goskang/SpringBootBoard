package com.gos.board.model;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Builder @Data
public class BoardModel {
	@NonNull private String title;
	private String content;
	private int price;
}

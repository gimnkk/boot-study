package com.mino.api.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Table(name = "api_history")
public class ApiHistoryEntity {

	@Id
	@Column(name = "seq")
	@Min(1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long seq;

	@Column(name = "history_key")
	@NotNull
	@NotBlank
	private String historyKey;

	@Column(name = "req_date")
	private LocalDateTime reqDate;

	@Column(name = "data")
	private String data;

	@Column(name = "status")
	private String status;

	@Column(name = "expire_date")
	private LocalDateTime expireDate;

}

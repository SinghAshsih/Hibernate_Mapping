package com.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	@Column(name = "Answer_Id")
	private int answerId;
	@OneToOne
	private Question question;

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Answer() {
		super();
	}

	public Answer(int answerId, String answer) {
		super();
		this.answerId = answerId;
		this.answer = answer;
	}

	public int getAnswerId() {
		return answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	private String answer;

}

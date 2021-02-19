package com.assignmentQ2;

public class Questions {
	
	private int QuesNo;
	private String Question;
	private String Answer;
	public int getQuesNo() {
		return QuesNo;
	}
	public void setQuesNo(int quesNo) {
		QuesNo = quesNo;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public String getAnswer() {
		return Answer;
	}
	public void setAnswer(String answer) {
		Answer = answer;
	}
	
	@Override
	public String toString() {
		return "Ques & Ans [QuesNo = " + QuesNo + ", Question = " + Question + ", Answer = "  + Answer + "]";
	}

}

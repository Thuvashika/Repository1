package com.learn.java.chapter7;
class NewFile{
	private final String fileName;
	private final String filePath;
	private String fileContent="";
	NewFile(String fileName, String filePath ){
		this.fileName=fileName;
		this.filePath=filePath;
	}
	public void getter() {
		System.out.println("File name:"+fileName);
		System.out.println("File path:"+filePath);
	}
	public void writeContent(String s) {
		fileContent+=s;
		System.out.println("Writing file...");
	}
	public void eraseContent() {
		fileContent="";
		System.out.println("Erasing file...");
	}
	public void display() {
		System.out.println("File Content:"+fileContent);
	}
}
public class NewFileCreation {
	public static void main(String[] args) {
		NewFile fileObj=new NewFile("Loan Documents", "C:\\home\\details\\LoanDocuments");
		
		//filObj.fileName="Loan details";    
		
		
		fileObj.getter();
		fileObj.writeContent("This file contains details about the washing machine");
		fileObj.display();
		fileObj.eraseContent();
		fileObj.writeContent("This file contains details about the sewing machine");
		fileObj.display();
		fileObj.writeContent("and it also contains details about washing machine");
		fileObj.display();
		NewFile newObj=new NewFile("Loan Details", "C:\\home\\bank\\details\\LoanDocuments");
		newObj.getter();
		newObj.display();
	}
}

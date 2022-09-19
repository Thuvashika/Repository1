package com.learn.java.chapter7;


class File{
	final String fileName;
	final String filePath;
	private static File instance = null;  
	private File(String fileName, String filePath ){
		this.fileName=fileName;
		this.filePath=filePath;
	}
	public static File getInstance(String fileName,String filePath)  {
		if(instance==null) {
			instance=new File(fileName,filePath);
		}
		return instance;
	}
	public void display() {
		System.out.println("File Name="+fileName);
		System.out.println("File Path="+filePath);
	}
}
public class FileCreation {
	public static void main(String[] args) {
		File obj=File.getInstance("Loan Documents", "C:\\home\\details\\LoanDocuments");
		obj.display();
		File obj1=File.getInstance("Loan Details", "C:\\home\\bank\\details\\LoanDocuments");
		//obj.fileName="Loan details";
		System.out.println(obj1.fileName);
		obj1.display();
	}
}
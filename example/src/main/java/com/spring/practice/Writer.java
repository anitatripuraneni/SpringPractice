package com.spring.practice;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Writer {
	
	/*@Autowired(required=false)
	private ConsoleWriter consoleWriter;*/
	//@Autowired
	//@Qualifier("toConsole")
	@Resource()
	private ConsoleWriter consoleWriter;
	/*@Autowired
	private FileWriter fileWriter;*/
	
	//@Autowired
	//@Qualifier("fileWriter")
	@Resource
	private LogWriter fileWriter;
	
	
	/*public Writer(ConsoleWriter consoleWriter,FileWriter fileWriter){
		this.consoleWriter = consoleWriter;
		this.fileWriter = fileWriter;
	}*/
	
	public ConsoleWriter getConsoleWriter() {
		return consoleWriter;
	}
	
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}
	/*public FileWriter getFileWriter() {
		return fileWriter;
	}
	*/
	/*public void setFileWriter(FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}*/
	
	public void writeConsole(String text){
		if(consoleWriter !=null){
		consoleWriter.write(text);
		}
	}
	
	
	
	public LogWriter getFileWriter() {
		return fileWriter;
	}

	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public void writeFile(String text){
		fileWriter.write(text);
	}
	@PostConstruct
	public void onCreate(){
		System.out.println("Writer created");
	}
@PreDestroy
	public void onDestroy(){
		System.out.println("Writer destoryed");
	}
	

}

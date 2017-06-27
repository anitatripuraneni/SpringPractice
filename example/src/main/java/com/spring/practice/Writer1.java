package com.spring.practice;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;
import org.springframework.stereotype.Component;

@Component
public class Writer1 {
	
	@Inject
	//@Named("consoleWriter")
	private ConsoleWriter consoleWriter;
	@Inject
	private LogWriter fileWriter;

	public void writeConsole(String text) {
		if (consoleWriter != null) {
			consoleWriter.write(text);
		}
	}

	public void writeFile(String text) {
		fileWriter.write(text);
	}

	public ConsoleWriter getConsoleWriter() {
		return consoleWriter;
	}

	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}

	public LogWriter getFileWriter() {
		return fileWriter;
	}

	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	@PostConstruct
	public void onCreate() {
		System.out.println("Writer created");
	}

	@PreDestroy
	public void onDestroy() {
		System.out.println("Writer destoryed");
	}
}

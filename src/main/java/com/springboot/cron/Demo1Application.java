package com.springboot.cron;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@SpringBootApplication
public class Demo1Application implements CommandLineRunner {
	private static final SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("Hello world from Command Line Runner");
	}

	//fixedDelayString, fixedRateString and initialDelayString
	//@Scheduled(cron = "${yourConfiguration.cronExpression}")
	
	//@Scheduled(fixedDelay = 5000, initialDelay = 1000)
	 @Scheduled(cron = "*/10 * * * * *")
	public void siva() {

		Timestamp timestamp = new Timestamp(System.currentTimeMillis());

		System.out.println(sdf1.format(timestamp));
	}
	 @Scheduled(fixedRateString = "${fixed-rate.in.milliseconds}")
	 public void fixedRate() {
	     // do something here
	 }

	 @Scheduled(fixedDelayString = "${fixed-delay.in.milliseconds}")
	 public void fixedDelay() {
	     // do something here
	 }

	 @Scheduled(cron = "${cron.expression}")
	 public void cronExpression() {
	     // do something here
	 }
	 

	 
}

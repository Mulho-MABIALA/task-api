package sn.isi.l3gl.api.task_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"sn.isi.l3gl.api", "sn.isi.l3gl.core"})
public class TaskApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(TaskApiApplication.class, args);
    }
}
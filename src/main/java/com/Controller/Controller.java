package com.Controller;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Controller {
 public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	System.out.println(emf);
}
}
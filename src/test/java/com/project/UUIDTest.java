package com.project;

import java.util.UUID;

import org.junit.Test;

import com.project.util.UUid;

public class UUIDTest {
	@Test
	public void uuid () {
		System.out.println(UUid.getId());
	}
	@Test
	public void uu () {
		System.out.println(UUID.randomUUID().toString());
	}
	
}

package com.verisure.integration.amqpadapter.launcher;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.verisure.integration.amqpadapter.Application;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Application.class)
@SpringBootTest( properties = "server.port=8080", classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@Ignore
public class LauncherTest {
}

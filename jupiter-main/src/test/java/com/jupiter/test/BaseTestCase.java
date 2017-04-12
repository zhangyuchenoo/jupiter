/**
 * 
 */
package com.jupiter.test;

import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jupiter.main.Main;

/**
 * @author zheng.zhang
 * 
 *         2017年4月12日
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Main.class)
public abstract class BaseTestCase {

}
